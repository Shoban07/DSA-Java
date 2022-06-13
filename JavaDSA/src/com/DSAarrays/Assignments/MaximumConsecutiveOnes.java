package com.DSAarrays.Assignments;

import java.util.Arrays;

//Description: Max Consecutive Ones
//Link: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
public class MaximumConsecutiveOnes
{
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums)
    {
        if(nums.length==1 && nums[0] == 1)
        {
            return 1;
        }

        int maxCount = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]==1)
            {
                count++;
                if(count>maxCount)
                {
                    maxCount = count;
                }
            }
            else{
                count = 0;
            }
        }
        return maxCount;
    }
}
