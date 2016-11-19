package com.app.pojo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kart {
	@Id
	private String id;
	private Collection<Item> items;
	private int totalQty;
	private float totalPrice;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Collection<Item> getItems() {
		return items;
	}
	public void setItems(Collection<Item> items) {
		this.items = items;
	}
	public int getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	

}
