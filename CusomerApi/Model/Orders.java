package org.verizon.CusomerApi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {
	
	
	//@ManyToOne // Many orders can be taken for one plan
    //@JoinColumn(name = "net_id") // Name of the foreign key column in the order table
    private int net_id;
	
	
	
	@Id
	private int order_id;
	public Orders() {
	}
	public int getnet_id() {
		return net_id;
	}
	public void setnet_id(int net_id) {
		this.net_id = net_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
	
	

	
}