package com.nix_chu.organisingapp;

public class LinkedList {
    private Node head;
    public int length;

    LinkedList() {
        this.length = 0;
    }

    private void setHead(Node node) { this.head = node; } // Only use when inserting an item at head

    private boolean isEmpty() {
        // Return boolean if list is empty
        return this.length == 0;
    }

    public void insert(int index, Task task) {
        // Insert task at the index specified
        final Node newNode = new Node(task);
        if (index == 0) {
            newNode.setLink(this.head);
            this.setHead(newNode);
        }
        else if (index == this.length) {
            final Node previousNode = this.findNode(index);
            previousNode.setLink(newNode);
        }
        else {
            final Node previousNode = this.findNode(index - 1);
            newNode.setLink(previousNode.getLink());
            previousNode.setLink(newNode);
        }
        this.length++;
    }

    public void append(Task task) {
        // Adds the given task at the end of the list
        this.insert(this.length, task);
    }

    public void delete(int index) {
        // Delete task at index
        if (this.isEmpty()) {
            throw new NullPointerException("List is empty.");
        }
        else if (index == 0) {
            this.head = this.head.getLink();
        }
        else {
            Node previousNode = this.findNode(index - 1);
            Node nextNode = previousNode.getLink().getLink();
            previousNode.setLink(nextNode);
        }
        this.length--;
    }
    public void clear() {
        // Clear all tasks
        this.length = 0;
        this.head = null;
    }

    public Task getTask(int index) {
        // Return the task at index
        // TODO: Perhaps change this to the task name given
        if (this.isEmpty()) {
            throw new NullPointerException("List is empty.");
        }
        return this.findNode(index).getItem();
    }

    private Node findNode(int index) {
        // Find the task at index provided and return
        if (index < 0 || index > this.length) {
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds.");
        }
        else {
            Node currentNode = this.head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getLink();
            }
            return currentNode;
        }
    }
}
