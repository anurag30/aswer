<%--
  ADOBE CONFIDENTIAL
  __________________

   Copyright 2012 Adobe Systems Incorporated
   All Rights Reserved.

  NOTICE:  All information contained herein is, and remains
  the property of Adobe Systems Incorporated and its suppliers,
  if any.  The intellectual and technical concepts contained
  herein are proprietary to Adobe Systems Incorporated and its
  suppliers and are protected by trade secret or copyright law.
  Dissemination of this information or reproduction of this material
  is strictly forbidden unless prior written permission is obtained
  from Adobe Systems Incorporated.

  ==============================================================================

  List component sub-script

  Draws a list item as a default link.

  request attributes:
  - {com.day.cq.wcm.foundation.List} list The list
  - {com.day.cq.wcm.api.Page} listitem The list item as a page

--%>
<%
%><%@include file="/libs/foundation/global.jsp"%>
<%
%><%@ page session="false" contentType="text/html; charset=utf-8"
	import="info.geometrixx.commons.util.GeoHelper"%>
<%
    Page listItem = (Page) request.getAttribute("listitem");
    String description = xssAPI.encodeForHTMLAttr(listItem.getProperties().get("jcr:description", ""));
    String pagePath = request.getContextPath() + listItem.getPath();
    String extension = xssAPI.encodeForHTMLAttr(GeoHelper.getPageImageExtension(listItem));
%>

<li class="slide">
	<a href="<%=pagePath %>.html" title="Discover" target="_blank"> 
	<%
    String resourcePath = pagePath+"/jcr:content/image";
    Resource res = resourceResolver.getResource(resourcePath);
    ValueMap prop = res.adaptTo(ValueMap.class);
    String imagepath = prop.get("fileReference", (String) null);
%>
		<img src="<%=imagepath %>" alt="<%= xssAPI.encodeForHTML(GeoHelper.getTitle(listItem)) %>" />
	</a>
	
	<div class="content">
		<div class="text">
			<strong> <span class="uppercase"><%= xssAPI.encodeForHTML(GeoHelper.getTitle(listItem)) %></span></strong> 
			<br /><%= description %>
		</div>
		<a href="<%=pagePath %>.html" title="Discover" target="_blank" class="arrow green-apple"> 
			<span class="ico"></span>Discover
		</a>
	</div>
</li>

