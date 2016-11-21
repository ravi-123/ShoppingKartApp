package com.app.pojo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="SK_Ordered_Items")
public class OrderItem extends Item {
	@ManyToOne
	@JoinColumn(name="Order_Id")
	private Order order;

	@Override
	@Transient
	public float getPP() {
		// TODO Auto-generated method stub
		return super.getPP();
	}	
}
