package com.app.pojo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="SK_Kart")
public class Kart {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@OneToOne
	@JoinColumn(name="User_Id")
	private User user;

	@ManyToMany
	@JoinTable(name="SK_Kart_Items", 
	joinColumns=@JoinColumn(name="Kart_Id"),
	inverseJoinColumns={
			@JoinColumn(name="Item_Id",referencedColumnName="id",unique=false),
			@JoinColumn(name="Qty",referencedColumnName="totalQty",unique=false)
	},	uniqueConstraints={@UniqueConstraint(columnNames={"Kart_Id","Item_Id"})})
	private Collection<Item> items = new ArrayList<Item>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Collection<Item> getItems() {
		return items;
	}

	public void setItems(Collection<Item> items) {
		this.items = items;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


}
