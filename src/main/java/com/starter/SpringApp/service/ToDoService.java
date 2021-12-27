package com.starter.SpringApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starter.SpringApp.data.ToDo;
import com.starter.SpringApp.exception.EntityNotFoundException;
import com.starter.SpringApp.repository.ToDoRepo;

@Service
public class ToDoService {
	@Autowired
	private ToDoRepo toDoRepo;

	public List<ToDo> findAll() {
		return toDoRepo.findAll();
	}

	public ToDo findOne(String Id) {
		return toDoRepo.findById(Id).orElseThrow(EntityNotFoundException::new);
	}

	public ToDo save(ToDo toDo) {
		return toDoRepo.save(toDo);
	}
	
	public void deleteById(String id) {
		toDoRepo.deleteById(id);
	}

}
