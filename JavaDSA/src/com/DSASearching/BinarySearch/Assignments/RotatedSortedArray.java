package com.DSASearching.BinarySearch.Assignments;

//Problem: Search in Rotated Sorted Array
//Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

public class RotatedSortedArray
{
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        boolean isPresent = search(arr,2)!=-1;
        System.out.println(search(arr,2)+" "+isPresent);

    }
    public static int search(int[] arr, int target)
    {
        int pivot = findPivot(arr); //finds the pivot

        if(arr[pivot]==target) //if pivot is position holds the target then return the pivot position
            return pivot;

        if(pivot == -1) // if pivot is -1, the do normal binary search to find the element
        {
            return SearchBinary(arr,target,0,arr.length-1);
        }
        if(target>=arr[0]) // if my target was greater than the first element, it means the target is going to lie somewhere between the first index and before pivot. Hence passing the start index as 0 and end index as pivot -1
        {
            return SearchBinary(arr, target, 0, pivot - 1);
        }
        /*
        * If not satisfied with above condition then the target lies after the pivot hence passing start = pivot + 1 and end = array length -1*/
        return SearchBinary(arr, target,pivot + 1,arr.length-1);
    }

    //Normal Binary Search
    static int SearchBinary(int[] arr, int target,int start, int end)
    {
        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(target > arr[mid]) // if middle element was > target then increase the starting index to middle + 1
            {
                start = mid +1;
            }
            else if(target < arr[mid]) // if middle element was < target then decrease the end index to middle -1 ;
            {
                end = mid -1;
            }
            else{ // when target and middle element becomes same, then return the index number.
                return mid;
            }
        }
        //if no such element exists return index as -1
        return -1;
    }

    //Pivot element finder in an array
    static int findPivot(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            /*
             * Cases to Find the pivot element in rotated array
             * 1. if middle element < end && element at middle > element at middle + 1 : mid < end because if the mid-element was at the last index in array, and we try to compare the next element then it will result in index out of bound error
             * 2. if middle element > start && element at middle > element at middle -1 : mid > start because if the mid-element was at the first index in array, and we try to compare the previous element then it will result in index out of bound error */
            if(mid<end && nums[mid]>nums[mid+1] &&  mid>start && nums[mid]>nums[mid-1])
            {
                return mid;
            }
            /*
            * 2. Case element at mid if >= element at start: Which means we don't have to search in elements after the mid-element, Because we know pivot element is the greatest of all, and it will not lie on the right side of the current mid*/
            else if(mid>start && nums[start]>=nums[mid])
            {
                end = mid-1;
            }
            /*
            * 3. Case: Element at mid if <= start, Then the pivot will lie on the right side part after the current mid-element*/
            else if(mid<end && nums[start]<=nums[mid])
            {
                start = mid +1;
            }
            /*
            * Case 4: If both the index lie on same element, then that is the pivot*/
            else if(start==end)
            {
                return  start;
            }

        }
        /*
        If no element matches pivot conditions, This situation never happens. But for exception handling purpose we are returning -1
        * pivot not found*/
        return -1;
    }
}
