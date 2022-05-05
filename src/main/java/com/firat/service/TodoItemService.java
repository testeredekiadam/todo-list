package com.firat.service;

import com.firat.model.TodoData;
import com.firat.model.TodoItem;

public interface TodoItemService {
	void addItem(TodoItem todoItem);
	void removeItem(int id);
	TodoItem getItem(int id);
	void updateItem(TodoItem todoItem);
	TodoData getTodoData();
}
