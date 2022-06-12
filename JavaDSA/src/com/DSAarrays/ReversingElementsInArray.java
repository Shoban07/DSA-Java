package com.DSAarrays;

import java.util.Arrays;

public class ReversingElementsInArray
{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Reversing the Given Array");
        int[] arr = {2,1,7,4,9};
        int start = 0;
        int end = arr.length-1;
        while (start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
