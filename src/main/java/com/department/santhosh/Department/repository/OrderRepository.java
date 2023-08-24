package com.department.santhosh.Department.repository;

import org.springframework.data.repository.CrudRepository;

import com.department.santhosh.Department.entity.OrderEntity;

public interface OrderRepository extends CrudRepository<OrderEntity, Integer>{

}
