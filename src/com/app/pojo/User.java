package com.app.pojo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.app.enums.Gender;
import com.app.enums.Role;

@Entity
@Table(name = "SK_User")
public class User {
	@Id	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String passowrd;
	@Column(length=20)
	@Size(min = 3, max = 20, message = "name length shud be btween 3 to 20 chars")
	private String name;
	@Temporal(TemporalType.DATE)
	@Past(message="DOB shud be past date!!")
	private Date dob;
	private int age;
    @Email(message="invalid email address!!")
	private String email;
    
	private String contactNo;
	private String alternateContactNo;

	@Enumerated(EnumType.STRING)
	private Gender sex;
	@Enumerated(EnumType.STRING)
	private Role role;

	@OneToMany
	@JoinTable(name = "SK_User_Orders", 
	joinColumns = @JoinColumn(name = "User_Id"), 
	inverseJoinColumns = @JoinColumn(name = "Order_Id"))
	private Collection<Order> myOrders = new ArrayList<>();

	@OneToMany
	@JoinTable(name = "SK_User_Addresses", 
	joinColumns = @JoinColumn(name = "User_Id"), 
	inverseJoinColumns = @JoinColumn(name = "Address_Id"))
	private Collection<Address> myAddresses = new ArrayList<>();

	@OneToMany
	@JoinTable(name = "SK_User_Wishlist", 
	joinColumns = @JoinColumn(name = "User_Id"),
	inverseJoinColumns = @JoinColumn(name = "WishList_Id"))
	private Collection<WishList> myWishLists = new ArrayList<>();;

	@OneToMany
	@JoinTable(name = "SK_User_Reviews", 
	joinColumns = @JoinColumn(name = "User_Id"), 
	inverseJoinColumns = @JoinColumn(name = "Review_Id"))
	private Collection<Review> myReviews = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassowrd() {
		return passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public Gender getSex() {
		return sex;
	}

	public void setSex(Gender sex) {
		this.sex = sex;
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