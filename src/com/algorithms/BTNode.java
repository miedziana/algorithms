package com.algorithms;

public class BTNode {
    int id;
    int data;
    BTNode left, right;

    public BTNode() {

    }

    public BTNode(int id, BTNode left, BTNode right) {
        this.id = id;
        this.left = left;
        this.right = right;
    }

}
