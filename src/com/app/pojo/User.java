package com.app.pojo;

import java.util.Collection;

import com.app.enums.Gender;

public class User {
	private String id;
	private String name;
	private int age;
	private Gender sex;
	private String email;
	private String contactNo;
	private String alternateContactNo;
	private Role role;
	
	private Collection<Order> myOrders;
	private Collection<Address> myAddresses;
	private Collection<WishList> myWishLists;
	private Collection<Review> myReviews;
	
}