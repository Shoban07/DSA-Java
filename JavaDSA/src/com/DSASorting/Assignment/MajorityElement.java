package com.DSASorting.Assignment;

public class MajorityElement
{
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums)
    {
        int majorityElement = 0;
        for(int i = 0;i<nums.length;i++)
        {
            int count = 1;
            //majorityElement = nums[i];

            for(int j = i+1;j<=nums.length-1;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                    if(count>nums.length/2)
                    {
                        majorityElement = nums[i];
                    }
                }
            }
        }
        return majorityElement;
    }
}
