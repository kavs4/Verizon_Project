package org.verizon.CusomerApi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CusomerApi.Model.Orders;
import org.verizon.CusomerApi.Repository.OrdersRepo;




@Service
public class OrdersService {

	private final OrdersRepo orderrepo;
	
	@Autowired
	public OrdersService(OrdersRepo orderrepo) {

		this.orderrepo = orderrepo;
	}
	
	public List<Orders> getAllOrders(){
		return orderrepo.findAll();
	}
	
	public Orders createOrders(Orders orders) {
		return orderrepo.save(orders);
	}
	



}
