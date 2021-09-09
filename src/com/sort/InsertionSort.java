package com.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 7, 14, 3, 1};
        int count = 0;
        System.out.println(arr.length);

        for (int i = 1; i < arr.length; i++) {
            int maxIdx = i;

            for (int j = i - 1; j >= 0; j--) {
                count++;

                if (arr[maxIdx] < arr[j]) {
                    int tmp = arr[maxIdx];
                    arr[maxIdx] = arr[j];
                    arr[j] = tmp;
                    maxIdx = j;
                } else {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("count = " + count);
    }
}
