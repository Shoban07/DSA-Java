package com.DSASearching.BinarySearch.Assignments;

import java.util.Arrays;

//Problem: Two Sum II - Input Array Is Sorted
//Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSumArray_II
{
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSumNegativeArray(arr,9)));
    }
    public static int[] twoSumNonNegativeArray(int[] numbers, int target)
    {
        int start = 0;
        int end = numbers.length-1;
        if(numbers.length==1)
            return  new int[]{-1,-1};
        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(numbers[mid]>target)
            {
                end = mid -1;
            }
            else
            {
                int ans = numbers[start]+numbers[end];
                if(ans>target) end = end -1;
                else if(ans<target) start = start +1;
                else return new int[]{start,end};
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] twoSumNegativeArray(int[] numbers, int target)
    {
        int start = 0;
        int end = numbers.length-1;
        if(numbers.length==1)
            return  new int[]{-1,-1};
        while(start<=end)
        {
                int ans = numbers[start]+numbers[end];
                if(ans>target) end = end -1;
                else if(ans<target) start = start +1;
                else return new int[]{start,end};

        }
        return new int[]{-1,-1};
    }
}