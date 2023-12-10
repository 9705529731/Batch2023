package com.department.santhosh.Department.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.department.santhosh.Department.entity.OrderEntity;
import com.department.santhosh.Department.repository.OrderRepository;
@Service


public class OrderService implements OrderServiceProj{

	 @Value("${output.file.path}")
	    private String outputFilePath;
	
	@Autowired
	public OrderRepository repoistory;
	@Override
	
	public OrderEntity saveOrderEntity(OrderEntity order) {
		
		return repoistory.save(order);
	}

	@Override
	public List<OrderEntity> fetchOrderEntity() {
		return (List<OrderEntity>)repoistory.findAll();
	}

	@Override
	public OrderEntity UpdateOrderEntity(OrderEntity order, Integer orderId) {
		
		OrderEntity DbStore = repoistory.findById(orderId).get();
		
		if(Objects.nonNull(order.getName())&&!"".equalsIgnoreCase(order.getName())) {
			DbStore.setName(order.getName());
		}
		
		if(Objects.nonNull(order.getDetails())&&!"".equalsIgnoreCase(order.getDetails())) {
			DbStore.setDetails(order.getDetails());
		}
		if(Objects.nonNull(order.getPhNo())&&!"".equalsIgnoreCase(order.getPhNo())) {
			DbStore.setPhNo(order.getPhNo());
		}
		if(Objects.nonNull(order.getAddress())&&!"".equalsIgnoreCase(order.getAddress())) {
			DbStore.setAddress(order.getAddress());
		}
		
		
		
		return repoistory.save(DbStore);
	}

	
	@Override
	public void DeleteOrderEntity(Integer orderId) {
		repoistory.deleteById(orderId);
		
	}

	@Override
	public OrderEntity getOrderEntity(Integer orderId) throws Exception {
		Optional<OrderEntity> optionalOrderEntity = repoistory.findById(orderId);
		if(optionalOrderEntity.isPresent())
			return optionalOrderEntity.get();
		else
			throw new Exception("record not found with id "+orderId);
	}

	@Override
	public List<OrderEntity> getOrderIntoFile() {
		
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath+"/proj8.txt"))) {
	        List<OrderEntity> store = repoistory.findAll();
	        
	        writer.write("id address details name phNo");
	        writer.newLine();
	        for (OrderEntity order : store) {
	            writer.write(order.toString());
	            writer.newLine();
	        }
	        writer.flush();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		return null;
		
	}

	
	

	}

	
	


