package com.DSASearching.BinarySearch.Assignments;

//Problem: Find Minimum in Rotated Sorted Array
//Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class MinElementInRotatedArray
{
    public static void main(String[] args)
    {
        int[] arr = {4,5,6,7,1,2,3};
        System.out.println(arr[(countRotationUniqueArray(arr,0,arr.length-1)+1)]);
    }
    static int countRotationUniqueArray(int[] arr, int start, int end)
    {
//        int start = 0;
//        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            else if(arr[start]>=arr[mid])
            {
                end = mid -1;
                return countRotationUniqueArray(arr,start,end);
            }
            else if(arr[start]<=arr[mid])
            {
                start = mid+1;
                return countRotationUniqueArray(arr,start,end);
            }
        }
        return -1;
    }
}
