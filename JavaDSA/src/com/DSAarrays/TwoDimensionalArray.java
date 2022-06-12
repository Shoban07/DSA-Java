package com.DSAarrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
      //declaration
       // syntax: primitive type[row][column] = new primitive type[row][column]
        /*
        *example:
        * int[][] arr = new int[3][];
        * */

      //Row value was mandatory
      //Column value was not mandatory
      //As each item inside the Multi Dimensional Array is an array inside an array

      //Construct a 3 x 3 array
      int[][] arr = new int[3][4]; //declaration
        int[] arr1 = {1,2,3};
        //initialization
        //here each index in a multi d array consist of an array hence as follows
        
        //input - predefined
        /*arr[0] = arr1;
        arr[1] = arr1;
        arr[2] = arr1*/;

        System.out.println("Enter the elements :" );
        //trying input entered by user
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {
              arr[row][col] = in.nextInt();
            }
        }

        //output
        //using for loop
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //using for each loop
        for (int[] a: arr)
        {
            System.out.println(Arrays.toString(a));
        }
        //System.out.println(Arrays.toString());

    }
}
