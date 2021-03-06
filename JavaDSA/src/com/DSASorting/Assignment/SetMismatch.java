package com.DSASorting.Assignment;

import java.util.Arrays;

/*
* FAANGM Easy Problem
* Problem: Set Mismatch
* Link: https://leetcode.com/problems/set-mismatch/*/

public class SetMismatch
{
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] nums)
    {
        cyclicSort(nums);
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{};
    }
    public static void cyclicSort(int[] arr)
    {
        int i = 0;
        while(i<arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else
                i++;
        }
    }
    public static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
