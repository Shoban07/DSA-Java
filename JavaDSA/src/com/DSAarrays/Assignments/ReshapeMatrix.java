package com.DSAarrays.Assignments;

//Description: Reshape the Matrix
//Link: https://leetcode.com/problems/reshape-the-matrix/

import java.util.Arrays;

public class ReshapeMatrix
{
    public static void main(String[] args) {
        int[][] array = {{1,2},{3,4}};
        int r = 2; int c = 4;
        System.out.println(Arrays.toString(Reshape(array,r,c)));
    }
    public static int[][] Reshape(int[][] mat, int r, int c)
    {
        if(mat.length == r && mat[0].length == c)
            return mat;

        if((mat.length*mat[0].length) != (r*c))
            return mat;

        int[][] resultArray = new int[r][c];
        int bufferRow = 0;
        int bufferColumn = 0;
        for(int i = 0; i<mat.length;i++)
        {
            for(int j = 0; j< mat[0].length;j++)
            {
                resultArray[bufferRow][bufferColumn++] = mat[i][j];
                if(bufferColumn == c)
                {
                    bufferColumn = 0;
                    bufferRow++;
                }
            }
        }

        return resultArray;
    }
}
