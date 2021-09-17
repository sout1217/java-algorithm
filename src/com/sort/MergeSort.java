package com.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] numArr = {4, 1, 7, 3, 2, 8, 6};

        int[] results = mergeSplit(numArr);

        System.out.println(Arrays.toString(results));
    }

    private static int[] mergeSplit(int[] arr) {

        // 길이가 1개 이하 인 경우 return arr
        if (arr.length <= 1) return arr;

        // 중간 위치 값
        int medium = arr.length / 2;

        int[] left = mergeSplit(Arrays.copyOfRange(arr, 0, medium));
        int[] right = mergeSplit(Arrays.copyOfRange(arr, medium, arr.length));

        return merged(left, right); // [4][1] merge [7][3] merge
    }

    private static int[] merged(int[] left, int[] right) {
        int lp = 0, rp = 0, mergeIdx = 0; // 투 포인터

        int[] merged = new int[left.length + right.length]; // left 와 right 사이즈만큼의 배열 생성

        while (left.length > lp && right.length > rp) { // 왼쪽 배열의 크기 보다 lp 가 작은 경우 and 오른쪽 배열 크기 보다 rp 가 작은 경우
            if (left[lp] > right[rp]) { // 왼쪽 값이 오른쪽 값보다 큰 경우
                merged[mergeIdx++] = right[rp++]; // merge 배열과 right 배열 의 index 증가
            } else {
                merged[mergeIdx++] = left[lp++]; // merge 배열과 left 배열 의 index 증가
            }
        }

        // 왼쪽 크기보다 lp 가 작은 경우 나머지 왼쪽에 있는 걸 리스트에 넣는다
        while (left.length > lp) {
            merged[mergeIdx++] = left[lp++];
        }
        // 오른쪽 크기보다 rp 가 작은 경우 나머지 왼쪽에 있는 걸 리스트에 넣는다
        while (right.length > rp) {
            merged[mergeIdx++] = right[rp++];
        }

        return merged;
    }
}
