package com.weikun.po;

/**
 * Husband entity. @author MyEclipse Persistence Tools
 */

public class Husband implements java.io.Serializable {

	// Fields

	private long id;
	private Wife wife;
	private String hname;

	// Constructors

	/** default constructor */
	public Husband() {
	}

	/** full constructor */
	public Husband(long id, Wife wife, String hname) {
		this.id = id;
		this.wife = wife;
		this.hname = hname;
	}

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Wife getWife() {
		return this.wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	public String getHname() {
		return this.hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

}