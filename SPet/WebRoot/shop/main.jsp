<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
	<%@include file="../commons/top.jsp" %>

		<table border="0" cellspacing="2" cellpadding="0" width="100%">
			<tr>
				<td valign="top" width="100%">

					<table align="left" border="0" cellspacing="0" width="80%">
						<tbody>
							<tr>
								<td valign="top">

									<!-- SIDEBAR -->
									
									<table bgcolor="#5A8C29" border="0" cellspacing="2"
										cellpadding="0" width="100%">
										<tr>
											<td>
												<table bgcolor="#FFFF88" border="0" cellspacing="0"
													cellpadding="5" width="200">
													<tbody>
														<tr>
															<td>
																<b><i>
																<s:if test="#session.account!=null">
																
																<font size="2" color="BLACK">
																
																	<s:text name="main.welcome"></s:text>
																	<s:property value="#session.account.username"/>
																
																</font>
																</s:if>
																</i></b>
																&nbsp;
															</td>
														</tr>
														<tr>
															<td>
															<a href="product!queryC.do?category.catid=FISH">
															<img
																		border="0" src="../images/fish_icon.gif" />
															</a>
																
																<br>
																<font size="2"><i><s:text name="main.fish"></s:text></i>
																</font>
															</td>
														</tr>
														<tr>
															<td>
																<a
																	href=""><img
																		border="0" src="../images/dogs_icon.gif" />
																</a>
																<br>
																<font size="2"><i></i>
																</font>
															</td>
														</tr>
														<tr>
															<td>
																<a
																	href=""><img
																		border="0" src="../images/cats_icon.gif" />
																</a>
																<br>
																<font size="2"><i></i>
																</font>
															</td>
														</tr>
														<tr>
															<td>
																<a
																	href=""><img
																		border="0" src="../images/reptiles_icon.gif" />
																</a>
																<br>
																<font size="2"><i></i>
																</font>
															</td>
														</tr>
														<tr>
															<td>
																<a
																	href=""><img
																		border="0" src="../images/birds_icon.gif" />
																</a>
																<br>
																<font size="2"><i></i>
																</font>
															</td>
														</tr>

													</tbody>
												</table>
											</td>
										</tr>
									</table>

								</td>
								<td align="center" bgcolor="white" height="300" width="100%">

									<!-- MAIN IMAGE -->

									<map name="estoremap">
										<area alt="Birds" coords="72,2,280,250"
											href="" shape="RECT" />
										<area alt="Fish" coords="2,180,72,250"
											href="" shape="RECT" />
										<area alt="Dogs" coords="60,250,130,320"
											href="" shape="RECT" />
										<area alt="Reptiles" coords="140,270,210,340"
											href="" shape="RECT" />
										<area alt="Cats" coords="225,240,295,310"
											href="" shape="RECT" />
										<area alt="Birds" coords="280,180,350,250"
											href="" shape="RECT" />
									</map>
									<img border="0" height="355" src="../images/splash.gif"
										align="center" usemap="#estoremap" width="350" />
								</td>
							</tr>
						</tbody>
					</table>
				</td>
			</tr>

		</table>

		<br>
<%@include file="../commons/banner.jsp" %>		
<%@include file="../commons/bottom.jsp" %>

