package com.DSASearching.BinarySearch.Assignments;

public class SmallestLetter
{
    public static void main(String[] args)
    {

    }
    static char NearestSmallestLetter(char[] arr, char target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(target < arr[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return arr[start%arr.length]; // if the search goes out of array return the first element
    }
}
