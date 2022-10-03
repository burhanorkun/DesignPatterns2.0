package com.orkun.factorial;

import java.math.BigInteger;

public class Solution2 {
    public static void main(String[] args) {
        int N = 500;
        System.out.println(factorial(N));
    }

    private static BigInteger factorial(int N){
        BigInteger f = new BigInteger("1");
        // Multiply f with 2, 3, ...N
        for(int i =2; i<=N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }
}
