package com.dp;

public class DynamicPrograming {

    public static void main(String[] args) {

        int result = sum(10);
        System.out.println(result);

    }

    private static int sum(int num) {
        // num = 10

        // cache = [0,1,2,....9,10]
        int[] cache = new int[num+1];

        cache[0] = 0;
        cache[1] = 1;

        // index = 2,3,4...,9,10
        for (int index = 2; index < num + 1; index++) {
            // index = 5
            // cache[4] = 3
            // cache[3] = 2
            cache[index] = cache[index-1] + cache[index-2];
        }
        return cache[num];
    }
}
