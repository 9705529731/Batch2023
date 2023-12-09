package com.department.santhosh.Department.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DeptEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	private String deptName;
	private String deptLoc;
	private String deptPhoneNo;

	public DeptEntity() {

	}

	public DeptEntity(int deptId, String deptName, String deptLoc, String deptPhoneNo) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
		this.deptPhoneNo = deptPhoneNo;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLoc() {
		return deptLoc;
	}

	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}

	public String getDeptPhoneNo() {
		return deptPhoneNo;
	}

	public void setDeptPhoneNo(String deptPhoneNo) {
		this.deptPhoneNo = deptPhoneNo;
	}

	@Override
	public String toString() {
		return "DeptEntity [deptId=" + deptId + ", deptName=" + deptName + ", deptLoc=" + deptLoc + ", deptPhoneNo="
				+ deptPhoneNo + "]";
	}

}
