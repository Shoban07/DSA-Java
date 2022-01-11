package com.DSASearching.BinarySearch;

public class OrderAgnosticBinarySearch
{
    public static void main(String[] args)
    {
        int[] arr = {89, 57, 23, 18, 17, 15, 4,3,2,0,-4,-12,-18};//-18, -12, -4, 0, 2, 3, 4, 15, 17, 18, 23, 57,
        int target = 23;
        boolean isAscending = arr[0] < arr[arr.length-1];
        System.out.println(orderAgnosticBs(arr,target,isAscending)+ " is the element index for descending array");

        //ascending array
        int[] arr2 = {-18, -12, -4, 0, 2, 3, 4, 15, 17, 18, 23, 57,89};//
        int target2 = 23;
        boolean isAscending2 = arr2[0] < arr2[arr2.length-1];
        System.out.println(orderAgnosticBs(arr2,target2,isAscending2)+ " is the element index for ascending array");
    }
    static int orderAgnosticBs(int[] arr, int target, boolean isAscending)
    {
        int start = 0;
        int end = arr.length-1;

        while(start <=end)
        {
            int mid = start + (end- start)/2; // finds the middle element

            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAscending)
            {
                if(target>arr[mid])
                {
                    start = mid+1;
                }
                else{
                    end = mid -1;
                }
            }
            else
            {
                if(target>arr[mid])
                {
                    end = mid -1;
                }
                else
                {
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
