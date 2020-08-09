package com.nix_chu.organisingapp;

public class Node {
    private Task item;
    private Node next;

    Node(Task task) {
        this.item = task;
    }

    public Task getItem() { return this.item; }
    public Node getNext() { return this.next; }

    public void setNext(Node node) {
        this.next = node;
    }
}
