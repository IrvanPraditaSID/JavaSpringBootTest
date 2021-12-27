package com.starter.SpringApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starter.SpringApp.data.ToDo;
import com.starter.SpringApp.service.ToDoService;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {
	@Autowired
	private ToDoService toDoService;

	@GetMapping
	public List<ToDo> findAll() {
		return toDoService.findAll();
	}

	@GetMapping("/{id}")
	public ToDo getById(@PathVariable String id) {
		return toDoService.findOne(id);
	}

	@PostMapping
	public ToDo create(@RequestBody ToDo toDo) {
		return toDoService.save(toDo);
	}

	@PutMapping("/{id}")
	public ToDo updateById(@RequestBody ToDo toDo) {
		return toDoService.save(toDo);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable String id) {
		toDoService.deleteById(id);
	}
}
