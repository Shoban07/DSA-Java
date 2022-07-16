package com.DSAarrays.Assignments;

//Description : Spiral Matrix - I
//Link: https://leetcode.com/problems/spiral-matrix/


import java.util.*;

public class SpiralMatrix
{
    public static void main(String[] args)
    {
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        //int[][] array = {{6},{7},{8}};
        List<Integer> result = SpiralMatrix(array);

        for(int i : result)
        {
            System.out.print(i+", ");
        }
    }
    //Time and space complexity
    //Time : O(m * n) -> [only one while loop in which we traverse around all the rows and columns and prints same length of matrix]
    //Space : O(1) -> if not considering the output as extra space, then the complexity is O(1).
    public static List<Integer> SpiralMatrix(int[][] matrix)
    {
        List<Integer> result = new ArrayList<>();
        int left = 0, right = matrix[0].length-1;
        int top = 0, bottom = matrix.length-1;

        if(matrix.length == 1)
        {
            for(int i : matrix[0])
            {
                result.add(i);
            }
        }
        else if(matrix[0].length == 1)
        {
            for(int i = 0 ; i< matrix.length;i++)
            {
                result.add(matrix[i][0]);
            }
        }
        else {
            while (left <= right && top <= bottom) {
                //left
                //getting all the elements from left to right which covers the first top row. then increment top by 1
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top += 1;

                //down
                //getting all the elements from top to bottom which covers the right column elements, then decrement right by 1;
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right -= 1;

                //right
                //getting all the elements from right to left, then decrement bottom by 1
                if(top<=bottom) {
                    for (int i = right ; i >= left; i--) {
                        result.add(matrix[bottom][i]);
                    }
                }
                bottom -= 1;

                //up
                if(left<=right) {
                    //getting all the elements from bottom to top, then increment left by 1
                    for (int i = bottom; i >= top; i--) {
                        result.add(matrix[i][left]);
                    }
                }
                left += 1;

            }
        }

        return result;
    }
}
