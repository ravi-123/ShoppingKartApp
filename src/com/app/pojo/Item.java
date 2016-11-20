package com.app.pojo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="SK_Item")
public class Item {
	@Id	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Size(min = 3, max = 20)
	@Column(length=20)
	@NotNull
	private String name;
	private String model;
	private String itemSize;
	private String imgUrl;
	@NotNull
	private int totalQty;
	@NotNull
	private float SP;
	@NotNull
	private float MRP;
	private float overallRating;
	@Embedded
	private ItemDetails details;
	
    @OneToMany
    @JoinTable(name="SK_Item_Reviews",
    joinColumns=@JoinColumn(name="Item_Id"),
    inverseJoinColumns=@JoinColumn(name="Review_Id"))
	private Collection<Review> reviews = new ArrayList<Review>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getItemSize() {
		return itemSize;
	}

	public void setSize(String itemSize) {
		this.itemSize = itemSize;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}

	public void setItemSize(String itemSize) {
		this.itemSize = itemSize;
	}

	public float getSP() {
		return SP;
	}

	public void setSP(float sP) {
		SP = sP;
	}

	public float getMRP() {
		return MRP;
	}

	public void setMRP(float mRP) {
		MRP = mRP;
	}

	public float getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(float overallRating) {
		this.overallRating = overallRating;
	}

	public ItemDetails getDetails() {
		return details;
	}

	public void setDetails(ItemDetails details) {
		this.details = details;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Collection<Review> reviews) {
		this.reviews = reviews;
	}

}
