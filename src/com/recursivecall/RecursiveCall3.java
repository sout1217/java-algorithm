package com.recursivecall;

import java.util.Arrays;

public class RecursiveCall3 {

    public static void main(String[] args) {

        int[] arr = {17, 16, 65, 49, 88, 15, 99, 45, 77, 87};

        int result = sum(arr);

        System.out.println(result);

    }

    private static int sum(int[] nums) {
        if (nums.length > 1) {
            return nums[0] + sum(Arrays.copyOfRange(nums, 1 , nums.length));
        } else {
            return nums[0];
        }
    }
}
