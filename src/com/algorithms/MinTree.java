package com.algorithms;

public class MinTree {

    public static BTNode minTreeNode(int[] array, int start, int end) {
        if (end < start) {
            return null;
        }
        int pivot = (start + end) / 2;
        BTNode node = new BTNode(array[pivot], null, null);
        node.left = minTreeNode(array, start, pivot - 1);
        node.right = minTreeNode(array, pivot + 1, end);
        return node;
    }

}
