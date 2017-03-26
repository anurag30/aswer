<%@page session="false"%>
<%@ page import="com.day.cq.wcm.api.WCMMode,
                   com.day.cq.wcm.api.components.DropTarget,
                   com.day.cq.wcm.foundation.List,
                   java.util.Iterator"%><%
%><%@include file="/libs/foundation/global.jsp"%>
<%

    WCMMode mode = WCMMode.fromRequest(request);

    if (mode == WCMMode.EDIT) {
        //drop target css class = dd prefix + name of the drop target in the edit config
        String ddClassName = DropTarget.CSS_CLASS_PREFIX + "pages";
        %>
        <div class="<%= ddClassName %>">
        <div class="container">
			<div class="events mb-40">
				<h2>Center Parcs News!</h2>
				<div class="slides api_slider_container">
					<div class="slider-container">
						<ul class="row  api_slider hiddenLoad" inlineOptions="maxSlides:3;moveSlides:1;slideWidth:278px;slideMargin:14px;">	      
        <%
    }

    if (properties.get("feedEnabled", false)) {
        %><link rel="alternate" type="application/atom+xml" title="Atom 1.0 (List)" href="<%= resource.getPath() %>.feed" /><%
    }

    // initialize the list
    %>
    <cq:include script="init.jsp"/>
    <%
    List list = (List)request.getAttribute("list");
    if (!list.isEmpty()) {
        String cls = list.getType();
        cls = (cls == null) ? "" : cls.replaceAll("/", "");

        %><%= list.isOrdered() %> class="<%= xssAPI.encodeForHTML(cls) %>"><%
        Iterator<Page> items = list.getPages();
        String listItemClass = null;
        while (items.hasNext()) {
            request.setAttribute("listitem", items.next());

            if (null == listItemClass) {
                listItemClass = "first";
            } else if (!items.hasNext()) {
                listItemClass = "last";
            } else {
                listItemClass = "item";
            }
            request.setAttribute("listitemclass", " class=\"" + listItemClass + "\"");

            String script = "listitem_" + cls + ".jsp";
            %><cq:include script="<%= script %>"/><%
        }
        %><%= list.isOrdered()  %><%
        if (list.isPaginating()) {
            %><cq:include script="pagination.jsp"/><%
        }
    } else {
        %><cq:include script="empty.jsp"/><%
    }

    if (mode == WCMMode.EDIT) {
        %></ul>
			</div>
				<span class="nav prev api_slider_previous">Previous</span>
				<span class="nav next api_slider_next">Next</span>
		</div>
	</div>
</div>
</div><%
    }
%>
