package com.DSAarrays.Assignments;

import  java.util.*;

public class ThreeSumTriplets
{
    public static void main(String[] args) {

    }

    public static List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0;i+2< nums.length-1;i++)
        {
            int j = i+1; int k = nums.length-1;

            while(j<k)
            {
                if((nums[i]!=nums[j] && nums[j]!=nums[k] && nums[k]!=nums[i]) && nums[i]+nums[j]+nums[k]==0)
                {
                    List<Integer> innerResult = new ArrayList<>();
                    innerResult.add(nums[i]);
                    innerResult.add(nums[j]);
                    innerResult.add(nums[k]);
                    result.add(innerResult);
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k]<0)
                {
                    i++;
                    j=i+1;
                }
            }
        }


        return result;
    }
}
