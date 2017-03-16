package com.algorithms;

import java.math.BigInteger;
import java.util.Arrays;

public class StepCounter {

    public static BigInteger count(int n) {
        BigInteger[] memo = new BigInteger[n + 1];
        Arrays.fill(memo, BigInteger.valueOf(-1L));
        return count(n, memo);
    }

    private static BigInteger count(int n, BigInteger[] memo) {
        if (n < 0) {
            return BigInteger.ZERO;
        } else if (n == 0) {
            return BigInteger.ONE;
        } else if (!BigInteger.valueOf(-1L).equals(memo[n])) {
            return memo[n];
        } else {
            memo[n] = count(n - 1, memo).add(count(n - 2, memo)).add(count(n - 3, memo));
            return memo[n];
        }
    }
}
