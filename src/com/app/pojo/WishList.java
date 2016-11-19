package com.app.pojo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WishList {
	@Id
	private int id;
	private String Name;
	private Collection<Item> items;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Collection<Item> getItems() {
		return items;
	}
	public void setItems(Collection<Item> items) {
		this.items = items;
	}
}
