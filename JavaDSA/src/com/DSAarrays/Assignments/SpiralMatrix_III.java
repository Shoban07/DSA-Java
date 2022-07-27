package com.DSAarrays.Assignments;

//Description: Spiral Matrix III
//Link: https://leetcode.com/problems/spiral-matrix-iii/
import java.util.Arrays;

public class SpiralMatrix_III
{
    public static final int[][] dir = new int[][]{{0,1}, {1,0}, {0,-1}, {-1, 0}};
    public static void main(String[] args)
    {
        int rows = 5, cols = 6, rStart =1, cStart = 4;

        int result[][] = SpiralMatrixIII(rows,cols,rStart,cStart);

        for(int i = 0 ; i<result.length; i++)
        {

                System.out.println(Arrays.toString(result[i])+ ",");

        }
    }


    /*Time and Space Complexity
    * Time: O(m*n) since we traverse all the indices of the matrix
    * Space: O(1) apart from space occupied for result matrix variable
    */
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart)
    {
        //result matrix will always be in size of res[rows*cols][2] ; because we are going to return the indices of the matrix we follow in given spiral order
        //it has row*col rows and 2 columns basically 2 refers to x and y columns
        int[][] matrix = new int[rows*cols][2];

        /* Direction explanation
        //we are going to follow a direction map for matrix
        //
        //                (-1,0) ---(up arrow)-> y axis
        //         (0,-1) (0,0) (0,1) ----> x axis
        //                (1,0)

        Hence our direction map will be a 1d array => direction[] = {moving to east, moving to south, moving to west, moving to north}
        ---------------------------------------------> direction[] = {0,1,0,-1,0} - take two pairs {0,1}, {1,0}, {0,-1}, {-1,0}
         */
        int[] directions = {0,1,0,-1,0};
        int length = 0; //to verify the distance travelled
        int directionIndex = 0; //maps direction index to track direction move
        int resultMatrixIndex = 0; // to place the value / to track the index position in result matrix

        //initially we know the starting position is rStart and cStart and put that in result matrix
        matrix[resultMatrixIndex++] = new int[]{rStart,cStart};

        while(resultMatrixIndex< rows*cols) //to traverse all the matrix indices
        {
            if(directionIndex == 0 || directionIndex == 2) // incrementing the length for calculating the distance need to traverse to cover the end of row
            {
                length++;
            }

            //to traverse till the end of row and add the possible indices traversed
            for(int k=0;k<length;k++)
            {
                /*based on the length that need to travelled we fill the result matrix with index of travelled row and column
                indexes*/
                rStart += directions[directionIndex];
                cStart += directions[directionIndex + 1];

                if(rStart < rows && cStart < cols && rStart >=0 && cStart>=0)
                {
                    matrix[resultMatrixIndex++] = new int[]{rStart,cStart};
                }
            }
            //Direction index will be increased for giving directions to the next set of row column traversing
            directionIndex = ++directionIndex % 4;
        }
        return matrix;
    }

    public static int[][] SpiralMatrixIII(int row, int col, int rstart, int cstart)
    {
        // initialize the return matrix
        int[][] resultMatrix = new int[row*col][2];

        //confirm with recruiter that they travel in the spiral direction from given point of rstart and cstart
        int[] directions = {0,1,0,-1,0};

        //to track and put values in result matrix
        int resultMatrixIndex = 0;

        // to track and move the index of result matrix
        int directionMatrixIndex = 0;

        //to track the length need to be travelled out of total length of given matrix order
        int length = 0;

        resultMatrix[resultMatrixIndex++] = new int[]{rstart,cstart};

        //traverse all indices of matrix untill you reach the last index
        while(resultMatrixIndex<row*col)
        {
            if(directionMatrixIndex ==0 || directionMatrixIndex == 2)
            {//if the index of direction matrix index if was either 0 or 2 increase the length to be traversed such that
                //it refers to jumping from row to col as we are traversing in spiral way
                length++;
            }

            //till we traverse before the length we need to add the rstart and cstart values based on the direction and direction index
            //traversing till the last may end up with IOB exception because we will jumping out of the matrix border
            for(int k = 0; k<length;k++)
            {
                rstart += directions[directionMatrixIndex];
                cstart += directions[directionMatrixIndex+1];

                //fill the result matrix with the populated rstart and cstart values based on following conditions
                if(rstart >= 0 && rstart<row && cstart>=0 && cstart<col)
                {
                    resultMatrix[resultMatrixIndex++] = new int[]{rstart,cstart};
                }
            }
            directionMatrixIndex = ++directionMatrixIndex % 4;

        }

        return  resultMatrix;
    }


}
