package org.verizon.CusomerApi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Catalog {
	@Id
	private int net_id;
	private String net_name;

	public Catalog() {
		super();
	}

	public int getNet_id() {
		return net_id;
	}

	public void setNet_id(int net_id) {
		this.net_id = net_id;
	}

	public String getNet_name() {
		return net_name;
	}

	public void setNet_name(String net_name) {
		this.net_name = net_name;
	}

}
