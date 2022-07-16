package com.DSAarrays.Assignments;

//Description: Maximum Subarray
//Link: https://leetcode.com/problems/maximum-subarray/submissions/
import java.util.Arrays;

public class MaximumSubArray
{
    public static void main(String[] args)
    {
        int[] array = {5,-1,3,-2};
        System.out.println(MaxSubArray(array));
    }
    ////Time and space complexity
    //    //Time : O(n) -> [Since we need to traverse the whole matrix]
    //    //Space : O(1) -> if output array was not considered as space, the o(1).
    public static int MaxSubArray(int[] nums)
    {
        if(nums.length>1) {
            int maximumSoFar = Integer.MIN_VALUE;
            int buffer = 0;
            for (int i : nums) {
                buffer = buffer + i;

                if (buffer > maximumSoFar)
                    maximumSoFar = buffer;

                if (buffer < 0)
                    buffer = 0;
            }

            return maximumSoFar;
        }
        else {
            return nums[0];
        }
    }
}
