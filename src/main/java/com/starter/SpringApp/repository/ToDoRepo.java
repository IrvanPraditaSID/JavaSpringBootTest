package com.starter.SpringApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.starter.SpringApp.data.ToDo;

public interface ToDoRepo extends MongoRepository<ToDo, String> {
}
