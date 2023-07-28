package org.verizon.CusomerApi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EntCustomer {
	@Id
	private int enc_id;
	@ManyToOne
	@JoinColumn(name="net_id")
	private Orders orders;
	private String enc_name;

	
	public void setOrders(Orders orders) {
		this.orders=orders;
	}
	

	public EntCustomer() {

	}

	public int getEnc_id() {
		return enc_id;
	}

	public void setEnc_id(int enc_id) {
		this.enc_id = enc_id;
	}

	public String getEnc_name() {
		return enc_name;
	}

	public void setEnc_name(String enc_name) {
		this.enc_name = enc_name;
	}


}
