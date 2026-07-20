package com.example.todo_api;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TaskController {
    private List<Task> tasks = new ArrayList<>();

    public TaskController(){
        tasks.add(new Task("牛乳を買う"));
        tasks.add(new Task("掃除をする"));
    }

    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return tasks;
    }

    @PostMapping("/tasks")
    public  Task addTask(@RequestBody Task newTask){
        tasks.add(newTask);
        return newTask;
    }
}
