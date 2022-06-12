package com.DSASearching.BinarySearch.Assignments;

//Problem: Find the Rotation Count in Rotated Sorted array
//Link: https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotatedCount
{
    public static void main(String[] args)
    {
        int[] arr = {0,1,2,3};
        System.out.println(countRotationUniqueArray(arr,0,arr.length-1)+1);
        System.out.println(countRotationUniqueArrayLinear(arr));
    }
    //time complexity: O(n) and space complexity: O(1)
    static int countRotationUniqueArrayLinear(int[] arr)
    {
        int maxSoFar = arr[0];
        int rotation = 0;
        for(int i =0;i<arr.length-1;i++)
        {
            if(maxSoFar>arr[i])
            {
                maxSoFar = arr[i];
                rotation = i;
            }
        }
        return rotation;
    }

    //using Binary Search
    //time complexity: O(log n) and Auxiliary Space: O(1)
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
