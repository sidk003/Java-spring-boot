package com.javaspringboot.springbootfirstwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaspringboot.springbootfirstwebapp.service.LoginService;
import com.javaspringboot.springbootfirstwebapp.service.TodoService;

@Controller
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos",method = RequestMethod.GET)
	public String showloginPage(ModelMap model) {
		model.put("todos",service.retrieveTodos("siddhantk0305"));
		return "list-todos";
	}
	

}