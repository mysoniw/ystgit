package com.weikun.vo;

import java.io.Serializable;

public class Orders implements Serializable {
	private int orderid;

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	private float totalprice;

	public float getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}
}
