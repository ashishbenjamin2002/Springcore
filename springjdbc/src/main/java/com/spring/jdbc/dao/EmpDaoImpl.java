package com.spring.jdbc.dao;

import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Employee;

public class EmpDaoImpl implements EmpDao{
	
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Employee employee) {
		// TODO Auto-generated method stub
		
		String q = "insert into emp_data(eid,ename,dname) values(?,?,?)";
		int r = this.jdbcTemplate.update(q,employee.getEid(), employee.getEname(), employee.getDname());
		return r;

	}
	public int update(Employee employee) {
		String u="Update Employee set ename=? ";
		int r=this.jdbcTemplate.update(u,employee.getEname(),employee.getEid());
		return r;
	}
	public int delete(Employee employee) {
		String u="Delete from Employee where eid=? ";
		int r=this.jdbcTemplate.update(u,employee.getEid());
		return r;
	}

	@Override
	public Employee getEmployee(int eid) {
		// TODO Auto-generated method stub
		String ca="select *from Employee where Eid=?";
		RowMapper<Employee> rm=new RowMapperImpl();
		Employee employee=this.jdbcTemplate.queryForObject(ca, rm, eid);
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		String a="select *from Employee";
		List<Employee> employee=this.jdbcTemplate.query(a, new RowMapperImpl());
		return employee;
	}
	

}