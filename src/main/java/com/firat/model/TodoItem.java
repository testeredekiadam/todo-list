package com.firat.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of="id")
/*@EqualsAndHashCode(of={"id", "title"}) -> for multiple*/
public class TodoItem {
	
	// == fields ==
	private int id;
	private String title;
	private String details;
	private LocalDate deadline;
	
	// == constructors ==
	public TodoItem( String title, String details, LocalDate dateLine) {
		this.title = title;
		this.details = details;
		this.deadline = dateLine;
	}	
}
