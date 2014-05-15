<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ include file="../commons/top.jsp" %>

<table border="0" width="100%" cellspacing="0" cellpadding="0">
	<tr>
		<td valign="top" width="20%" align="left">
			<table align="left" bgcolor="#008800" border="0" cellspacing="2"
				cellpadding="2">
				<tr>
					<td bgcolor="#FFFF88">
						<a href="main.xhtml"><b><font color="BLACK" size="2">&lt;&lt; 主菜单</font>
				</b></a>
					</td>
				</tr>
			</table>
		</td>
		<td valign="top" align="center">
			<h2 align="center">
				
			</h2>
			<form name="form1" method="post" action="cart!update.do">
				
				<table align="center" bgcolor="#008800" border="0" cellspacing="2"
					cellpadding="5" >
					<tr bgcolor="#cccccc">
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
							<b><s:text name="item.stock"></s:text></b>
						</td>
						<td width="100">
								<s:text name="item.quantity"></s:text>
						</td>
						<td>
							<s:text name="item.price"></s:text>
						</td>
						<td>
							<s:text name="cart.total"></s:text>
						</td>
						<td>
							&nbsp;
						</td>
					</tr>

					<s:iterator value="#attr.list" var="cart">
			
					
					
					<tr bgcolor="#FFFF88">
						<td>
							<b> 
							
							
							<a href="viewitem.xhtml?itemid=<s:property value="#cart.itemid"/>"><s:property value="#cart.item.itemid"/></a>
							
							</b>
						</td>
						<td>
							<s:hidden name="lines" value="%{#cart.linenum}"></s:hidden>
							<s:hidden name="orderids" value="%{#cart.orders.orderid}"></s:hidden>
							<s:property value="#cart.item.product.productid"/>
						</td>
						<td>
							
								<s:property value="#cart.item.attr1"/>  	<s:property value="#cart.product.name"/>
						</td>
						<td align="center">
							有
							
						</td>
						<td>
							
									
							<s:textfield name="quantitys" value="%{#cart.quantity}" theme="simple"></s:textfield>					
						</td>
						<td align="right">
								<s:property value="#cart.item.listprice"/>		
							<br/>
						</td>
						<td align="right">
							<s:set value="#cart.item.listprice*#cart.quantity" var="sum"></s:set>
							<s:property value="#sum"/>
							
						</td>
						<td>
							<a href="cartremove.xhtml?itemid=<s:property value="#cart.itemid"/>"><img border="0"
									src="../images/button_remove.gif" />
							</a>
						</td>
					</tr>
					
					</s:iterator>
			
					<tr bgcolor="#FFFF88">
						<td colspan="7" align="right">
							<b>
							<input type="image" border="0"
									src="../images/button_update_cart.gif" />
							
							</b>							
							
						</td>
						<td>
							&nbsp;
						</td>
					</tr>
				</table>
				<center>


				</center>
			</form>


			<br />
			<center>
				<a href="cartcheckout.xhtml"><img border="0"
						src="../images/button_checkout.gif" />
				</a>
			</center>


		</td>


		<td valign="top" width="20%" align="right">
				<%@include file="favItem.jsp" %>	
		</td>

	</tr>
</table>

<br>
<%@include file="../commons/banner.jsp" %>		
<%@include file="../commons/bottom.jsp"%>