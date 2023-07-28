package org.verizon.CusomerApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.CusomerApi.Model.Orders;
@Repository
public interface OrdersRepo  extends JpaRepository<Orders, Integer> {

}
