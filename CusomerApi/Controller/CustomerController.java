package org.verizon.CusomerApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CusomerApi.Model.Catalog;
import org.verizon.CusomerApi.Model.Customer;
import org.verizon.CusomerApi.Service.CustomerService;



@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	private final CustomerService custserv;
	@Autowired
	public CustomerController(CustomerService custserv) {
		this.custserv = custserv;
		
	}
	@RequestMapping("allcustomer")
	public List<Customer>getAllCustomer(){
		return custserv.getAllCustomer();
		
	}
	
	@PostMapping("/insert")
	public Customer createCustomer(@RequestBody Customer customer) {
		return custserv.createCustomer(customer);
		
	}
	
	@GetMapping("FindBy")
	public Customer findCustomer(@RequestBody Customer customer) {
		return custserv.getCustomerById(100);

	}


	@PostMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return custserv.updateCustomer(101, customer);

	}


	
@DeleteMapping
public  void deleteCustomer(@RequestBody  Customer customer) {
	
}
	
}
	