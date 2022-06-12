package com.DSASearching.BinarySearch.Assignments;

//Problem: Find in Mountain Array
//Link: https://leetcode.com/problems/find-in-mountain-array/

public class MountainArray
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,2,4,5,3,1}; // o/p: 5th index
        int target = 3;
        int peakElementIndex = peakElementInArray(arr);

        int firstIndex = orderAgnosticBinarySearch(arr,target,0,peakElementIndex);
        if(firstIndex!=-1)
        {
            System.out.println(firstIndex);
        }
        else{
            System.out.println(orderAgnosticBinarySearch(arr,target,peakElementIndex+1,arr.length-1));
        }
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end)
    {
        boolean isAscending = arr[start]<arr[end];
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAscending)
            {
                if(target<arr[mid])
                {
                    end = mid -1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            else
            {
                if(target<arr[mid])
                {
                    start = mid +1;
                }
                else
                {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int peakElementInArray(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = start+(end- start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end = mid;
            }
            else
            {
                start = mid + 1;
            }
        }
        return end;
    }
}
/*Leetcode solution
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

//class Solution {
//    public int findInMountainArray(int target, MountainArray mountainArr)
//    {
//        int peakElementIndex = peakElementIndexFinder(mountainArr);
//        int firstIndex = orderAgnosticArray(mountainArr,target,0,peakElementIndex);
//        if(firstIndex!=-1)
//        {
//            return firstIndex;
//        }
//        else
//        {
//            return orderAgnosticArray(mountainArr,target,peakElementIndex+1,mountainArr.length()-1);
//        }
//    }
//    public int orderAgnosticArray(MountainArray arr, int target, int start, int end)
//    {
//        boolean isAscending = arr.get(start)<arr.get(end);
//        while(start<=end)
//        {
//            int mid = start + (end-start)/2;
//            if(arr.get(mid)==target)
//            {
//                return mid;
//            }
//            if(isAscending)
//            {
//                if(target>arr.get(mid))
//                {
//                    start = mid +1;
//                }
//                else{
//                    end = mid -1;
//                }
//            }
//            else{
//                if(target<arr.get(mid))
//                {
//                    start = mid+1;
//                }
//                else{
//                    end = mid - 1;
//                }
//            }
//        }
//        return -1;
//    }
//    public int peakElementIndexFinder(MountainArray arr)
//    {
//        int start = 0;
//        int end = arr.length()-1;
//        while(start<end)
//        {
//            int mid = start + (end-start)/2;
//            if(arr.get(mid)>arr.get(mid+1))
//            {
//                end = mid;
//            }
//            else
//            {
//                start = mid+1;
//            }
//        }
//        return start;
//    }
//}
