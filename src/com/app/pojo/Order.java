package com.app.pojo;

import java.util.Collection;
import java.util.Date;

public class Order {
	private int id;
	private Date orderDate;
	private Date receivedDate;
	
	private Address deliveryAddress;
	
	private int userId;
	private Collection<Item> items;
	private int totalQty; 
	private int billAmount;
	private String comments;
	
	

}
