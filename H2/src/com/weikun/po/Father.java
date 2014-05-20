package com.weikun.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Father entity. @author MyEclipse Persistence Tools
 */

public class Father implements java.io.Serializable {

	// Fields

	private Integer fid;
	private String fname;
	private Set sons = new HashSet(0);

	// Constructors

	/** default constructor */
	public Father() {
	}

	/** minimal constructor */
	public Father(Integer fid, String fname) {
		this.fid = fid;
		this.fname = fname;
	}

	/** full constructor */
	public Father(Integer fid, String fname, Set sons) {
		this.fid = fid;
		this.fname = fname;
		this.sons = sons;
	}

	// Property accessors

	public Integer getFid() {
		return this.fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Set getSons() {
		return this.sons;
	}

	public void setSons(Set sons) {
		this.sons = sons;
	}

}