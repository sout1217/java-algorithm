package com.sort;

import java.util.Arrays;

 public class InsertionSort2 {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 7, 14, 3, 1};
        int count = 0;


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                count++;
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                } else {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("count = " + count);
    }
}
