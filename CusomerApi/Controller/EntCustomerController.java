package org.verizon.CusomerApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CusomerApi.Model.Customer;
import org.verizon.CusomerApi.Model.EntCustomer;
import org.verizon.CusomerApi.Service.EntCustomerService;

@RestController
@RequestMapping("/api/entcustomer")
public class EntCustomerController {
	private final EntCustomerService encustserv;
	@Autowired
	public EntCustomerController(EntCustomerService encustserv) {
		this.encustserv = encustserv;
		
	}
	@RequestMapping("allentcustomer")
	public List<EntCustomer>getAllEntCustomer() {
		return encustserv.getAllEntCustomer();
	}

	
	@PostMapping("/insert")
	public EntCustomer createEntCustomer(@RequestBody EntCustomer encustomer) {
		return encustserv.createEntCustomer(encustomer);
	}
	
	@GetMapping("FindBy")
	public EntCustomer findEntCustomer(@RequestBody EntCustomer encustomer) {
		return encustserv.getEntCustomerById(100);

	}


	@PostMapping("/update")
	public EntCustomer updateEntCustomer(@RequestBody EntCustomer encustomer) {
		return encustserv.updateEntCustomer(202,encustomer);

	}


	
@DeleteMapping
public  void deleteEntCustomer(@RequestBody  EntCustomer encustomer) {
	
}
	
	
}
