package com.divya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divya.DAO.EmpDAO;
import com.divya.model.Emp;

@Service("empService")
public class EmpServiceImpl implements EmpService{
	
	
	@Autowired
	EmpDAO empdao;

	@Override
	public void addEmp(Emp emp) {
		// TODO Auto-generated method stub
		
		empdao.addEmp(emp);
	}

	@Override
	public void deleteEmp(int empId) {
		// TODO Auto-generated method stub
		empdao.deleteEmp(empId);
		
	}

	@Override
	public void updateEmp(Emp emp, int empId) {
		// TODO Auto-generated method stub
		empdao.updateEmp(emp, empId);
		
	}

	@Override
	public Emp findEmp(int empId) {
		// TODO Auto-generated method stub
		return empdao.findEmp(empId);
	}

	@Override
	public List<Emp> findall() {
		// TODO Auto-generated method stub
		return empdao.findall();
	}

	
	
}
