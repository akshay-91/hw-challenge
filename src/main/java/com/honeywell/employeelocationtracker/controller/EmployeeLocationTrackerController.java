package com.honeywell.employeelocationtracker.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.employeelocationtracker.dao.EmployeeLocationTrackerDao;
import com.honeywell.employyelocationtracker.dto.EmployeeDTO;
import com.honeywell.employyelocationtracker.dto.StatusDTO;

@RestController
@RequestMapping(value = "/employeelocationtracker")
public class EmployeeLocationTrackerController {

	@Autowired
	EmployeeLocationTrackerDao employeeLocationTrackerDao;

	@RequestMapping(value = "/getEmployeeLocation", method = RequestMethod.GET, produces = "application/json")
	public Integer getEmployeeLocation(@RequestParam("empId") Integer empId) {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		try {
			employeeDTO = employeeLocationTrackerDao.getEmployeeLocation();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeeDTO.getEmployeeId();
	}

}
