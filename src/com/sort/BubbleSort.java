package com.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 5, 7, 9, 14};
        boolean swap;
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            swap = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                count++;
                int tmp = arr[j];

                if (tmp > arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swap = true;
                }
            }

//            if (swap == false) break;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("count = " + count);
    }
}
