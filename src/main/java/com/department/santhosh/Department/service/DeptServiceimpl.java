package com.department.santhosh.Department.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.santhosh.Department.entity.DeptEntity;
import com.department.santhosh.Department.repository.DeptRepository;
@Service
public class DeptServiceimpl implements DeptService {
@Autowired
   public DeptRepository deptRepository;
	@Override
	public DeptEntity saveDeptEntity(DeptEntity dept) {
		
		return deptRepository.save(dept) ;
	}
	@Override
	public List<DeptEntity> fetchDeptEntityList() {
		 return (List<DeptEntity>)deptRepository.findAll();
	}
		
	@Override
	public DeptEntity updteDeptEntity(DeptEntity dept, Integer deptId) {
		
		DeptEntity depDB
        = deptRepository.findById(deptId)
              .get();

    if (Objects.nonNull(dept.getDeptName())
        && !"".equalsIgnoreCase(
            dept.getDeptName())) {
        depDB.setDeptName(
            dept.getDeptName());
    }

    if (Objects.nonNull(
            dept.getDeptLoc())
        && !"".equalsIgnoreCase(
            dept.getDeptLoc())) {
        depDB.setDeptLoc(
            dept.getDeptLoc());
    }

    if (Objects.nonNull(dept.getDeptPhoneNo())
        && !"".equalsIgnoreCase(
            dept.getDeptPhoneNo())) {
        depDB.setDeptPhoneNo(
            dept.getDeptPhoneNo());
    }

    return deptRepository.save(depDB);
}

      @Override
	public void deleteDeptEntityById(Integer deptId) {
		deptRepository.deleteById(deptId);
		
	}

}