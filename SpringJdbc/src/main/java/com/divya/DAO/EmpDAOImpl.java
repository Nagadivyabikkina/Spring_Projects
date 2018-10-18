package com.divya.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.divya.model.Emp;

@Repository
public class EmpDAOImpl implements EmpDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void addEmp(Emp emp) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into emp_batch36(eno,ename,esal) values(?,?,?)",
				emp.getEmpId(), emp.getEmpName(), emp.getEmpSal());
		
		System.out.println("Emp added");
		
		
		
	}
	
	

	@Override
	public void deleteEmp(int empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmp(Emp emp, int empId) {
		// TODO Auto-generated method stub
		
		jdbcTemplate.update("update emp_batch36 set ename=?,esal=? where eno=?",
				empId, emp.getEmpName(), emp.getEmpSal());
		
		System.out.println("Emp updated");
		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Emp findEmp(int empId) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unchecked")
		Emp emp=(Emp) jdbcTemplate.queryForObject("Select * from emp_batch36 where eno=?",
				new Object[] {empId}, new BeanPropertyRowMapper(Emp.class));
		
		return emp;
		
		
	}
	 @SuppressWarnings("rawtypes")
	    
	    
	    public List<Emp> findall() {
	        
	return jdbcTemplate.query("select * from emp_batch36", new RowMapper<Emp>(){

	            @Override
	            public Emp mapRow(ResultSet rs, int rowNumber) throws SQLException {
	                Emp e=new Emp();
	                e.setEmpId(rs.getInt(1));
	                e.setEmpName(rs.getString(2));
	                e.setEmpSal(rs.getInt(3));
	                
	                return e;
	            }
	            
	            
	        });
	    }

	      
	    public Emp find(int empId) {
	        Emp emp=(Emp) jdbcTemplate.queryForObject("select * from emp_batch36 where eno=?",
	      new Object[]{empId},new CustomMapper());
	        return emp;
	    }
	}

	class CustomMapper implements RowMapper{

	    public Object mapRow(ResultSet rs, int rowNumber) throws SQLException {
	        Emp ee=new Emp();
	        ee.setEmpId(rs.getInt(1));
	        ee.setEmpName(rs.getString(2));
	        ee.setEmpSal(rs.getInt(3));
	        return ee;
	    }

	}