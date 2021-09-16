package com.recursivecall;

import java.util.Arrays;

public class Palindrome {

    public static void main(String[] args) {

        String name = "level";
        char[] chars = name.toCharArray();
        boolean isPalindrome = isPalindrome(chars);

        System.out.println(isPalindrome);

    }

    private static boolean isPalindrome(char[] name) {

        if (name.length <= 1) {
            return true;
        }

        if (name[0] == name[name.length-1]) {
            return isPalindrome(Arrays.copyOfRange(name, 1, name.length-1));
        } else {
            return false;
        }
    }
}
