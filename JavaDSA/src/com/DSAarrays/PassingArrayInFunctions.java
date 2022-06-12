package com.DSAarrays;

import java.util.Arrays;
import java.util.Scanner;

public class PassingArrayInFunctions
{
    public static int[] ReturnArray(int[] arr)
    {
        return arr;
    }
    public static void main(String[] args) {
        int[] arr; //declaration of the array
        int ArraySize; //declaration of the default value for array size
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Passing the array in a function");
        System.out.print("Enter the size fo the array :");
        ArraySize = in.nextInt(); //getting the user desired array size
        arr = new int[ArraySize]; // initialization of the array
        Scanner getelements = new Scanner(System.in);
        //iterating through the index
        //entering the values into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getelements.nextInt();
        }
        System.out.println();
        //as practicing passing an array into a function which returns an array
        System.out.println(Arrays.toString(ReturnArray(arr)));
    }
}
