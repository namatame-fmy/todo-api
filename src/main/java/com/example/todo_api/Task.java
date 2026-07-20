package com.example.todo_api;

public class Task {
    private String content;
    private boolean done;

    public  Task(String content){
        this.content = content;
        this.done = false;
    }

    public String getContent(){
        return content;
    }

    public boolean isDone() {
        return done;
    }
}
