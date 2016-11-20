package com.app.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="SK_Kart_Items")
public class KartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@ManyToOne
	@JoinColumn(name = "Kart_Id")
	private Kart kart;
	
	@ManyToOne
	@JoinColumn(name = "Item_Id")
	private Item item;
	
	@NotNull
	private int itemQty;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Kart getKart() {
		return kart;
	}

	public void setKart(Kart kart) {
		this.kart = kart;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}
	
}
