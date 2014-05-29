package com.weikun.po;

import java.math.BigDecimal;

/**
 * CartId entity. @author MyEclipse Persistence Tools
 */

public class CartId implements java.io.Serializable {

	// Fields

	private Orders orders;
	private BigDecimal linenum;

	// Constructors

	/** default constructor */
	public CartId() {
	}

	/** full constructor */
	public CartId(Orders orders, BigDecimal linenum) {
		this.orders = orders;
		this.linenum = linenum;
	}

	// Property accessors

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public BigDecimal getLinenum() {
		return this.linenum;
	}

	public void setLinenum(BigDecimal linenum) {
		this.linenum = linenum;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CartId))
			return false;
		CartId castOther = (CartId) other;

		return ((this.getOrders() == castOther.getOrders()) || (this
				.getOrders() != null && castOther.getOrders() != null && this
				.getOrders().equals(castOther.getOrders())))
				&& ((this.getLinenum() == castOther.getLinenum()) || (this
						.getLinenum() != null && castOther.getLinenum() != null && this
						.getLinenum().equals(castOther.getLinenum())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getOrders() == null ? 0 : this.getOrders().hashCode());
		result = 37 * result
				+ (getLinenum() == null ? 0 : this.getLinenum().hashCode());
		return result;
	}

}