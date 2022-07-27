package com.DSAarrays.Assignments;

//Description : Set Matrix Zeroes
//Link: https://leetcode.com/problems/set-matrix-zeroes/
import java.util.*;

public class SetMatrixByZero
{
    public static void main(String[] args)
    {
        int[][] matrix = {{0,1,1,0},{1,1,1,1},{1,1,1,1}};
        setZeros(matrix);

        for(int i = 0;i<matrix.length;i++)
        {

                System.out.println(Arrays.toString(matrix[i]));

        }
    }

    /* Time and Space Complexity
    * Time: O(n2) as have couples of nested for loops
    * Space: O(1) utilized the same matrix space*/
    public static void setZeros(int[][] matrix)
    {
        /*Algorithm
        * 1. Find the index of matrix with 0, its row index and column index by iterating through the matrix
        * 2. Based on the value of row and column with size of the matrix in mind note down the indices in any format
        * and traverse through all the row and col of matrix to find remaining zeroes if any.
        * 3. Once completed with zeros finding, based on their values swap rows and cols with zero
        * */

        List<List<Integer>> trackZeroIndices = new ArrayList<List<Integer>>();
        //Step 1
        for(int i = 0; i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                //Step 2
                if(matrix[i][j] == 0)
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    trackZeroIndices.add(list);
//                    setZerosRowBased(i,matrix);
//                    setZerosColumnBased(j,matrix);
                }
            }
        }

        //step 3
        for (List<Integer> rowCol: trackZeroIndices)
        {
            int row = rowCol.get(0);
            int col = rowCol.get(1);
            setZerosRowBased(rowCol.get(0),matrix);
            setZerosColumnBased(rowCol.get(1),matrix);
        }

    }
    public static void setZerosRowBased(int i, int[][]matrix)
    {
        for(int j = 0;j<matrix[i].length;j++)
        {
            matrix[i][j] = 0;
        }
    }
    public static void setZerosColumnBased(int j, int[][]matrix)
    {
        for(int i = 0; i<matrix.length;i++)
        {
            matrix[i][j] = 0;
        }
    }
}
