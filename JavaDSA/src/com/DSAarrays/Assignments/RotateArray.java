package com.DSAarrays.Assignments;

//Description : Rotate Array
//Link: https://leetcode.com/problems/rotate-array/

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void RotateArray(int[] nums, int k) {
        if (nums.length > 1 && nums.length > k) {
            int[] result = new int[nums.length];

            int j = nums.length - k;
            for (int i = 0; j < nums.length; i++) {
                result[i] = nums[j];
                j++;
            }

            j = 0;
            for (int i = k; i < nums.length; i++) {
                result[i] = nums[j];
                j++;
            }

            //copy elements to array nums
            for (int i = 0; i < result.length; i++) {
                nums[i] = result[i];
            }
        } else if (nums.length < k) {
            for (int i = 1; i <= k; i++) {

            }
        }
    }

    public static void RotateArrayEffective(int[] nums, int k) {
        int arr[] = new int[nums.length];
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            arr[(i + k) % length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
    }

    /*Time ans Space Complexity
    * Time: O(n) as we travel all around the array
    * Space: O(1)*/
    //LeetCode efficient
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;

        //swapping last three numbers into first three positions
        //{1,2,3,4,5,6,7} => {7,6,5,4,3,2,1}
        reverse(0, nums.length - 1, nums);

        //swapping first 3 numbers in correct order
        //{7,6,5,4,3,2,1} => {5,6,7,4,3,2,1}
        reverse(0, k - 1, nums);

        //swapping the balance set of numbers in correct order
        //{5,6,7,4,3,2,1} => {5,6,7,1,2,3,4}
        reverse(k, nums.length - 1, nums);
    }

    public static void reverse(int start, int end, int[] nums) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
