package com.divya.Main;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.divya.config.AppConfig;
import com.divya.model.Emp;
import com.divya.service.EmpService;

public class Appmain {
	
	public static void main(String[] args) {
		AbstractApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmpService empService = (EmpService) context.getBean("empService");
		
		Emp e1=new Emp(1007, "Dev", 12345);
		Emp e2=new Emp(1008, "kevin", 50000);
		Emp e3=new Emp(1009, "steve", 59000);
		Emp e4=new Emp(1006, "John", 129221);
		
		empService.addEmp(e1);
		empService.addEmp(e2);
		empService.addEmp(e3);
		
		System.out.println("Retrive all employess");
		List<Emp> emps=empService.findall();
		
		for(Emp emptemps:emps)
		{
			System.out.println(emptemps);
		}
		
		emps.forEach(System.out::println);
		
		System.out.println("Retrieve employees based on Id");
		Emp e6=empService.findEmp(1001);
		System.out.println(e6);
		
		System.out.println("update Employees based on Id");
		e1.setEmpName("Divya");
		e1.setEmpSal(53412);
		
		int empNumupdate=1009;
		empService.updateEmp(e1, empNumupdate);
		System.out.println(e1);
		
		System.out.println("delete employees based on Id=1009");
		int empDelete=1006;
		
		empService.deleteEmp(empDelete);
		emps.forEach(System.out::println);
		context.close();
	}
	
}
