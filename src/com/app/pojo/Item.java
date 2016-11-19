package com.app.pojo;

import java.util.Collection;
import java.util.Date;


public class Item {
	private String id;
	private String name;
	private String model;
	private String size;
	private String imgUrl;
	private String batchNo;
	
	private Date mfg;
	private Date expiry;
	
	private int qty;
	
	private float SP;
	private float MRP;
	private float PP;
	
	private float overallRating;
	private Collection<Review> reviews; 
	
}
