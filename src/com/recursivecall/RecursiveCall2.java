package com.recursivecall;

public class RecursiveCall2 {
    public static void main(String[] args) {

        int result = factorial(5);

        System.out.println(result);

    }

    private static int factorial(int num) {
        if (num > 1) return num * factorial(num - 1);
        else return num;
    }
}
