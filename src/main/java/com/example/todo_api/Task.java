package com.example.todo_api;

public class Task {
    private String content;
    private boolean done;

    public  Task(String content){
        this.content = content;
        this.done = false;
    }

    public Task(){}

    public String getContent(){
        return content;
    }

    public boolean isDone() {
        return done;
    }

    public void setContent(String content){
        this.content = content;
    }

    public void setDone(boolean done){
        this.done = done;
    }
}
