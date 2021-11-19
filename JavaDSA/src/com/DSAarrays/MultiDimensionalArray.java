package com.DSAarrays;

import java.util.Scanner;
import java.util.Arrays;

public class MultiDimensionalArray
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0;i<arr.length;i++)
        {
            for (int j =0;j<arr[i].length;j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        //using for loop
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("[");
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+",");
            }
            System.out.print("]");
            System.out.println();
        }
        System.out.println();
        //using for each
        for(int[] subarr : arr)
        {
            System.out.println(Arrays.toString(subarr));
        }
    }
}
