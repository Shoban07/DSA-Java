package com.DSASorting.Assignment;

import com.DSASorting.Algos.SelectionSort;

import java.util.Arrays;

public class MergeSortedArray
{
    public static void main(String[] args) {
        int[] arr1 = {0,0,0,0,0};
        int[] arr2 = {1,2,3,4,5};
        int m = 0;
        int n = 5;
        merge(arr1,m,arr2,n);
        System.out.println(Arrays.toString(arr1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n)
    {
        if(m==0)
        {
            for(int i = 0;i<n;i++)
            {
                nums1[i] = nums2[i];
            }
        }
        else if(n==0)
        {
        }
        else{
            for(int i = 0; i<nums2.length;i++)
            {
                nums1[nums1.length- nums2.length+i] = nums2[i];
            }
            insertSort(nums1);
        }
    }
    public static void insertSort(int[] arr)
    {
        for(int i = 0; i< arr.length-1;i++)
        {
            for(int j = i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swapelements(arr,j,j-1);
                }
            }
        }
    }

    private static void swapelements(int[] arr, int j, int i)
    {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
