package com.weikun.po;

/**
 * Son entity. @author MyEclipse Persistence Tools
 */

public class Son implements java.io.Serializable {

	// Fields

	private Integer sid;
	private Father father;
	private String sname;

	// Constructors

	/** default constructor */
	public Son() {
	}

	/** full constructor */
	public Son(Integer sid, Father father, String sname) {
		this.sid = sid;
		this.father = father;
		this.sname = sname;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Father getFather() {
		return this.father;
	}

	public void setFather(Father father) {
		this.father = father;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}