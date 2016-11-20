package com.app.pojo;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

@Embeddable
public class ItemDetails {
	private String batchNo;
	@Temporal(TemporalType.DATE)
	@Past(message="mfg date shud be past only")
	@NotNull
	private Date mfg;
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date expiry;
	@NotNull
	private float PP;
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
	public float getPP() {
		return PP;
	}
	public void setPP(float pP) {
		PP = pP;
	}
	
	
}
