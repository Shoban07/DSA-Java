package com.DSAarrays.Assignments;

//Difficulty : Easy 1. Build Array from Permutation
//reference link : https://leetcode.com/problems/build-array-from-permutation/

/*
1. Given a zero-based permutation nums (0-indexed), build an array answer of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
2. A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

* */

import java.util.Arrays;

public class BuildArrayPermutation
{
    public static int[] buildArray(int[] nums)
    {
        int[] resultArray = new int[nums.length];
        for(int num : nums)
        {
            resultArray[num] = nums[nums[num]];
        }
        return resultArray;
    }

    public static int[] recursiveWay(int[] nums)
    {
        int[] resArray = new int[nums.length];
        int index = 0;
        if(index<nums.length)
        {
            resArray[index] = nums[nums[index]];
            index++;
        }
        return  resArray;
    }
    public static void main(String[] args)
    {
        int[] arr = {4,5,0,1,2,3};
        //buildArray(arr);
        System.out.println(Arrays.toString(buildArray(arr)));
    }
}
