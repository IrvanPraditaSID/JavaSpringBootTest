package com.starter.SpringApp.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.starter.SpringApp.data.ToDo;

public interface ToDoRepo extends MongoRepository<ToDo, String> {
}
