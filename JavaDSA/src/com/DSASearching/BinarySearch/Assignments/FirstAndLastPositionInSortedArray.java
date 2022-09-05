package com.DSASearching.BinarySearch.Assignments;

import java.util.Arrays;
//Problem: Facebook Q
//Find First and Last Position of Element in Sorted Array
//Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastPositionInSortedArray
{
    public static void main(String[] args)
    {
        int[] arr = {5,6,7,6,6,8,9};
        int target = 6;
        System.out.println(Arrays.toString(searchInRange(arr,target)));
    }
    public static int[] searchInRange(int[] nums, int target)
    {
        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true); // log N - Time Complexity
        if(ans[0]!=-1){
        ans[1] = search(nums,target,false);} // log N - Time Complexity, so totally 2 log N -> log N (Constant was not considered)

        return ans;
    }
    public static int search(int[] nums, int target, boolean searchFirstHalf)
    {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(target>nums[mid])
            {
                start = mid +1;
            }
            else if(target<nums[mid]){
                end = mid -1;
            }
            else
            {
                ans = mid;
                if(searchFirstHalf)
                {
                    end = mid -1;
                }
                else
                {
                    start = mid+1;
                }
            }
        }

        return ans;
    }
}
