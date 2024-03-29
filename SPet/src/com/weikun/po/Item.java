package com.weikun.po;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Item entity. @author MyEclipse Persistence Tools
 */

public class Item implements java.io.Serializable {

	// Fields

	private String itemid;
	private Product product;
	private double listprice;
	private double unitcost;
	private BigDecimal supplier;
	private String status;
	private String attr1;
	private String attr2;
	private String attr3;
	private String attr4;
	private String attr5;
	private Set carts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Item() {
	}

	/** minimal constructor */
	public Item(String itemid, Product product) {
		this.itemid = itemid;
		this.product = product;
	}

	/** full constructor */
	public Item(String itemid, Product product, double listprice,
			double unitcost, BigDecimal supplier, String status, String attr1,
			String attr2, String attr3, String attr4, String attr5, Set carts) {
		this.itemid = itemid;
		this.product = product;
		this.listprice = listprice;
		this.unitcost = unitcost;
		this.supplier = supplier;
		this.status = status;
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.attr4 = attr4;
		this.attr5 = attr5;
		this.carts = carts;
	}

	// Property accessors

	public String getItemid() {
		return this.itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getListprice() {
		return this.listprice;
	}

	public void setListprice(double listprice) {
		this.listprice = listprice;
	}

	public double getUnitcost() {
		return this.unitcost;
	}

	public void setUnitcost(double unitcost) {
		this.unitcost = unitcost;
	}

	public BigDecimal getSupplier() {
		return this.supplier;
	}

	public void setSupplier(BigDecimal supplier) {
		this.supplier = supplier;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAttr1() {
		return this.attr1;
	}

	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}

	public String getAttr2() {
		return this.attr2;
	}

	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}

	public String getAttr3() {
		return this.attr3;
	}

	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}

	public String getAttr4() {
		return this.attr4;
	}

	public void setAttr4(String attr4) {
		this.attr4 = attr4;
	}

	public String getAttr5() {
		return this.attr5;
	}

	public void setAttr5(String attr5) {
		this.attr5 = attr5;
	}

	public Set getCarts() {
		return this.carts;
	}

	public void setCarts(Set carts) {
		this.carts = carts;
	}

}