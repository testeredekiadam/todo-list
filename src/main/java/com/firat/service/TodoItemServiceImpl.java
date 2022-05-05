package com.firat.service;

import org.springframework.stereotype.Service;

import com.firat.model.TodoData;
import com.firat.model.TodoItem;

import lombok.Getter;

@Service
public class TodoItemServiceImpl implements TodoItemService{
	


	// == fields ==
	@Getter
	private final TodoData todoData = new TodoData();
	
	// == public methods ==
	
	@Override
	public void addItem(TodoItem todoItem) {
		todoData.addItem(todoItem);
		
	}

	@Override
	public void removeItem(int id) {
		todoData.removeItem(id);
		
	}

	@Override
	public TodoItem getItem(int id) {
		return todoData.getItem(id);
	}

	@Override
	public void updateItem(TodoItem todoItem) {
		todoData.updateItem(todoItem);
	}



	
}
