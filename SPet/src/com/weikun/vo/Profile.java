package com.weikun.vo;

import java.io.Serializable;

public class Profile implements Serializable {
	private int id;
	private String username;
	private String langpref;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLangpref() {
		return langpref;
	}

	public void setLangpref(String langpref) {
		this.langpref = langpref;
	}

	public Category getCate() {
		return cate;
	}

	public void setCate(Category cate) {
		this.cate = cate;
	}

	private Category cate;
}
