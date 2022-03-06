package com.DSASorting.Algos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args)
    {
        int[] arr = {0, 78, 90,32, 98, -100};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectSort(int[] arr)
    {
        if(arr.length>1)
        {
            //to find the maximum element and maximum end point in an array
            for(int i =0;i<arr.length;i++)
            {
                //fetches last index in an array
                int lastIndex = arr.length-i-1; // 'i' defines the current position of index in array. It reduces previously sorted element comparison

                // fetches the maximum element's index in given array
                int maxIndex = getMaxIndex(arr, 0, lastIndex);

                swapelements(arr,maxIndex,lastIndex);
            }
        }

    }

    public static int getMaxIndex(int[] arr, int start, int end)
    {
        int maxIndex = start;
        for(int i = start;i<=end;i++)
        {
            if(arr[maxIndex]<arr[i])
                maxIndex = i;
        }
        return maxIndex;
    }

    public static void swapelements(int[] arr,int maxElementIndex, int lastIndex)
    {
        int temp = arr[maxElementIndex];
        arr[maxElementIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }
}
