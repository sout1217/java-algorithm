package com.recursivecall;


public class RecursiveCall4 {

    public static void main(String[] args) {

        int num = 3;

        int result = EvenOddRe(num);

    }

    private static int EvenOddRe(int num) {
        System.out.println(num);

        if (num <= 1) {
            return num;
        }

        if (num % 2 == 0) return EvenOddRe(num / 2);
        else return EvenOddRe(3 * num + 1);
    }
}
