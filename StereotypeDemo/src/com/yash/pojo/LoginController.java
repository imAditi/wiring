package com.yash.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	public LoginController() {	}

}
