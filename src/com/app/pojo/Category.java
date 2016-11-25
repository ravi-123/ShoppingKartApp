package com.app.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Category implements Serializable {
	private static final long serialVersionUID = 2221503269074744756L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;
	@Column(nullable=false,unique=true)
	private String categoryName;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
