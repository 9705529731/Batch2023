package com.department.santhosh.Department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.santhosh.Department.entity.DeptEntity;
import com.department.santhosh.Department.service.DeptService;
import com.department.santhosh.Department.service.DeptServiceimpl;

@RestController
public class DepartController {
	@Autowired  private DeptServiceimpl deptServicei;
	@PostMapping("/post")
	public DeptEntity saveDeptEntity(@RequestBody DeptEntity dept ) {
		return deptServicei.saveDeptEntity(dept);
		//kishor done
	}
	@GetMapping("/get")
	 public List<DeptEntity> fetchDepartmentList()
    {
        return deptServicei.fetchDeptEntityList();
    }
	  @PutMapping("/put/{id}")
	  public DeptEntity
	    updateDeptEntity(@RequestBody DeptEntity dept,
	                     @PathVariable("id") Integer deptId)
	    {
	        return deptServicei.updteDeptEntity(dept, deptId);
	    }

	
	    @DeleteMapping("{id}")
	    public String deleteDepartmentById(@PathVariable("id")
	                                       Integer deptId)
	    {
	        deptServicei.deleteDeptEntityById(
	            deptId);
	        return "Deleted Successfully";
	    }
	
	

}
