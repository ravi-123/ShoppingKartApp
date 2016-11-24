package com.app.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name="SK_Ordered_Items")
public class OrderItem  implements Serializable{
	@ManyToOne
	@JoinColumn(name="Order_Id")
	private Order order;

	@ManyToOne
	@JoinColumn(name = "Item_Id")
	private Item item;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	
	@Column(length=20)
	@Size(min = 3, max = 20)
	@NotNull
	private String itemName;
	private String itemModel;
	private String category;
	private String itemSize;
	private String imgUrl;
	@NotNull
	private int totalQty;
	@NotNull
	private float SP;
	@NotNull
	private float MRP;
	
	private float overallRating;
    
	private String batchNo;
	@Temporal(TemporalType.DATE)
	@Past(message="mfg date shud be past only")
	@NotNull
	private Date mfg;
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date expiry;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemModel() {
		return itemModel;
	}
	public void setItemModel(String itemModel) {
		this.itemModel = itemModel;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getItemSize() {
		return itemSize;
	}
	public void setItemSize(String itemSize) {
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
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public Date getMfg() {
		return mfg;
	}
	public void setMfg(Date mfg) {
		this.mfg = mfg;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
}
