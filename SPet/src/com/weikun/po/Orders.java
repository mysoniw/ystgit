package com.weikun.po;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private BigDecimal orderid;
	private Date orderdate;
	private String userid;
	private String shipaddr;
	private String shipcity;
	private String shipname;
	private String cardno;
	private String cardtype;
	private double totalprice;
	private Set carts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(BigDecimal orderid, String userid, double totalprice) {
		this.orderid = orderid;
		this.userid = userid;
		this.totalprice = totalprice;
	}

	/** full constructor */
	public Orders(BigDecimal orderid, Date orderdate, String userid,
			String shipaddr, String shipcity, String shipname, String cardno,
			String cardtype, double totalprice, Set carts) {
		this.orderid = orderid;
		this.orderdate = orderdate;
		this.userid = userid;
		this.shipaddr = shipaddr;
		this.shipcity = shipcity;
		this.shipname = shipname;
		this.cardno = cardno;
		this.cardtype = cardtype;
		this.totalprice = totalprice;
		this.carts = carts;
	}

	// Property accessors

	public BigDecimal getOrderid() {
		return this.orderid;
	}

	public void setOrderid(BigDecimal orderid) {
		this.orderid = orderid;
	}

	public Date getOrderdate() {
		return this.orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getShipaddr() {
		return this.shipaddr;
	}

	public void setShipaddr(String shipaddr) {
		this.shipaddr = shipaddr;
	}

	public String getShipcity() {
		return this.shipcity;
	}

	public void setShipcity(String shipcity) {
		this.shipcity = shipcity;
	}

	public String getShipname() {
		return this.shipname;
	}

	public void setShipname(String shipname) {
		this.shipname = shipname;
	}

	public String getCardno() {
		return this.cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getCardtype() {
		return this.cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public double getTotalprice() {
		return this.totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public Set getCarts() {
		return this.carts;
	}

	public void setCarts(Set carts) {
		this.carts = carts;
	}

}