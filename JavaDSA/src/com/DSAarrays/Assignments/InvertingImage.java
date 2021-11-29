package com.DSAarrays.Assignments;

//region Problem Description
/*
*Difficulty : Easy 13. Flipping an Image.
//reference link : https://leetcode.com/problems/flipping-an-image/
*
* Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].


Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

*/
//endregion

import java.util.Arrays;

public class InvertingImage {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int[][] invertedImage = new int[image.length][image.length];
        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image[row].length; col++) {
                invertedImage[row][col] = image[row][(image.length-1)-col]; // inverts the row array [1,0,0] -> [0,0,1]
                invertedImage[row][col] = invertedImage[row][col]==0?1:0; //converts 0s to 1s and 1s to 0s using binary operator
            }
        }
        for(int i = 0;i<image.length;i++)
        System.out.println(Arrays.toString(invertedImage[i]));
    }
}
