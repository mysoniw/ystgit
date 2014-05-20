package com.weikun.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private Integer tid;
	private String tname;
	private Set stus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(Integer tid, String tname) {
		this.tid = tid;
		this.tname = tname;
	}

	/** full constructor */
	public Teacher(Integer tid, String tname, Set stus) {
		this.tid = tid;
		this.tname = tname;
		this.stus = stus;
	}

	// Property accessors

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Set getStus() {
		return this.stus;
	}

	public void setStus(Set stus) {
		this.stus = stus;
	}

}