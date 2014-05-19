package com.weikun.po;

/**
 * Animal entity. @author MyEclipse Persistence Tools
 */

public class Animal implements java.io.Serializable {

	// Fields

	private AnimalId id;
	private String aname;
	private String asex;

	// Constructors

	/** default constructor */
	public Animal() {
	}

	/** minimal constructor */
	public Animal(AnimalId id, String aname) {
		this.id = id;
		this.aname = aname;
	}

	/** full constructor */
	public Animal(AnimalId id, String aname, String asex) {
		this.id = id;
		this.aname = aname;
		this.asex = asex;
	}

	// Property accessors

	public AnimalId getId() {
		return this.id;
	}

	public void setId(AnimalId id) {
		this.id = id;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAsex() {
		return this.asex;
	}

	public void setAsex(String asex) {
		this.asex = asex;
	}

}