package com.weikun.vo;

import java.io.Serializable;

public class Item implements Serializable {
	private String itemid;
	private Product product;
	private float listprice;
	private float unitcost;
	private String attr1;
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public float getListprice() {
		return listprice;
	}
	public void setListprice(float listprice) {
		this.listprice = listprice;
	}
	public float getUnitcost() {
		return unitcost;
	}
	public void setUnitcost(float unitcost) {
		this.unitcost = unitcost;
	}
	public String getAttr1() {
		return attr1;
	}
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}
	
}
