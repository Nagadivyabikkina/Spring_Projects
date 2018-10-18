package com.divya.model;

public class Emp {

	private int empId;
	
	private String empName;
	
	private int empSal;
	
	public Emp() {}
	
	public Emp(int empId, String Empname, int empSal)
	{
		this.empId=empId;
		this.empName=Empname;
		this.empSal=empSal;
	}
	

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
}
