package com.recursivecall;

public class RecursiveCall5 {

    public static void main(String[] args) {

        int num = 4;

        int numberOfCases = recursiveSum(num);

        System.out.println(numberOfCases);
    }

    private static int recursiveSum(int num) {

        if (num == 1) return 1;
        else if (num == 2) return 2;
        else if (num == 3) return 4;

        return recursiveSum(num - 1) + recursiveSum(num - 2) + recursiveSum(num - 3);
    }
}
