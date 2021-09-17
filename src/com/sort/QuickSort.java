package com.sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = new Random().ints(10, 0, 100).toArray();;

        leftPivotSort(arr, 0, arr.length - 1);

    }

    private static void leftPivotSort(int[] arr, int lowerIdx, int higherIdx) {

        // 왼쪽 인덱스가 오른쪽 인덱스보다 큰 경우 정렬 종료
        if (lowerIdx >= higherIdx) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        // 파티션 나누기 (왼쪽과 오른쪽)
        int pivotIdx = partition(arr, lowerIdx, higherIdx);
        leftPivotSort(arr, lowerIdx, pivotIdx - 1);
        leftPivotSort(arr, pivotIdx + 1, higherIdx);

    }

    private static int partition(int[] arr, int leftIdx, int rightIdx) {

        int lowerIdx = leftIdx;
        int higherIdx = rightIdx;

        // 피벗의 값은 가장 왼쪽
        int pivotValue = arr[leftIdx];

        // 왼쪽의 인덱스가 더 작을 때 반복한다
        while (lowerIdx < higherIdx) {

            while (arr[higherIdx] > pivotValue && lowerIdx < higherIdx) {
                higherIdx--;
            }

            while (arr[lowerIdx] <= pivotValue && lowerIdx < higherIdx) {
                lowerIdx++;
            }

            // swap
            int temp = arr[lowerIdx];
            arr[lowerIdx] = arr[higherIdx];
            arr[higherIdx] = temp;
        }

        // swap
        int temp = arr[leftIdx];
        arr[leftIdx] = arr[lowerIdx];
        arr[lowerIdx] = temp;

        return lowerIdx;
    }
}
