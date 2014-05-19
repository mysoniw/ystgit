package com.weikun.po;

/**
 * B entity. @author MyEclipse Persistence Tools
 */

public class B implements java.io.Serializable {

	// Fields

	private byte EId;
	private String EName;

	// Constructors

	/** default constructor */
	public B() {
	}

	/** full constructor */
	public B(byte EId, String EName) {
		this.EId = EId;
		this.EName = EName;
	}

	// Property accessors

	public byte getEId() {
		return this.EId;
	}

	public void setEId(byte EId) {
		this.EId = EId;
	}

	public String getEName() {
		return this.EName;
	}

	public void setEName(String EName) {
		this.EName = EName;
	}

}