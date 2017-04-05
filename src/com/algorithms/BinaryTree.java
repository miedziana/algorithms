package com.algorithms;

public class BinaryTree {

    private BTNode root;

    BinaryTree() {

    }

    BinaryTree(BTNode root) {
        this.root = root;
    }

    public BTNode getRoot() {
        return root;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }
}
