package com.DSAarrays;

import java.util.Arrays;
import java.util.Scanner;

public class TakeInputForArray
{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Create Integer Array and print it");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int arraySize = scn.nextInt();
        scn = new Scanner(System.in);
        int[] arr = new int[arraySize];
        System.out.printf("Entered size of the array: "+arraySize);
        //take input for size of the array
        for (int i = 0; i < arraySize; i++)
        {
                arr[i] = scn.nextInt();
        }
        //print the input
        for(int num : arr)
        {
            System.out.printf(num+", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
