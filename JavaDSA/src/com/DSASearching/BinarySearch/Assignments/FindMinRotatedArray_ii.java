package com.DSASearching.BinarySearch.Assignments;

//Description : Find Minimum in Rotated Sorted Array II
//Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
//Follow up: This problem is similar to Find Minimum in Rotated Sorted Array, but nums may contain duplicates. Would this affect the runtime complexity? How and why?

public class FindMinRotatedArray_ii
{
    public static void main(String[] args) {
        int[] arr = {3,3,1,3};
        int index = findPeakElementWithDuplicates(arr);
        System.out.println(arr[index] + " is the minimumNumber");
    }
    public static int findPeakElementWithDuplicates(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;

        if(nums.length==2)
        {
            return nums[start]<nums[end]?start:end;
        }

        while(start<end)
        {
            int mid = start + (end -  start)/2;
           if(nums[mid] < nums[end])
           {
               end = mid;
           }
           else if (nums[mid] > nums[end])
           {
               start = mid + 1;
           }
           else
           {
               end--;
           }
        }
        return start;
    }
}
