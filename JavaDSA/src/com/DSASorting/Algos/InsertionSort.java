package com.DSASorting.Algos;

import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void insertSort(int[] arr)
    {
        for(int i = 0; i< arr.length-1;i++)
        {
            for(int j = i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    SelectionSort.swapelements(arr,j,j-1);
                }
            }
        }
    }
}
