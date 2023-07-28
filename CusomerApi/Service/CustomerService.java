package org.verizon.CusomerApi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CusomerApi.Model.Catalog;
import org.verizon.CusomerApi.Model.Customer;
import org.verizon.CusomerApi.Repository.CustomerRepo;

@Service
public class CustomerService {
	private final CustomerRepo custrepo;
	
  @Autowired
  public CustomerService(CustomerRepo custrepo) {
	this.custrepo = custrepo;
	  
  }
  
  public List<Customer>getAllCustomer(){
	return custrepo.findAll();
	  
  }
  
  public Customer createCustomer(Customer customer) {
	return custrepo.save(customer);
	
	  
  }
  
	public Customer getCustomerById(Integer c_id) {
		return custrepo.findById(c_id).orElse(null);

	}

	public Customer updateCustomer(Integer c_id, Customer customer) {
		Customer existingCustomer = custrepo.findById(c_id).orElse(null);
		if (existingCustomer != null) {
			existingCustomer.setC_name(customer.getC_name());
			return custrepo.save(existingCustomer);
		}

		return null;

	}
	public  void deleteCustomer(Integer c_id) {
		custrepo.deleteById(c_id);
}
}
