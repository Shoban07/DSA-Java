package com.DSAarrays.Assignments;

//Description: Determine Whether Matrix Can Be Obtained By Rotation
//Link: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

public class MatrixObtainedByRotation
{
    public static void main(String[] args) {
        int[][] matrix = {{0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};
        System.out.println(findRotation(matrix,target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {

        if(mat.length != target.length)
        {
            return false;
        }
        boolean result = false;

        if(isRightRotated(mat,target))
        {
            result = true;
        }
        if(isRightDoubleRotated(mat,target))
        {
            result = true;
        }
        if(isLeftRotated(mat,target))
        {
            result = true;
        }
        if(isSame(mat,target))
        {
            result = true;
        }

        return result;
    }

    private static boolean isSame(int[][] mat, int[][] target)
    {
        int n = mat.length;
        for(int i=0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(mat[i][j] != target[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isLeftRotated(int[][] mat, int[][] target)
    {
        int n = mat.length;
        for(int i=0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(mat[i][j] != target[n-j-1][i])
                {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isRightDoubleRotated(int[][] mat, int[][] target)
    {
        int n = mat.length;
        for(int i=0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(mat[i][j] != target[n-i-1][n-1-j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isRightRotated(int[][] mat, int[][] target)
    {
        int n = mat.length;
        for(int i=0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(mat[i][j] != target[j][n-i-1])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
