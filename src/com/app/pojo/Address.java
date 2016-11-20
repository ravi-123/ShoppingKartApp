package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.app.enums.AddressPreferenceType;
import com.app.enums.AddressType;

@Entity
@Table(name="SK_Address")
public class Address {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Enumerated(EnumType.STRING)
	@Column(length=30)
	@Size(max=30,message="max length of adsress type string shud be 30")
	private AddressPreferenceType addresPreference;
	@Enumerated(EnumType.STRING)
	@Column(length=30)
	@Size(max=30,message="max length of adsress type string shud be 30")
	private AddressType addressType;
	private String apartment;
	private String building;
	private String city;
	private String flat;
	private String landmark;
	private String locality;
	@Pattern(regexp="[1-9][0-9]{5}",message="invalid pincode entered")
	private String pincode;
	private String state;
	
	@ManyToOne
	@JoinColumn(name="User_Id")
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlat() {
		return flat;
	}

	public void setFlat(String flat) {
		this.flat = flat;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public AddressPreferenceType getPreference() {
		return addresPreference;
	}

	public void setPreference(AddressPreferenceType addresPreference) {
		this.addresPreference = addresPreference;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
