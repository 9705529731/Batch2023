package com.department.santhosh.Department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.department.santhosh.Department.entity.OrderEntity;
import com.department.santhosh.Department.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService service;
	
	@PostMapping("/order")//8080
	public OrderEntity Save(@RequestBody OrderEntity request) {
		return service.saveOrderEntity(request);
		
	}
	
	@GetMapping("/order")//8080
	public List<OrderEntity> collectionlist(){
		return service.fetchOrderEntity();
		
	}
	
	@PutMapping("/order/{id}")
	public OrderEntity update(@RequestBody OrderEntity req,@PathVariable("id") Integer id ) {
		return service.UpdateOrderEntity(req, id);
		
	}
	@GetMapping("/order/{id}")
	public OrderEntity singleid(@PathVariable("id") Integer id) throws Exception {
		return service.getOrderEntity(id);
		
	}
	@DeleteMapping("/order/{id}")
	public String delete(@PathVariable Integer id) {
		service.DeleteOrderEntity(id);
		return "data successfuly deleted";
		
	}
	@GetMapping("/order/report")
	public String writetofile() {
		
		
		service.getOrderIntoFile();
		return "data transferd into file";
		
	}


	
}
/*
 * Order Table - id, name, details, phnumber, address Order - Create (Post -
 * /order/) - Update (put - /order/{id}) - get all (get - /order/) - get sigle
 * customer (get - /order/{id}) - delete (delete - /order/{id}) - sendReport
 * (GET -/order/Report/{To email id}) (list of order ids) -- get all the order
 * and create create a file and store the the order data and send the mail to
 * given mail ids with report.
 */