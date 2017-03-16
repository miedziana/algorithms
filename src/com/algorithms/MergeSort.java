package com.algorithms;

public class MergeSort {
    public static Integer[] sort(Integer[] a) {
        Integer[] sorted = a.clone();
        return mergeSort(sorted, 0, a.length-1);
    }

    private static Integer[] mergeSort(Integer[] array, int p, int r) {
        if (p < r) {
            int q = (p + r)/2;
            mergeSort(array, p, q);
            mergeSort(array, q+1, r);
            merge(array, p, q, r);
        }
        return array;
    }

    private static Integer[] merge(Integer[] array, int  p, int q, int r) {

        Integer[] temp = array.clone();


        for (int i = p, j = q+1, k = p; k <= r; k++) {
            if(j > r || (i <= q  && temp[i] <= temp[j])) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
        }
        return array;
    }
}
