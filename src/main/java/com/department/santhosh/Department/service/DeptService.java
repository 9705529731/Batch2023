package com.department.santhosh.Department.service;

import java.util.List;

import com.department.santhosh.Department.entity.DeptEntity;

public interface DeptService {
	
     DeptEntity saveDeptEntity(DeptEntity dept);
     
     List< DeptEntity> fetchDeptEntityList();
     
     DeptEntity updteDeptEntity(DeptEntity dept,Integer deptId);
     
     void deleteDeptEntityById(Integer deptId);
}
