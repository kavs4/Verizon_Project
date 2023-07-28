package org.verizon.CusomerApi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CusomerApi.Model.EntCustomer;
import org.verizon.CusomerApi.Repository.EntCustomerRepo;

@Service
public class EntCustomerService {

	private final EntCustomerRepo encustrepo;

	@Autowired
	public EntCustomerService(EntCustomerRepo encustrepo) {
		this.encustrepo = encustrepo;

	}

	public List<EntCustomer> getAllEntCustomer() {
		return encustrepo.findAll();

	}

	public EntCustomer createEntCustomer(EntCustomer encustomer) {
		return encustrepo.save(encustomer);

	}

	public EntCustomer getEntCustomerById(Integer enc_id) {
		return encustrepo.findById(enc_id).orElse(null);

	}

	public EntCustomer updateEntCustomer(Integer enc_id, EntCustomer encustomer) {
		EntCustomer existingEntCustomer = encustrepo.findById(enc_id).orElse(null);
		if (existingEntCustomer != null) {
			existingEntCustomer.setEnc_name(encustomer.getEnc_name());
			encustrepo.save(existingEntCustomer);
		}

		return null;

	}

	public void deleteEntCustomer(Integer enc_id) {
		encustrepo.deleteById(enc_id);
	}
}
