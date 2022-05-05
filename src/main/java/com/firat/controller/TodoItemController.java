package com.firat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.firat.model.TodoData;
import com.firat.service.TodoItemService;
import com.firat.util.Mappings;
import com.firat.util.ViewNames;

@Controller
public class TodoItemController {
	
	// == fields ==
	private final TodoItemService todoItemService;
	
	
	// == constructors ==
	@Autowired
	public TodoItemController(TodoItemService todoItemService) {
		this.todoItemService = todoItemService;
	}


	// == model attributes ==
	@ModelAttribute
	public TodoData todoData() {
		return todoItemService.getTodoData();
	}
	


	// == handler methods ==
	// http://localhost:8080/todo-list/items
	@GetMapping(Mappings.ITEMS)
	public String items() {
		return ViewNames.ITEMS_LIST;
	}
}
