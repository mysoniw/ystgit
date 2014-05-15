package com.weikun.vo;

import java.io.Serializable;

public class Cart implements Serializable {
	private int linenum;
	private Item item;
	private int quantity;
	private Orders orders;
	public int getLinenum() {
		return linenum;
	}
	public void setLinenum(int linenum) {
		this.linenum = linenum;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
}
