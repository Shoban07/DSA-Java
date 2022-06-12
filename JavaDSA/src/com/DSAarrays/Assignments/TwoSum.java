package com.DSAarrays.Assignments;

// Two Sum
//reference link : https://leetcode.com/problems/two-sum/

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
int[] arr = {2,7,9,11} ; result = {0,1}
*/
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum
{
    public static void main(String[] args)
    {
        int[] arr = {2,7,9,11};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    public static int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();

        for(int i = 0; i<nums.length; i++)
        {
            int reqNum = target - nums[i];

            if(indexMap.containsKey(reqNum))
            {
                int[] toReturn = {indexMap.get(reqNum), i};

                return toReturn;
            }

            indexMap.put(nums[i],i);
        }
        return null;
    }
}
