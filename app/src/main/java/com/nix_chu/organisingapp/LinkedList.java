package com.nix_chu.organisingapp;

public class LinkedList {
    private Node head;
    public int length;

    LinkedList() {
        this.length = 0;
    }

    private void setHead(Node node) { this.head = node; } // Only use when inserting an item at head

    public void insert(int index, Task task) {
        // Insert an item (the task) at the index specified
        final Node newNode = new Node(task);
        if (index == 0) {
            newNode.setLink(this.head);
            this.setHead(newNode);
        }
        elif (index == this.length) {
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

    public Node findNode(int index) {
        if (index < 0 || index > this.length) {
            throw new ArrayIndexOutOfBoundsException();
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
