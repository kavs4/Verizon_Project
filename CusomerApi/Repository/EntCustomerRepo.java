package org.verizon.CusomerApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.CusomerApi.Model.EntCustomer;


@Repository
public interface EntCustomerRepo extends JpaRepository<EntCustomer,Integer>  {

}

