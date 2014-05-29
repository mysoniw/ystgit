package com.weikun.po;

import java.math.BigDecimal;

/**
 * Cart entity. @author MyEclipse Persistence Tools
 */

public class Cart implements java.io.Serializable {

	// Fields

	private CartId id;
	private Item item;
	private BigDecimal quantity;
	private double unitprice;

	// Constructors

	/** default constructor */
	public Cart() {
	}

	/** full constructor */
	public Cart(CartId id, Item item, BigDecimal quantity, double unitprice) {
		this.id = id;
		this.item = item;
		this.quantity = quantity;
		this.unitprice = unitprice;
	}

	// Property accessors

	public CartId getId() {
		return this.id;
	}

	public void setId(CartId id) {
		this.id = id;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public double getUnitprice() {
		return this.unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

}