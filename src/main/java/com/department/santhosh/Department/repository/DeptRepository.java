package com.department.santhosh.Department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.department.santhosh.Department.entity.DeptEntity;
@Repository
public interface DeptRepository extends JpaRepository<DeptEntity, Integer>{

}
