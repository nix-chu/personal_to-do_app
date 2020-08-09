package com.nix_chu.organisingapp;

import java.util.ArrayList;

public class TodoList {
    private final String name = "To Do List"; // TODO: Update name for different types of lists
    private ArrayList<Task> tasksList;
    private int tasksCount = 0;

    public TodoList() {
        this.tasksList = new ArrayList<Task>();
    }

    public String getName() { return this.name; }
    public ArrayList<Task> getTasksList() { return this.tasksList; }
    public int getTasksCount() { return this.tasksCount; }

    public void addTask() {
        Task task = new Task.Builder("First task")
                .date()
                .description("This is a description.")
                .location("This is a location");
        this.tasksList.add(task);
        this.tasksCount++;
    }
}
