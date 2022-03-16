package com.DSASorting.Assignment;

import com.DSASorting.Algos.InsertionSort;

/**
 * Problem: Third Maximum Number
 * Link: https://leetcode.com/problems/third-maximum-number/
 */


public class ThirdMaximumNumber
{
    public static void main(String[] args)
    {
        int[] arr = {0,5,2,4,6,3,1};
        System.out.println(thirdMaxAlt(arr));
    }
    public static int thirdMax(int[] nums)
    {
        int minimumSoFar = nums[0];
        int count = 1;
        int maxSoFar = 0;
        if(nums.length==2)
        {
            return nums[0]>nums[1]?nums[0]:nums[1];
        }
            for(int i = 1;i<nums.length;i++)
            {
                if(nums[i]<minimumSoFar)
                {
                    count++;
                    minimumSoFar = nums[i];
                }
                else if(nums[i]>minimumSoFar)
                {
                    maxSoFar = nums[i];
                    count++;
                }
                if(count==3)
                {
                    return minimumSoFar;
                }
//                else if(count<3)
//                {
//                    return maxSoFar;
//                }
            }
        return maxSoFar;
    }

    public static void cyclicSort(int[] arr)
    {
        int i = 0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
    }
    public static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    //region O(n square) approach
    public static void InsertionSort(int[] nums)
    {
        for(int i = 0;i<nums.length-1;i++)
        {
            for(int j = i+1;j>0;j--)
            {
                if(nums[j]<nums[j-1])
                {
                    swap(nums,j,j-1);
                }
            }
        }
    }
    public static int thirdMaxAlt(int[] nums)
    {
        int firstMax = nums[0];
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            } else if (firstMax > nums[i] && secondMax != nums[i]) {
                if (nums[i] > secondMax) {
                    thirdMax = secondMax;
                    secondMax = nums[i];
                } else if (nums[i] > thirdMax && secondMax != nums[i]) {
                    thirdMax = nums[i];
                }
            }
        }
        return thirdMax > Long.MIN_VALUE ? Math.toIntExact(thirdMax) : firstMax;
    }
    //endregion
}
