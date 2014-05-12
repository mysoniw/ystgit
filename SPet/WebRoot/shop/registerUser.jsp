<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="../commons/top.jsp"%>
<br/>

<s:form name="form1" id="form1" action="register!register.do" method="post">
	<TABLE cellpadding=10 cellspacing=0 align=center border=1 width="400"
		bgcolor=#dddddd>
		<TR>
			<TD>
				<FONT color=darkgreen>
					<H3>
						<s:text name="register.title"></s:text>
						<s:token></s:token>
					</H3>
				</FONT>
				<TABLE border=0  bgcolor=#FFFF88  width="100%">
					<TR bgcolor=#FFFF88>						
						<TD>
						 	 <s:textfield name="account.username" required="true" key="register.username"></s:textfield>
						</TD>
					</TR>
					<TR bgcolor=#FFFF88>
						
						<TD>
							  <s:password name="account.password" required="true" key="register.newpassword"></s:password>
							
						</TD>
					</TR>
					<TR bgcolor=#FFFF88>
						
						<TD>
							 <s:password name="account.repassword" required="true" key="register.repeatpassword"></s:password>
							
						</TD>
					</TR>
				</TABLE>





				<FONT color=darkgreen><H3>
							<s:text name="register.account"></s:text>
					</H3>
				</FONT>

				<TABLE bgcolor="#FFFF88" border=0 
					bgcolor=#FFFF88 width="100%">
					<TR bgcolor=#FFFF88>
						
						<TD>
							 <s:textfield name="account.xm" required="true" key="register.xm"></s:textfield>
						</TD>
					</TR>
					
					<TR bgcolor=#FFFF88>
						
						<TD>
							 <s:textfield name="account.email"  required="true" key="register.email"></s:textfield>
						</TD>
					</TR>
					
					<TR bgcolor=#FFFF88>
						
						<TD>
							 <s:textfield name="account.address" key="register.address"></s:textfield>
							
						</TD>
					</TR>
					
					
				</TABLE>


				<FONT color=darkgreen><H3>
						 <s:text name="register.profile"></s:text>
					</H3>
				</FONT>

				<TABLE bgcolor="#FFFF88" border=0 cellpadding=3 cellspacing=1 width="100%">
					<TR bgcolor=#FFFF88>
						
						<TD>
							<s:select list="#{'eng':'英文','chi':'中文'}" name="account.profile.langpref" key="register.language"></s:select>
						</TD>				
					</TR>
					<TR bgcolor=#FFFF88>
						
						<TD>
							<s:select 
							list="#attr.list"
							listKey="catid"
							listValue="name"
							name="account.profile.cate.catid"
							key="register.favourite"
							>
							
							
							</s:select>
						</TD>
					</TR>
					<tr>
						<td><input border=0 type="image" src="../images/button_submit.gif" />
							<s:actionerror/>
						</td>
					</tr>
				</TABLE>
	</TABLE>
</s:form>
	<BR>
	<CENTER>
		
	</CENTER>

<%@include file="../commons/bottom.jsp"%>