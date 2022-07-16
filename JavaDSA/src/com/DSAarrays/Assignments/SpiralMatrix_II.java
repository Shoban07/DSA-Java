package com.DSAarrays.Assignments;

//Description: Spiral Matrix II : Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
//Link: https://leetcode.com/problems/spiral-matrix-ii/submissions/

public class SpiralMatrix_II
{
    public static void main(String[] args)
    {
        int[][] array = generateMatrix(4);

        for(int i=0;i<array.length;i++)
        {
            System.out.print("[");
            for(int j=0;j<array[i].length;j++)
            {
                System.out.print(array[i][j]+",");
            }
            System.out.print("]");
            System.out.println();
        }
        System.out.println();
    }

    //Time and Space Complexity Analysis:
    //Time: O(m*n) :  as have to iterate all the indexes of 2D matrix
    //Space O(1) : No extra space used, other than output array created.
    public static int[][] generateMatrix(int n)
    {
        int left = 0,top = 0;
        int right = n-1,bottom = n-1;
        int[][] result = new int[n][n];
        int counter = 1;

        while (left <= right && top <= bottom) {
            //left
            //getting all the elements from left to right which covers the first top row. then increment top by 1
            for (int i = left; i <= right; i++) {
                result[top][i] = counter++;
            }
            top += 1;

            //down
            //getting all the elements from top to bottom which covers the right column elements, then decrement right by 1;
            for (int i = top; i <= bottom; i++) {
                result[i][right] = counter++;
            }
            right -= 1;

            //right
            //getting all the elements from right to left, then decrement bottom by 1
            if(top<=bottom) {
                for (int i = right ; i >= left; i--) {
                    result[bottom][i] = counter++;
                }
            }
            bottom -= 1;

            //up
            if(left<=right) {
                //getting all the elements from bottom to top, then increment left by 1
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = counter++;
                }
            }
            left += 1;

        }

        return result;
    }
}
