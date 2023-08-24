package com.department.santhosh.Department.service;

import java.util.List;

import com.department.santhosh.Department.entity.OrderEntity;

public interface OrderServiceProj {
	OrderEntity saveOrderEntity(OrderEntity order);
    
    List< OrderEntity> FetchOrderEntity();
    
    OrderEntity UpdateOrderEntity(OrderEntity order,Integer orderId);
    
    void DeleteOrderEntity(Integer orderId);
    

    OrderEntity getOrderEntity(Integer orderId ) throws Exception;
}
