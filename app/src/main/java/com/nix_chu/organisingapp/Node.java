package com.nix_chu.organisingapp;

public class Node {
    private Task item;
    private Node link;

    Node(Task task) {
        this.item = task;
    }

    public Task getItem() { return this.item; }
    public Node getLink() { return this.link; }

    public void setLink(Node node) {
        this.link = node;
    }
}
