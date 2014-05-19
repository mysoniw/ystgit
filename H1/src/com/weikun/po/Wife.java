package com.weikun.po;

/**
 * Wife entity. @author MyEclipse Persistence Tools
 */

public class Wife implements java.io.Serializable {

	// Fields

	private long id;
	private String wname;
	private Husband husband;

	// Constructors

	/** default constructor */
	public Wife() {
	}

	/** minimal constructor */
	public Wife(long id, String wname) {
		this.id = id;
		this.wname = wname;
	}

	/** full constructor */
	public Wife(long id, String wname, Husband husband) {
		this.id = id;
		this.wname = wname;
		this.husband = husband;
	}

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getWname() {
		return this.wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

	public Husband getHusband() {
		return this.husband;
	}

	public void setHusband(Husband husband) {
		this.husband = husband;
	}

}