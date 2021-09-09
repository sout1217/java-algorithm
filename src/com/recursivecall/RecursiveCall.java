package com.recursivecall;

public class RecursiveCall {

    public static void main(String[] args) {

        int result = factorial(5);

        System.out.println(result);

    }

    private static int factorial(int num) {
        // 5 * factorial(4) * factorial(3) * factorial(2) * factorial(1)-1
        if (num < 2) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
