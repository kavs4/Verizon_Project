package org.verizon.CusomerApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CusomerApi.Model.Orders;
import org.verizon.CusomerApi.Service.OrdersService;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {

	private OrdersService orderservice;

	@Autowired
	public OrdersController(OrdersService orderservice) {

		this.orderservice = orderservice;
	}

	@RequestMapping("/allorder")
	public List<Orders> getAllOrdermodel() {
		return orderservice.getAllOrders();

	}

	@PostMapping("/inserorder")
	public Orders createOrdermodel(@RequestBody Orders orders) {
		return orderservice.createOrders(orders);

	}

}
