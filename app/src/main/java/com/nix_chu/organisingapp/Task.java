package com.nix_chu.organisingapp;

import java.util.Date;

public class Task {
    private final String name;
    private final Date date;
    private final String description;
    private final String location;

    private Task(Builder builder) {
        this.name = builder.name;
        this.date = builder.date;
        this.description = builder.description;
        this.location = builder.location;
    }

    public String getName() { return this.name; }
    public Date getDate() { return this.date; }
    public String getDescription() { return this.description; }
    public String getLocation() { return this.location; }

    // When user updates a task's info
    public void setName(String name) { this.name = name; }
    public void setDate(int date) { this.date = new Date(); }
    public void setDescription(String description) {this.description = description; }
    public void setLocation(String location) { this.location = location; }

    public static class Builder {
        // Creates an instance of Task which takes optional arguments
        private String name; // required
        private Date date;
        private String description;
        private String location;

        public Builder(final String name) {
            // All required attributes
            this.name = name;
        }

        public Builder date(final int date) {
            this.date = new Date();
            return this;
        }

        public Builder description(final String description) {
            this.description = description;
            return this;
        }

        public Builder location(final String location) {
            this.location = location;
            return this;
        }

        public Task build() {
            // Build method to create Task
            return new Task(this);
        }
    }
}
