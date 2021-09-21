package com.binarysearch;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 5, 7, 9, 14};

        // 이진탐색은 정렬되있는 경우에만 가능하기 때문에 정렬 해준다
        Arrays.sort(arr);

        boolean result = bs(arr, 7);

        System.out.println("result = " + result);

    }

    private static boolean bs(int[] arr, int searchValue) {

        // 배열이 1개 이고, 배열의 첫번째가 찾는 값과 같은 경우 True(탐색됨)
        if (arr.length == 1 && arr[0] == searchValue) return true;
        // 배열이 1개 이고, 배열의 첫번째가 찾는 값과 다른 경우 False(탐색되지 않음)
        else if(arr.length == 1 && arr[0] != searchValue) return false;

        int mid = arr.length / 2;

        // 가운데 값이 같은 경우
        if (arr[mid] == searchValue) return true;
        else {
            // 작은 경우
            if (searchValue < arr[mid]) return bs(Arrays.copyOfRange(arr, 0, mid), searchValue);
            // 큰 경우
            else return bs(Arrays.copyOfRange(arr, mid + 1, arr.length), searchValue);
        }
    }
}
