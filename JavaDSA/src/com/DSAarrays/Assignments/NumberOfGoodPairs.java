package com.DSAarrays.Assignments;

//Difficulty : Easy 7. Number of Good Pairs
//reference link : https://leetcode.com/problems/number-of-good-pairs/
/*
* Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.*/

public class NumberOfGoodPairs {
    public int NumIdenticalPairs(int[] nums) {
        /*int count = 0;
        for(int i = 0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
        }
        return count;*/
        int res = 0, count[] = new int[101];
        for(int n: nums){
            res = res + count[n];
            count[n]++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 3};
        NumberOfGoodPairs gp = new NumberOfGoodPairs();
        System.out.println(gp.NumIdenticalPairs(arr));
    }
}
