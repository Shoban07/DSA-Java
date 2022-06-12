package com.DSASorting.Assignment;

/*Amazon Question*/
//Problem: Single Number
//Link: https://leetcode.com/problems/single-number/

class MissingNumber {

    public static void main(String[] args) 
    {
        int[] arr = {0};
        if(arr.length>0)
        System.out.println("Missing number in given array :"+missingNumber(arr));
        else
            System.out.println("Missing number is 0");
    }
    public static int missingNumber(int[] numbers)
    {
        cyclicSort(numbers);

        for(int i = 0;i< numbers.length;i++)
        {
            if(numbers[i]!=i)
            {
                return i;
            }
        }
        return numbers.length;
    }
    public static void cyclicSort(int[] arr)
    {
        int i = 0;
        while(i<arr.length)
        {
            int correct = arr[i]; // in our case array starts with 0
            if(arr[i]<arr.length&&arr[i]!=arr[correct])
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
        arr[second]=temp;
    }

}