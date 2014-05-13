<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="../commons/top.jsp" %>

		

<table align="left" bgcolor="#008800" border="0" cellspacing="2"
	cellpadding="2">
	<tr>
		<td bgcolor="#FFFF88">
			<a href="main.xhtml"><b><font color="BLACK" size="2">&lt;&lt; 主菜单</font>
				</b></a>
		</td>
	</tr>
</table>

<p>
	<center>
		<h2>
			<s:property value="#attr.category.catid"/>
		</h2>
	</center>
	<table align="center" bgcolor="#008800" border="0" cellspacing="2"
		cellpadding="3">
		<tr bgcolor="#CCCCCC">
			<td>
				<s:text name="product.id"></s:text>
			</td>
			<td>
				<s:text name="product.name"></s:text>
			</td>
		</tr>
			
			<s:iterator value="#attr.plist" var="pro">
				<tr bgcolor="#FFFF88">
				<td>
				
					<b><a href="item!queryP.do?product.name=<s:property value="#pro.name"/>&product.productid=<s:property value="#pro.productid"/>">
						<s:property value="#pro.productid"/>
							</a>
					</b>
				</td>
				<td>
					<s:property value="#pro.name"/>
				</td>
			</tr>
			</s:iterator>
			
			
			
		
			
		
		<tr>
			<td bgcolor="#FFFFFF" colspan="2">
				
				
			</td>
		</tr>
	</table>
<%@include file="../commons/bottom.jsp" %>