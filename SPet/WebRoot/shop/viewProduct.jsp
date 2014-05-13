<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib  prefix="s" uri="/struts-tags"%>

<%@include file="../commons/top.jsp"%>


<table align="left" bgcolor="#008800" border="0" cellspacing="2"
	cellpadding="2">
	<tr>
		<td bgcolor="#FFFF88">
			<a href="viewcategory.xhtml">
			
			</a>
		</td>
	</tr>
</table>

<p>

	<center>
		<h2>
			<s:property value="#attr.product.name"/>
			
		</h2>
	</center>

	<table align="center" bgcolor="#008800" border="0" cellspacing="2" cellpadding="3">
		<tr bgcolor="#CCCCCC">
			<td>
				<s:text name="item.id"></s:text>
			</td>
			<td>
				<s:text name="product.id"></s:text>
			</td>
			<td>
				<s:text name="item.description"></s:text>
				
			</td>
			<td>
				<s:text name="item.price"></s:text>
			</td>
			<td>
				&nbsp;
			</td>
		</tr>
		<s:iterator value="#attr.ilist" var="item">
		<tr bgcolor="#FFFF88">
			<td>
				<b> <a href="item!queryI.do?item.itemid=<s:property value="#item.itemid"/>"><s:property value="#item.itemid"/></a>
				
				</b>
			</td>
			<td>
				<s:property value="#item.product.productid"/>
			</td>
			<td>
				<s:property value="#item.attr1"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<s:property value="#item.product.name"/>
			</td>
			<td>
				<s:property value="#item.listprice"/>
			</td>
			<td>
				<a href="cartmain.xhtml"><img border="0"
						src="../images/button_add_to_cart.gif" />
				</a>
			</td>
		</tr>
		</s:iterator>
		

		<tr>
			<td bgcolor="#FFFFFF" colspan="2">


			</td>
		</tr>
	</table>
	<%@include file="../commons/bottom.jsp"%>