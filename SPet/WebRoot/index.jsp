<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<HTML><HEAD><TITLE>JPetStore Demo</TITLE>
<META content="text/html; charset=utf-8" http-equiv=Content-Type>
</HEAD>

<BODY bgColor=white>
<TABLE background="images/bkg-topbar.gif" border=0 cellSpacing=0 cellPadding=5 width="100%">
  <TBODY>
  <TR>
    <TD><A href=""><IMG border=0

      src="images/logo-topbar.gif"></A> </TD>
    <TD align=right><A href=""><IMG border=0

      name=img_cart src="images/cart.gif"></A>
      <IMG border=0 src="images/separator.gif">

      <A href="" >
      <IMG border=0 name=img_signin src="images/sign-in.gif"></A>
      <IMG border=0
      src="images/separator.gif"> <A
      href="help.html"
      ><IMG border=0
      name=img_help src="images/help.gif"></A>
  </TD>    <TD align=left valign=bottom>
      <FORM action="">
      <INPUT name=keyword size=14> <INPUT border=0
      src="images/search.gif"
      type=image> </FORM>
      </TD>
</TR>
</TBODY></TABLE>
<TABLE border=0 cellSpacing=0 width="100%">
  <TBODY>
  <TR>
    <TD vAlign=top width=100%>
      <p>&nbsp;</p>
      <s:text name="language"></s:text>
       <a href="i18n.do?key=1"> <s:text name="chinese"></s:text></a>
       <a href="i18n.do?key=2"> <s:text name="english"></s:text></a>
     
      <p align="center"><b> <s:text name="welcome.title"></s:text></b></p>
      <p align="center"><a href="shop/main.jsp"> <s:text name="welcome.enter"></s:text></a></p>
      </TD>
  </TR>
  </TBODY>
</TABLE>

<P>&nbsp;</P>

<P align="center">

<a href="http://www.papaok.org/">易圣通教育</a>

</P>

</BODY>

</HTML>


