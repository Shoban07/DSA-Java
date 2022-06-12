package com.DSASearching.BinarySearch.Assignments;

//Problem: Search in Rotated Sorted Array with duplicates
//Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class RotatedSortedDuplicateArray
{
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        boolean isPresent = search(arr,3);
        System.out.println(search(arr,3)+" "+isPresent);

    }
    /*
    public static boolean search2(int[] nums, int target)
    {
        int n= nums.length;
        if(n ==0)
        {
            return false;
        }

        if(n==1)
        {
            if(nums[0]==target)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        int start=0;
        int end=n-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(nums[mid]==target)
            {
                return true;
            }

            if(nums[mid] == nums[start])//logic for avoiding duplicates
            {
                start++;
            }
            else if(nums[start] <= nums[mid])//left half is sorted
            {
                // the target element is in between the range of start and mid
                // so, the target is definately in the left half
                if(nums[mid] > target && nums[start] <= target)
                {
                    end=mid-1;
                }
                else//otherwise, it's in the right half
                {
                    start=mid+1;
                }
            }
            else if(nums[mid] <= nums[end])//right half is sorted
            {
                //the target element is in between the range of mid and end
                // so, the target is definately in the right half
                if(nums[mid] < target && nums[end] >= target)
                {
                    start=mid+1;
                }
                else//otherwise,it's in the left half
                {
                    end = mid-1;
                }
            }
        }
        return false;
    }
    */
    //efficient most
    public static boolean search(int[] nums, int target)
    {
        if(nums.length==0) return false;
        if(nums.length==1)
        {
            return nums[0]==target;
        }
        int start = 0,end = nums.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(nums[mid]==target) return true;

            //logic for avoiding duplicates
            if(nums[start]==nums[mid]) start++;

            else if(nums[start] <= nums[mid]) //answer lies some where between start and current middle
            {
                if(nums[mid]>target&&nums[start]<=target) end = mid -1;
                else start = mid+1;
            }
            else if(nums[mid]<=nums[end])
            {
                if(nums[mid]<target&&nums[end]>=target) start = mid+1;
                else end = mid -1;
            }
        }
        return false;
    }
}
