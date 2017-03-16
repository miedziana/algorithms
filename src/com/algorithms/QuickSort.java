package com.algorithms;

public class QuickSort {

    public static Integer[] sort(Integer[] array) {
        Integer[] sorted = array.clone();
        return quicksort(sorted, 0, sorted.length - 1);
    }

    private static Integer[] quicksort(Integer[] sorted, int p, int r) {
        if(p < r) {
            int q = partition(sorted, p, r);
            quicksort(sorted, p, q - 1);
            quicksort(sorted, q + 1, r);
        }
        return sorted;
    }

    private static int partition(Integer[] sorted, int p, int r) {
        int x = sorted[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {

            if (sorted[j] <= x) {
                i++;
                int temp = sorted[i];
                sorted[i] = sorted[j];
                sorted[j] = temp;
            }
        }
        i++;
        sorted[r] = sorted[i];
        sorted[i] = x;
        return i;
    }
}
