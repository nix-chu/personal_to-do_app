package com.nix_chu.organisingapp;

import java.util.Date;

public class Task {
    private final String name;
    private final Date date;
    private final String description;
    private final String location;

    private Task(TaskBuilder builder) {
        this.name = builder.name;
        this.date = builder.date;
        this.description = builder.description;
        this.location = builder.location;
    }

    public String getName() { return name; }
    public Date getDate() { return date; }
    public String getDescription() { return description; }
    public String getLocation() { return location; }

    public static class TaskBuilder {
        // Creates an instance of Task which takes optional arguments
        private String name; // required
        private Date date;
        private String description;
        private String location;

        public TaskBuilder(String name) {
            // All required attributes
            this.name = name;
        }

        public TaskBuilder date(final int date) {
            this.date = new Date();
            return this;
        }

        public TaskBuilder description(final String description) {
            this.description = description;
            return this;
        }

        public TaskBuilder location(final String location) {
            this.location = location;
            return location;
        }

        public Task build() {
            // Build method to create Task
            return new Task(this);
        }
    }
}
