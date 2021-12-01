package com.DSAarrays.Assignments;

/*
* *Difficulty : Easy 13. Cells with Odd Values in a Matrix.
//reference link : https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
*
* There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.

* Example 1:
[0,0,0]     [1,2,1]     [1,3,1]
[0,0,0]  -> [0,1,0] ->  [1,3,1]
*
Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.

*/

import java.util.Arrays;

public class cellsWithOddValuesInMatrix
{
    public static void main(String[] args)
    {
        int[][] initialArray = new int[2][3];
        //int[][] indicesArray = {{0,1},{1,1}};
//        for(int i =0;i<initialArray.length;i++)
//        {
//            for (int j=0;j<initialArray[i].length;j++)
//            {
//                initialArray[i][j] = 0;
//            }
//        }
        for (int i=0;i< initialArray.length;i++)
        System.out.println(Arrays.toString(initialArray[i]));
        int[][] indicesArray = {{0,1},{1,1}};

        System.out.println(oddCells(2,3,indicesArray));
        System.out.println(oddCellsBool(2,3,indicesArray));
    }
    public static int oddCells(int row,int col, int[][]indices)
    {
        int[] rows = new int[row];
        int[] cols = new int[col];
        int oddCellsCount = 0;
       for(int i =0;i<indices.length;i++)
       {
           rows[indices[i][0]]++;
           cols[indices[i][1]]++;
       }
       for(int i = 0;i<row;i++)
       {
           for(int j=0;j<col;j++)
           {
               oddCellsCount+=(rows[i]+cols[j])%2;
           }
       }
        return oddCellsCount;
    }

    public static int oddCellsBool(int row,int col, int[][]indices)
    {
        int oddcounts = 0;
        boolean[] rows = new boolean[row];
        boolean[] cols = new boolean[col];

        for (int i = 0; i< indices.length;i++) {
            rows[indices[i][0]] = !rows[indices[i][0]];
            cols[indices[i][1]] = !cols[indices[i][1]];
        }
        for (boolean x: rows)
        {
            for(boolean y: cols)
            {
                if(x^y) oddcounts++;
            }
        }
        return oddcounts;
    }
}
