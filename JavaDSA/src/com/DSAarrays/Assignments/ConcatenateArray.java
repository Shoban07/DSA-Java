package com.DSAarrays.Assignments;

//Difficulty : Easy 2. Concatenation of Array
//reference link : https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;

/*
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.
* */
public class ConcatenateArray
{
    public static int[] getConcatenation(int[] nums)
    {
        int[] result = new int[2*(nums.length)];
        for(int i = 0; i<nums.length;i++)
        {
            result[i] = nums[i];
            result[i+nums.length] = nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println();
        int[] arr= {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
}
