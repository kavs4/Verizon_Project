package org.verizon.CusomerApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.CusomerApi.Model.ServiceModel;


@Repository
public interface ServiceRepo extends JpaRepository<ServiceModel,Integer>  {

}