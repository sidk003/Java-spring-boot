package com.javaspringboot.springbootfirstwebapp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.javaspringboot.springbootfirstwebapp.model.Todo;
import com.javaspringboot.springbootfirstwebapp.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		//Date : DD/MM/YYYY
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,false));
	}
	
	@RequestMapping(value="/list-todos",method = RequestMethod.GET)
	public String showloginPage(ModelMap model) {
		String name = getLoggedInUserName(model);
		model.put("todos",service.retrieveTodos(name));
		return "list-todos";
	}

	private String getLoggedInUserName(ModelMap model) {
		String name = (String)model.get("name");
		return name;
	}
	
	@RequestMapping(value="/add-todos",method = RequestMethod.GET)
	public String showAddTodos(ModelMap model) {
		model.addAttribute("todo", new Todo(0, getLoggedInUserName(model),"",new Date(),false));
		return "todo";
	}
	
	@RequestMapping(value="/delete-todo",method = RequestMethod.GET)
	public String deleteTodo(@RequestParam int id) {
		service.deleteTodo(id);
		return "redirect:/list-todos";
	}
	
	@RequestMapping(value="/update-todo",method = RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
		Todo todo = service.retrieveTodos(id);
		model.put("todo", todo);
		return "todo";
	}
	
	@RequestMapping(value="/update-todo",method = RequestMethod.POST)
	public String updateTodo( ModelMap model,Todo todo) {
		todo.setUser(getLoggedInUserName(model));
		service.updateTodo(todo);
		return "redirect:/list-todos";
	}
	
	
	@RequestMapping(value="/add-todos",method = RequestMethod.POST)
	public String addTodos(ModelMap model, Todo todo) {
		service.addTodo((String)model.get("name"), todo.getDesc(), todo.getTargetDate(), false);
		return "redirect:/list-todos";
	}
	
	

}
