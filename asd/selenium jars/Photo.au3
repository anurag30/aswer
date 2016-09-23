#cs ----------------------------------------------------------------------------

 AutoIt Version: 3.3.8.1
 Author:         myName

 Script Function:
	Template AutoIt script.

#ce ----------------------------------------------------------------------------

; Script Start - Add your code below here
AutoItSetOption("WinTitleMatchMode","2")
WinWait($CmdLine[1])
$title=WinGetTitle($CmdLine[1]);
WinActivate($title)
If (StringCompare($CmdLine[1],"File Upload",0) = 0) Then
   WinWaitActive($title)
   ControlSetText($title,"","Edit1",$CmdLine[2])
   ControlClick($title,"","Button5")
 EndIf
