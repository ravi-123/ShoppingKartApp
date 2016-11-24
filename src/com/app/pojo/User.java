package com.app.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.app.enums.Gender;
import com.app.pojo.Role;

@Entity
@Table(name = "SK_User",uniqueConstraints={@UniqueConstraint(columnNames={"email"}),@UniqueConstraint(columnNames={"contactNo"})})
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

	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<Order> myOrders = new ArrayList<>();

	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<Address> myAddresses = new ArrayList<>();

	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<WishList> myWishLists = new ArrayList<>();;

	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<Review> myReviews = new ArrayList<>();

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

	
	public List<Order> getMyOrders() {
		return myOrders;
	}

	public void setMyOrders(List<Order> myOrders) {
		this.myOrders = myOrders;
	}

	public List<Address> getMyAddresses() {
		return myAddresses;
	}

	public void setMyAddresses(List<Address> myAddresses) {
		this.myAddresses = myAddresses;
	}

	public List<WishList> getMyWishLists() {
		return myWishLists;
	}

	public void setMyWishLists(List<WishList> myWishLists) {
		this.myWishLists = myWishLists;
	}

	public List<Review> getMyReviews() {
		return myReviews;
	}

	public void setMyReviews(List<Review> myReviews) {
		this.myReviews = myReviews;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", passowrd=" + passowrd + ", name=" + name + ", dob=" + dob + ", age=" + age
				+ ", email=" + email + ", contactNo=" + contactNo + ", alternateContactNo=" + alternateContactNo
				+ ", sex=" + sex + ", role=" + role + "]";
	}

}