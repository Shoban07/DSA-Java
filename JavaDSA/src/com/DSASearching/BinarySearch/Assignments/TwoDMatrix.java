package com.DSASearching.BinarySearch.Assignments;

import java.util.Arrays;

public class TwoDMatrix
{
    public static void main(String[] args)
    {
        int[][] arr2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[][] arr = {
                {11,22,33,44},
                {13,23,34,45},
                {24,25,37,49},
                {33,35,39,50}
        };
        System.out.println(Arrays.toString(search(arr,24)));
        System.out.println(Arrays.toString(searchLinear(arr,11)));
        System.out.println(Arrays.toString(search(arr2,9)));
    }
    //using linear search approach.
    //Time complexity: We use nested loops. Time complexity O(NxN).
    static int[] searchLinear(int[][] matrix, int target)
    {

        for(int row = 0;row<matrix.length;row++)
        {
            for(int col=0;col<matrix[row].length;col++)
            {
                if(matrix[row][col]==target) return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }

    //using binary search approach
    // time complexity is we iterated two times hence 2N: -> O(2N)-> O(N) [constants were not considered in time complexity]
    static int[] search(int[][] matrix, int target)
    {
        int row = 0;
        int col = matrix.length-1;

        while(row<matrix.length && col>=0)
        {
            if(matrix[row][col]==target) return new int[]{row,col};
            if(matrix[row][col]<target) row++;
            else col--;
        }
        return  new int[]{-1,-1};
    }
}
