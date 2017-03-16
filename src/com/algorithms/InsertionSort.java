package com.algorithms;

public class InsertionSort {

    public static Integer[] sort(Integer[] a) {
        Integer[] sorted = a.clone();
        for (int j = 1; j < a.length; j++) {
            int key = sorted[j];
            for (int i = j-1; i >= 0; i--) {
                if (sorted[i] < key) {
                    break;

                }
                sorted[i+1] = sorted[i];
                sorted[i] = key;
            }
        }
        return sorted;
    }
}
