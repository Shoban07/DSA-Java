package com.DSAarrays.Assignments;

import java.util.Arrays;

//Link: https://leetcode.com/problems/sort-colors/
//Description: Sort Colors
//0 -red, 1- blue - 2 green
public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        SortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /*
    * 1 way of sloving this problem is using sorting algorithm which takes O(n2) Time complexity
    * This is oen of the brute force way to solve this question*/

    /*Time and Space Complexity
    * Time: O(n) we are not using nested loops
    * Space: O(1) no extra space is used*/
    public static void SortColors(int[] nums)
    {
        int l = 0;
        int r = nums.length-1;
        int i = 0;
        while(i<=r)
        {
            if(nums[i]==0)
            {
                swap(nums,i,l);
                i++;
                l++;
            }
            else if(nums[i] == 2)
            {
                swap(nums,i,r);
                i++;
                r--;
            }
            else
            {
                i++;
            }
        }
    }
}
