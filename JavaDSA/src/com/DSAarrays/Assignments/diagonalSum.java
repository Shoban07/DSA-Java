package com.DSAarrays.Assignments;

public class diagonalSum {
    public static void main(String[] args) {
        int[][] diagonalArray = {{1,2,3,5},
                                  {4,5,6,4},
                                  {7,8,9,1},
                                  {1,1,1,1}};

        System.out.println(diagonalSumOfMatrix(diagonalArray));
    }
    public static int diagonalSumOfMatrix(int[][] mat)
    {
        int len = mat.length;
        int half = len / 2;
        int sum = 0;
        for(int left = 0, rigth = len - 1; left < half; left++, rigth--) {
            int[] rowUp = mat[left];
            int[] rowDown = mat[rigth];
            sum += rowUp[left] + rowUp[rigth] + rowDown[left] + rowDown[rigth];
        }
        if(len % 2 == 1) sum += mat[half][half];
        return sum;
    }

    public  static int optimizeddiagonalSumOfMatrix(int[][] mat)
    {
        if(mat.length == 1)
        {
            return mat[0][0];
        }
        // int len = mat.length;
        // int half = len / 2;
        // int sum = 0;
        // for(int left = 0, rigth = len - 1; left < half; left++, rigth--) {
        //     int[] rowUp = mat[left];
        //     int[] rowDown = mat[rigth];
        //     sum += rowUp[left] + rowUp[rigth] + rowDown[left] + rowDown[rigth];
        // }
        // if(len % 2 == 1) sum += mat[half][half];
        // return sum;
        int res = 0;
        int n = mat.length;
        for (int i=0; i<n; i++) {
            res += mat[i][i]; // Primary diagonals are row = column!
            res += mat[n-1-i][i]; // Secondary diagonals are row + column = n-1!
        }
        return n % 2 == 0 ? res : res - mat[n/2][n/2];
    }
}
