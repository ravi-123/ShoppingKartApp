package com.app.pojo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="SK_Kart_Items")
public class KartItem extends Item{
	
	@ManyToOne
	@JoinColumn(name = "Kart_Id")
	private Kart kart;
	
	@Override
	@Transient
	public float getPP() {
		// TODO Auto-generated method stub
		return super.getPP();
	}
	
}
