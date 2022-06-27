package com.DSAarrays.Assignments;

import java.util.Arrays;

public class TransposeOfMatrix
{
    //Description : Transpose of matrix
    //Link: https://leetcode.com/problems/transpose-matrix/
    public static void main(String[] args)
    {
        int[][] array = {{2,4,1},{-10,5,11},{4,5,6}};
        //transpose(array);
        for(int[] arr : transpose(array))
        {
            System.out.println(Arrays.toString(arr));
        }
    }
    public static int[][] transpose(int[][] matrix) {

        int[][] resArray = new int[matrix[0].length][matrix.length];

        for(int i = 0; i<matrix.length;i++)
        {
            for(int j=0;j< matrix[0].length;j++)
            {
                resArray[j][i] = matrix[i][j];
            }
        }
        return resArray;
    }
}
