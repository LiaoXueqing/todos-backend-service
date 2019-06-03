package com.demo.todosbackendservice.controller;

import com.demo.todosbackendservice.model.Todo;
import com.demo.todosbackendservice.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getTodos() {
        return todoService.findAll();
    }

    @PostMapping
    public Todo save(@RequestBody Todo todo) {
        return todoService.save(todo);
    }
}
