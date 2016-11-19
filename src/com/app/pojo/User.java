package com.app.pojo;

import java.util.Collection;

import com.app.enums.Gender;
import com.app.enums.Role;

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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getSex() {
		return sex;
	}
	public void setSex(Gender sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAlternateContactNo() {
		return alternateContactNo;
	}
	public void setAlternateContactNo(String alternateContactNo) {
		this.alternateContactNo = alternateContactNo;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Collection<Order> getMyOrders() {
		return myOrders;
	}
	public void setMyOrders(Collection<Order> myOrders) {
		this.myOrders = myOrders;
	}
	public Collection<Address> getMyAddresses() {
		return myAddresses;
	}
	public void setMyAddresses(Collection<Address> myAddresses) {
		this.myAddresses = myAddresses;
	}
	public Collection<WishList> getMyWishLists() {
		return myWishLists;
	}
	public void setMyWishLists(Collection<WishList> myWishLists) {
		this.myWishLists = myWishLists;
	}
	public Collection<Review> getMyReviews() {
		return myReviews;
	}
	public void setMyReviews(Collection<Review> myReviews) {
		this.myReviews = myReviews;
	}
	
}