package com.app.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.app.enums.AddressPreferenceType;
import com.app.enums.AddressType;

@Entity
public class Address {
	@Id
	private int id;
	private String flat;
	private String building;
	private String apartment;
	private String locality;
	private String landmark;
	private String city;
	private String state;
	private String pincode;
	private AddressType addressType;
	private AddressPreferenceType preference;
	
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
		return preference;
	}
	public void setPreference(AddressPreferenceType preference) {
		this.preference = preference;
	}
}
