package com.DSASearching.BinarySearch.Assignments;

public class FlooringOfNumber
{
    public static void main(String[] args)
    {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 17, 18, 23, 57, 89};
        int target = 16;
        System.out.println(NumberFlooring(arr,target)+" is the greatest number smaller than or equal to target :"+target);
        System.out.println(5%4);
    }
    static int NumberFlooring(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(target>arr[mid])
            {
                start = mid+1;
            }
            else if(target<arr[mid])
            {
                end = mid -1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}
