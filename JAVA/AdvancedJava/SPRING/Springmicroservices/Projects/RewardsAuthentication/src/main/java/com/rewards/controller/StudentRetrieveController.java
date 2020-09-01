package com.rewards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rewards.service.StudentService;

@Controller
public class StudentRetrieveController {
	@Autowired
	StudentService studentService;

	@RequestMapping(method = RequestMethod.GET, value = "/student/save")
	@ResponseBody
	public String  getAllStudents() {
		
				studentService.save();
				return  "succcess";
	}

	

}
