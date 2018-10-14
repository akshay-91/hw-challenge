package com.honeywell.employeelocationtracker.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.honeywell.employyelocationtracker.dto.EmployeeDTO;

@Component
@Repository
public class EmployeeLocationTrackerDao {

	private final String SELECT_EMPLOYEES = "SELEECT * FROM EMPLOYEES WHERE EMPLOYEE_ID=1";
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public EmployeeDTO getEmployeeLocation() {

		return jdbcTemplate.queryForObject(SELECT_EMPLOYEES,EmployeeDTO.class);
	}

	
	
	
	
}
