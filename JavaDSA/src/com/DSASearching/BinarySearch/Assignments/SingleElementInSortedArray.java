package com.DSASearching.BinarySearch.Assignments;

//problem: Single Element in a Sorted Array
//link: https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElementInSortedArray
{
    public static void main(String[] args)
    {
        int[] arr = {1,2};
        System.out.println(FindSingleElementInSortedArray3(arr));
    }
    public static int FindSingleElementInSortedArray(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        while(start<end)
        {
            int mid = start + (end-start)/2;
            if(mid%2==0&&nums[mid]==nums[mid+1])
            {
                start = mid +1 ;
            }
            else if(mid%2==1&&nums[mid]==nums[mid-1])
            {
                start = mid +1;
            }
            else{
                end = mid;
            }
        }
        return nums[start];
    }

    /*Method two
    * 1. Do boundary checks for unique elements
    * 2. if not do binary search*/
    public static int FindSingleElementInSortedArray2(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        int mid;
        
        //boundary cases
        if(end == 0)
            return nums[end];
        else if(nums[0] != nums[1])
            return nums[0];
        else if (nums[end] != nums[end-1])
            return nums[end];

        //if not satisfied with above cases then do binary search
        while(start<=end)
        {
            mid = start + (end-start)/2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])
                return nums[mid];

            if((mid % 2==0 && nums[mid] == nums[mid+1]) ||(mid % 2==1 && nums[mid] == nums[mid-1]))
                start = mid + 1;

            else
                end = mid -1;
        }

        return -1;
    }

    /*Most time and space efficient*/
    public static int FindSingleElementInSortedArray3(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;

        //Covering the border cases
        if(end == 0)
            return nums[end];
        else if(nums[0] != nums[1])
            return nums[0];
        else if(nums[end] != nums[end-1])
            return nums[end];

        //if not found in borders, then search in middle using binary search
        while(start<end)
        {
            mid = start + (end-start)/2;

            if(mid%2==1)
                mid--;

            if(nums[mid] == nums[mid+1])
                start = mid+2;
            else
                end = mid;
        }
        return nums[end];
    }
}
