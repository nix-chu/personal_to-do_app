package com.nix_chu.personaltodoapp;

public class TodoList {
    private final String name = "To Do List"; // TODO: Update name for different types of lists
    private LinkedList tasksList;
    private int tasksCount = 0;

    public TodoList() {
        this.tasksList = new LinkedList();
    }

    public String getName() { return this.name; }
    public LinkedList getTasksList() { return this.tasksList; }
    public int getTasksCount() { return this.tasksCount; }

    public void addTask() {
        // Adds a new task at the end of the list
        Task task = new Task.Builder("First task")
                .date(69)
                .description("This is a description.")
                .location("This is a location")
                .build();
        this.tasksList.append(task);
        this.tasksCount++;
    }
}
