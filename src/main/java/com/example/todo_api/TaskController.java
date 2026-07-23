package com.example.todo_api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import  org.springframework.web.bind.annotation.PutMapping;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
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

    @DeleteMapping("/tasks/{index}")
    public void deleteTask(@PathVariable int index) {
        if(index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    @PutMapping("/tasks/{index}")
    public void completeTask(@PathVariable int index) {
        if (index >= 0 && index < tasks.size()){
            tasks.get(index).setDone(true);
        }
    }
}
