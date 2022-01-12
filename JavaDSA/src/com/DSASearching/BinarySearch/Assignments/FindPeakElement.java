package com.DSASearching.BinarySearch.Assignments;

//Problem: Peak Index in a Mountain Array
//Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class FindPeakElement
{
    public static void main(String[] args)
    {
        int[] arr = {0,1,2,3,1,0};
        System.out.println(arr[peakIndexInMountainArray(arr)]);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = start + (end -  start)/2;
            if(arr[mid]> arr[mid+1])// if yes, mid pointer is in decreasing order
            {
                end = mid;
            }
            else // if not then our mid pointer situated in increasing order, which means either this may be the element at peak or elements at left
            {
              start = mid + 1;
            }
        }
        return start;
    }
}
