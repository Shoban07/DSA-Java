package com.DSAarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Doubts
{
    public static void main(String[] args) {
        //printing default values of 1d array
        int[] arr1 = new int[5];
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = new String[4];
        System.out.println(Arrays.toString(arr2));

        int[][] arr3 = new int[2][2];
        for(int[] ar:arr3)
        {
            System.out.println(Arrays.toString(ar));
        }

        String[][] arr4 = new String[2][2];
        for(String[] ar:arr4)
        {
            System.out.println(Arrays.toString(ar));
        }

        ArrayList<String> arr5 = new ArrayList<>(3);
        arr5.add("Sample");
        arr5.add("Sample 2");
        arr5.add("Sample 2");
        arr5.add("Sample 2");
        System.out.println(arr5.toString());
        System.out.println(arr5.size());
    }
}
