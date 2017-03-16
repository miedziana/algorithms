package com.algorithms;

public class Node {
    private int id;
    private Node[] children;

    public Node(int id, Node[] children) {
        this.id = id;
        this.children = children;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Node[] getChildren() {
        return children;
    }

    public void setChildren(Node[] children) {
        this.children = children;
    }
}
