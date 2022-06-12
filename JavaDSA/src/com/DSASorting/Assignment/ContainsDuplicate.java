package com.DSASorting.Assignment;

public class ContainsDuplicate
{
    public static void main(String[] args)
    {
        int[] arr = {3,3};

        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        boolean result = false;
        if(nums.length>2)
        {
            cyclicSort(nums);

            for(int i = 0; i<nums.length;i++)
            {
                if(nums[i] != i+1)
                {
                    return true;
                }
            }
        }
        else
        {
            if(nums.length==2)
                return nums[0]==nums[1]?true:false;
            else if(nums.length<=1)
                return false;
        }
        return result;
    }
    public static void cyclicSort(int[] arr)
    {
        int i = 0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
    }
    public static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
