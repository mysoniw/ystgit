<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="../commons/top.jsp"%>
<table align="left" bgcolor="#008800" border="0" cellspacing="2"
	cellpadding="2">
	<tr>
		<td bgcolor="#FFFF88">
			<a href="viewproduct.xhtml">
			
			</a>
		</td>
	</tr>
</table>

<p>
<table align="center" bgcolor="#008800" cellspacing="2" cellpadding="3"
		border="0" width="60%">
		<tr bgcolor="#FFFF88">
			<td bgcolor="#FFFFFF">
				<s:property value="#attr.item.product.descn" escape="false"/>
			</td>
		</tr>
		<tr bgcolor="#FFFF88">
			<td width="100%" bgcolor="#cccccc">
				<s:property value="#attr.item.itemid"></s:property>
			</td>
		</tr>
		<tr bgcolor="#FFFF88">
			<td>
				<b><font size="4"> 
					<s:property value="#attr.item.attr1"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<s:property value="#attr.item.product.name"/>
					
				</font>
				</b>
			</td>
		</tr>
		<tr bgcolor="#FFFF88">
			<td>
				<font size="3"><i><s:property value="#attr.item.product.name"/></i>
				</font>
			</td>
		</tr>
		<tr bgcolor="#FFFF88">
			<td>
				存货：99

			</td>
		</tr>
		<tr bgcolor="#FFFF88">
			<td>
				<s:property value="#attr.item.listprice"/>
			</td>
		</tr>

		<tr bgcolor="#FFFF88">
			<td>
				<a href="cartmain.xhtml"><img border="0"
						src="../images/button_add_to_cart.gif" />
				</a>
			</td>
		</tr>
	</table>
	<%@include file="../commons/bottom.jsp"%>