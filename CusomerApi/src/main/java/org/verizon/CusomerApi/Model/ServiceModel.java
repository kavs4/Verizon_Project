package org.verizon.CusomerApi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ServiceModel {
	@Id
	private int service_id;
	@ManyToOne
	@JoinColumn(name="net_id")
	private Catalog catalog;
	private String service_name;
	private String Test_qos;
	private String activity;

	public ServiceModel() {

	}
	public Catalog getCatalog() {
		return catalog;
		
	}
	public void setCatalog(Catalog catalog) {
		this.catalog=catalog;
	}

	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public String getTest_qos() {
		return Test_qos;
	}

	public void setTest_qos(String test_qos) {
		Test_qos = test_qos;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

}