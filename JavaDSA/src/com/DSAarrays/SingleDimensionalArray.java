package com.DSAarrays;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimensionalArray
{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Create Integer Array and print it");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int arraySize = scn.nextInt();
        scn = new Scanner(System.in);
        int[] arr = new int[arraySize];
        System.out.print("Entered size of the array: "+arraySize);

        //take input for size of the array
        for (int i = 0; i < arraySize; i++)
        {
                arr[i] = scn.nextInt();
        }
        //print the input
        /*
        * Way 1:  using for loop*/
        System.out.println("using for loop");
        for(int i = 0; i<arraySize;i++)
        {
            System.out.println(arr[i]+", ");
        }
        System.out.println();
        System.out.println("using for each loop");
        /*
        * Way 2: Using Enhanced for loop, that is the 'For Each loop'*/
        for(int num : arr)
        {
            System.out.print(num+", ");
        }
        System.out.println();

        /*
        * using to string method
        * */
        System.out.println("using Arrays.toString method");
        System.out.println(Arrays.toString(arr));
    }
}
