package com.weikun.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Stu entity. @author MyEclipse Persistence Tools
 */

public class Stu implements java.io.Serializable {

	// Fields

	private Integer sid;
	private String sname;
	private Set teachers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Stu() {
	}

	/** minimal constructor */
	public Stu(Integer sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	/** full constructor */
	public Stu(Integer sid, String sname, Set teachers) {
		this.sid = sid;
		this.sname = sname;
		this.teachers = teachers;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Set getTeachers() {
		return this.teachers;
	}

	public void setTeachers(Set teachers) {
		this.teachers = teachers;
	}

}