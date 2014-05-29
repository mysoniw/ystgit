package com.weikun.po;

/**
 * Profile entity. @author MyEclipse Persistence Tools
 */

public class Profile implements java.io.Serializable {

	// Fields

	private String username;
	private Account account;
	private Category category;
	private String langpref;

	// Constructors

	/** default constructor */
	public Profile() {
	}

	/** minimal constructor */
	public Profile(String username, Account account, String langpref) {
		this.username = username;
		this.account = account;
		this.langpref = langpref;
	}

	/** full constructor */
	public Profile(String username, Account account, Category category,
			String langpref) {
		this.username = username;
		this.account = account;
		this.category = category;
		this.langpref = langpref;
	}

	// Property accessors

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getLangpref() {
		return this.langpref;
	}

	public void setLangpref(String langpref) {
		this.langpref = langpref;
	}

}