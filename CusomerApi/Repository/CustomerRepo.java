package org.verizon.CusomerApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.CusomerApi.Model.Customer;


@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>  {
	

}
