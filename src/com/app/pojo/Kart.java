package com.app.pojo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SK_Kart")
public class Kart {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@OneToOne
	@JoinColumn(name="User_Id")
	private User user;

	@OneToMany(mappedBy="kart")
//	@JoinTable(name="SK_Kart_Items", 
//	joinColumns=@JoinColumn(name="Kart_Id"),
//	inverseJoinColumns={
//			@JoinColumn(name="Item_Id",referencedColumnName="id",unique=false)
//	},	uniqueConstraints={@UniqueConstraint(columnNames={"Kart_Id","Item_Id"})})
	private Collection<KartItem> itemsInKart = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Collection<KartItem> getItemsInKart() {
		return itemsInKart;
	}

	public void setItemsInKart(Collection<KartItem> itemsInKart) {
		this.itemsInKart = itemsInKart;
	}

}
