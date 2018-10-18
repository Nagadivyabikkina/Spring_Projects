package com.divya.service;

import java.util.List;

import com.divya.model.Emp;

public interface EmpService {
		
	public void addEmp(Emp emp);
	public void deleteEmp(int empId);
	public void updateEmp(Emp emp, int empId);
	public Emp findEmp(int empId);
	public List<Emp> findall();

}
