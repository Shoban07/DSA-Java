package com.DSASearching.LinearSearch.Assignements;

import java.util.Arrays;

public class SearchIn2DArrays
{
    public static void main(String[] args)
    {
        int[][] arr = {
                {1,2,3},{4,5,6},{7,-1,9}
        };
        System.out.println(Arrays.toString(SearchIn2DArray(arr,10)));
        System.out.println("Minimum in 2D Arrays :");
        System.out.println(MinimumIn2DArray(arr));
        System.out.println("Maximum in 2D Arrays :");
        System.out.println(MaximumIn2DArray(arr));
    }
    public static int[] SearchIn2DArray(int[][] arr, int target)
    {
        int[] index = {-1,-1};

        if(arr.length==0)
            return index;

        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }

    public static int MinimumIn2DArray(int[][] arr)
    {
        int minSoFar = arr[0][0];

        for(int i = 1;i<arr.length;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                if(arr[i][j]<minSoFar)
                    minSoFar = arr[i][j];
            }
        }

        return  minSoFar;
    }

    public static int MaximumIn2DArray(int[][] array)
    {
        int x = 0;
        int y = 0;

        if(array.length == 0)
            return array[x][y];

        for(int i = 0; i< array.length;i++)
        {
            for (int j = 1; j<array[i].length; j++)
            {
                if(array[i][j] > array[x][y])
                {
                    x=i;
                    y=j;
                }
            }
        }
        return array[x][y];
    }
}
