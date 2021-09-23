package com.sequentialsearch;

import java.util.Arrays;
import java.util.Random;

public class SequentialSearch {

    public static void main(String[] args) {

        int[] arr = new Random().ints(10, 0, 30).toArray();;

        int index = sequential(arr, 10);

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("index = " + index);
    }

    private static int sequential(int[] arr, int searchValue) {

        for (int index = 0; index < arr.length; index++) {

            if (arr[index] == searchValue) return index;
        }

        return -1;

    }
}
