package com.DSASearching.BinarySearch.Assignments;

//problem: Kth Missing Positive Number
//Link: https://leetcode.com/problems/kth-missing-positive-number/
public class KthMissingPositiveInteger
{
    public static void main(String[] args)
    {
        int[] arr = {1};
        int indexMissing = 2;
        System.out.println(kthPositiveInt(arr,indexMissing));
    }
    public static int kthPositiveInt(int[] arr, int target)
    {
        int counter = 0;
        int iterator = 1;
        for(int i =0;i<arr.length;i=i)
        {
            if(arr[i]==iterator)
            {
                iterator++;
                if(i<arr.length-1)
                {i++;}
            }
            else
            {
                counter++;
                iterator++;
            }
            if(counter==target)
                return iterator-1;

        }
        return 0;
    }
}
