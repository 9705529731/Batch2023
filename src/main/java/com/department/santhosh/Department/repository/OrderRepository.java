package com.department.santhosh.Department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.department.santhosh.Department.entity.OrderEntity;
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{

}
