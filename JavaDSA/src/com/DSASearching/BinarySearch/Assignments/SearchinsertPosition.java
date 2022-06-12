package com.DSASearching.BinarySearch.Assignments;

//problem: Search Insert Position
//Link: https://leetcode.com/problems/search-insert-position/
public class SearchinsertPosition
{
    public static void main(String[] args) {
        int[] arr = {-1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(arr,target));
    }
    public static int searchInsert(int[] arr, int target)
    {
        if(target==0&&arr.length==1) return 0;

        if(arr.length==1) return arr[0]==target?0:1;

        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = start+(end-start)/2;

            if(arr[mid]<target)
                start=mid+1;

            else if(arr[mid]>target)
                end = mid-1;

            else if(target==arr[mid])
                return mid;

            //else if(start==end) return start+1;
        }
        if(arr[start]>=target) return start;
        //else if(arr[start]==target) return start;
        else return start+1;
    }
}
