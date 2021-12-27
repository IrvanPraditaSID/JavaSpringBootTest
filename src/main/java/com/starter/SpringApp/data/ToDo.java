package com.starter.SpringApp.data;

import org.springframework.data.annotation.Id;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ToDo {

	@Id
	private String id;

	private String title;

	private Boolean completed;

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Boolean getCompleted() {
		return completed;
	}

}
