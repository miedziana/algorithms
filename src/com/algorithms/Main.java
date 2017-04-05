package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        createMinHeightTree(new int[] {1, 5, 6, 9, 11, 13});

    }

    public static BinaryTree createMinHeightTree(int[] array) {
        BTNode minHeightTreeRoot = createMinHeightTree(array, 0, array.length - 1);
        return new BinaryTree(minHeightTreeRoot);
    }

    private static BTNode createMinHeightTree(int[] array, int start, int end) {
        if (end < start) {
            return null;
        }
        BTNode node = new BTNode();
        int middle = (start + end) / 2;
        node.data = array[middle];
        node.left = createMinHeightTree(array, start, middle - 1);
        node.right = createMinHeightTree(array, middle + 1, end);
        return node;
    }

}
