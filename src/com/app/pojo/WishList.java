package com.app.pojo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="SK_WishList")
public class WishList {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	
	@OneToMany
	@JoinTable(name="SK_WishList_Items",
	joinColumns=@JoinColumn(name="WishList_Id"),
	inverseJoinColumns=@JoinColumn(name="Item_Id"),
	uniqueConstraints={@UniqueConstraint(columnNames={"WishList_Id","Item_Id"})})
	private Collection<Item> items = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Item> getItems() {
		return items;
	}

	public void setItems(Collection<Item> items) {
		this.items = items;
	}

}
