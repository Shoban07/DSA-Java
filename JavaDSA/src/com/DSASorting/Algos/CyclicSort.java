package com.DSASorting.Algos;

import java.util.Arrays;

public class CyclicSort
{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicSort(int[] arr)
    {
        int i = 0;
        while(i<arr.length)
        {
            int correct = arr[i]-1; //fetches the element's correct index
            if(arr[correct]!=arr[i]) // if the element is not at the right index then swap [check = element -1]
            {
                SortingAlgorithms.swap(arr,i,correct);
            }
            else
            {
                i++; // if element was at the right index then move the pointer
            }
        }
    }
}
