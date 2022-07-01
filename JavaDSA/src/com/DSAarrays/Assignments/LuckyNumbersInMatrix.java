package com.DSAarrays.Assignments;

//Description: Lucky Numbers in a Matrix
//Link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/

import java.util.*;
public class LuckyNumbersInMatrix
{
    public static void main(String[] args) {

        int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(Arrays.toString(luckyNumbers(arr).stream().toArray()));
        
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rowiseMinimum = Integer.MAX_VALUE;
        int rowMaxSoFar = Integer.MIN_VALUE;
        int columnWiseMaximum = Integer.MIN_VALUE;
        int columnMinSoFar = Integer.MAX_VALUE;
        //first check for minimum number row wise one by one and out of them get their maximum
        for(int i = 0;i< matrix.length;i++)
        {
            for(int j = 0;j<matrix[i].length;j++)
            {
                if(matrix[i][j] < rowiseMinimum)
                {
                    rowiseMinimum = matrix[i][j];
                }
            }
            if(rowiseMinimum>rowMaxSoFar)
            {
                rowMaxSoFar = rowiseMinimum;
            }

            rowiseMinimum = Integer.MAX_VALUE;
        }

        for(int i = 0;i< matrix[0].length;i++)
        {
            for(int j = 0;j<matrix.length;j++)
            {
                if(matrix[j][i] > columnWiseMaximum)
                {
                    columnWiseMaximum = matrix[j][i];
                }
            }
            if(columnWiseMaximum<columnMinSoFar)
            {
                columnMinSoFar = columnWiseMaximum;
            }
            columnWiseMaximum = Integer.MIN_VALUE;
        }
        
        if(rowMaxSoFar == columnMinSoFar)
        {
            res.add(rowMaxSoFar);
        }
        
        return res;
    }
}
