package com.DSAarrays.Assignments;

import java.util.Arrays;
//Difficulty : Easy 5. Shuffle the Array
//reference link : https://leetcode.com/problems/shuffle-the-array/

/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].



Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
* */
public class ShuffleArray
{
    public int[] shuffle(int[] nums, int n)
    {
        int[] arr = new int[nums.length];
        int start = 0;
        int midpoint = nums.length/2;
        for(int i =0;i<nums.length;i=i+2)
        {
            arr[i] = nums[start];
            start++;
            arr[i+1] = nums[midpoint];
            midpoint++;
        }
        return arr;
    }

    public static void main(String[] args) {
        ShuffleArray arr = new ShuffleArray();
        int[] array = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(arr.shuffle(array,array.length/2)));

    }
}
