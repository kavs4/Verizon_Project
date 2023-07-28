package org.verizon.CusomerApi.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CusomerApi.Model.ServiceModel;
import org.verizon.CusomerApi.Service.ServiceService;

@RestController
@RequestMapping("/api/service")
public class ServiceController {
	private final ServiceService serviceserv;

	@Autowired
	public ServiceController(ServiceService serviceserv) {
		this.serviceserv = serviceserv;

	}

	@RequestMapping("allservice")
	public List<ServiceModel> getAllService() {
		return serviceserv.getAllServices();

	}

	@PostMapping("/insert")
	public ServiceModel createServiceModel(@RequestBody ServiceModel servicemodel) {
		return serviceserv.createservicemodel(servicemodel);

	}

	@GetMapping("FindBy")
	public ServiceModel findServiceModel(@RequestBody ServiceModel servicemodel) {
		return serviceserv.getServiceModelById(200);

	}

	@PostMapping("/update")
	public ServiceModel updateServicemModel(@RequestBody ServiceModel servicemodel) {
		return serviceserv.updateServiceModel(101, servicemodel);

	}

	@DeleteMapping
	public void deleteServiceModel(@RequestBody ServiceModel servicemodel) {

	}
}
