package com.DSASorting.Assignment;

import java.util.Arrays;

public class LargestNumber_Medium
{
    public static void main(String[] args)
    {
        int[] arr = {2,9,17,39,10};
        //selectionSort(arr);
        String output = LargestNumber(arr);
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(output);
    }
    public static String LargestNumber(int[] nums)
    {
        String res = "";

        selectionSort(nums);
        //using BinarySearch approach

        int start = 0;
        int end = nums.length-1;
        while(start <= end)
        {
            if(start==end)
            {
                String check1 = res + String.valueOf(nums[start]);
                String check2 = String.valueOf(nums[start]) + res;

                if(Double.parseDouble(check1)>Double.parseDouble(check2))
                {
                    res = check1; start++;
                }
                else res = check2; end--;
            }
            else
            {
                String chk1 = String.valueOf(nums[end])+ res + String.valueOf(nums[start]);
                String chk2 = String.valueOf(nums[start])+ res + String.valueOf(nums[end]);

                if(Double.parseDouble(chk1)>Double.parseDouble(chk2))
                {
                    res = chk1;
                    start++;
                    end--;
                }
                else
                {
                    res = chk2; start++; end--;
                }
            }
        }
        return  res;
    }

    public static void selectionSort(int[] arr)
    {
        if(arr.length>1)
        {
            for(int i = 0; i<arr.length;i++)
            {
                int lastIndex = arr.length-i-1;
                int maxIndex = getMaxIndex(arr,0,lastIndex);

                //swap
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[lastIndex];
                arr[lastIndex] = temp;
            }
        }
    }

    private static int getMaxIndex(int[] arr, int start, int lastIndex)
    {
        int maxIndex = start;
        for(int i = start;i<=lastIndex;i++)
        {
            if(arr[maxIndex]<arr[i])
            {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /*
    * public String largestNumber(int[] nums)
    {

        String res = "";
        for(int i = 0; i<nums.length;i++)
        {
            if(res.isBlank())
            {
                res = String.valueOf(nums[i]);
            }
            else if(!res.isBlank())
            {
                String a = res+ String.valueOf(nums[i]);
                String b = String.valueOf(nums[i]) + res;

                if(Integer.parseInt(a) > Integer.parseInt(b))
                {
                    res = a;
                }
                else
                {
                    res = b;
                }
            }
        }
        return res;

    }*/
}
