package com.DSASorting.Assignment;

/*
* **** Amazon Hard Problem *******
* Problem: First Missing Positive
* Link: https://leetcode.com/problems/first-missing-positive/*/

public class FindMissingPostives_Hard
{
    public static void main(String[] args) {
        int[] arr = {0,5};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums)
    {
        cyclicSort(nums);
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                return i+1;
            }
        }

        return nums.length+1;
    }
    public static void cyclicSort(int[] arr)
    {
        int i = 0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]<=arr.length && arr[i]>0 && arr[i]!=arr[correct])
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
}
