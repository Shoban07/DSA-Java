package com.DSAarrays;

import java.util.Arrays;

public class MaximumValueOfArray
{
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {100, 5938, 12378,2343,0};
        int maxSoFar = arr[0];
        for (int i = 1; i < arr.length-1; i++)
        {
            if (arr[i]>maxSoFar)
            {
                maxSoFar = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("Maximum Element in the array: "+maxSoFar);
    }
}
