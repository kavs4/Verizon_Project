package org.verizon.CusomerApi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Customer {
	@Id
	private int c_id;
	@ManyToOne
	@JoinColumn(name="order_id")
	private Orders orders;
	private String c_name;
	
	public void setOrders(Orders orders) {
		this.orders=orders;
	}
	
	public Customer() {
		
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	
	
	

}
