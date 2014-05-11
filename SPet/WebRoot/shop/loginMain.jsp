<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="../commons/top.jsp"%>
	<s:form name="form1" id="form1" method="post" action="user!login.do">
	<table align="center" border="0">
		<tr>
			<td colspan="2">
				<s:textfield key="main.username" name="account.username" ></s:textfield>
				<s:token></s:token>
				<br />
				
			</td>
			
			
		</tr>
		<tr>
			
			<td>
				<s:password  key="main.password" name="account.password" ></s:password>
			</td>
		</tr>
		<tr>
			
			<td>
				
			</td>
		</tr>
		<tr>
			<td>
				<s:actionerror name="register.error.token.repeat"/>
			</td>
			<td>
				<input type="image" border="0" src="../images/button_submit.gif" />
			</td>
		</tr>
	</table>
	</s:form>
<center>
	<a href="user!regmain.do"><img border="0"
			src="../images/button_register_now.gif" />
	</a>
</center>
<%@include file="../commons/bottom.jsp"%>