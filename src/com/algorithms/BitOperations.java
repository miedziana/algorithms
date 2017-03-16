package com.algorithms;

public class BitOperations {

    public static int insertNintoM(int n, int m, int i, int j) {
        int current;
        int mask;

        for (int k = i; k <= j; k++) {
            current = m & 1;

            mask = ~(1 << k);
            n = (n & mask) | (current << k);
            System.out.println("current: " + Integer.toBinaryString(current)
                    + " mask:" + Integer.toBinaryString(mask)
                    + " n " + Integer.toBinaryString(n)
                    + " m " + Integer.toBinaryString(m));
            m = m >> 1;
        }
        return n;
    }
}
