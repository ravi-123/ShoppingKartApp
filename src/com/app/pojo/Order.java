package com.app.pojo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

@Entity
@Table(name="SK_Order",uniqueConstraints={@UniqueConstraint(columnNames={"id","User_Id"})})
public class Order {
	@Id	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	@Temporal(TemporalType.DATE)
	private Date receivedDate;
	private int totalQty;
	private int billAmount;
	@Size(max=255,message="max 255 chars for comment only!")
	private String comments;
	
	@ManyToOne
	@JoinColumn(name="User_Id")
	private User user;
	
	@OneToOne
	@JoinColumn(name="Delivery_Address_Id")
	private Address deliveryAddress;

	@OneToMany(mappedBy="order")
	@MapKeyColumn(name="id")
//	@JoinTable(name="SK_Ordered_Items", 
//	joinColumns=@JoinColumn(name="Order_Id"),
//	inverseJoinColumns={
//			@JoinColumn(name="Item_Id",referencedColumnName="id",unique=false)
//	},	uniqueConstraints={@UniqueConstraint(columnNames={"Order_Id","Item_Id"})})
	private Map<Integer,OrderItem> orderedItems = new HashMap<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public int getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Map<Integer, OrderItem> getOrderedItems() {
		return orderedItems;
	}

	public void setOrderedItems(Map<Integer, OrderItem> orderedItems) {
		this.orderedItems = orderedItems;
	}

	

}
