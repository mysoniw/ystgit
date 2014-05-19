package com.weikun.po;

/**
 * AnimalId entity. @author MyEclipse Persistence Tools
 */

public class AnimalId implements java.io.Serializable {

	// Fields

	private short aid;
	private short ano;

	// Constructors

	/** default constructor */
	public AnimalId() {
	}

	/** full constructor */
	public AnimalId(short aid, short ano) {
		this.aid = aid;
		this.ano = ano;
	}

	// Property accessors

	public short getAid() {
		return this.aid;
	}

	public void setAid(short aid) {
		this.aid = aid;
	}

	public short getAno() {
		return this.ano;
	}

	public void setAno(short ano) {
		this.ano = ano;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AnimalId))
			return false;
		AnimalId castOther = (AnimalId) other;

		return (this.getAid() == castOther.getAid())
				&& (this.getAno() == castOther.getAno());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAid();
		result = 37 * result + this.getAno();
		return result;
	}

}