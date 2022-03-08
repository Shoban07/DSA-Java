package com.DSASorting.Assignment;
/*
* ******* Amazon Medium Question *******
* Problem:  Find the Duplicate Number
* Link: https://leetcode.com/problems/find-the-duplicate-number/submissions/
*/
public class FindTheDuplicate_Medium
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums)
    {
        int res = 0;
        cyclicSort(nums);

        for(int i = 0; i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                res = nums[i];
            }
        }
        return res;
    }
    public static void cyclicSort(int[] arr)
    {
        int i = 0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]<arr.length&&arr[i]!=arr[correct])
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
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
