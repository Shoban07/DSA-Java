package com.DSASorting.Assignment;

/*
****** : Google Question
*Problem: Find All Numbers Disappeared in an Array
* Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(Arrays.toString(findDisappearedNumbers(arr).stream().toArray()));
    }
    public static List<Integer> findDisappearedNumbers(int[] numbers) {
        List<Integer> result = new ArrayList<Integer>();
        //sort the array
        cyclicSort(numbers);
        //iterate through and find the missing values
        for(int i = 0; i<numbers.length;i++)
        {
            if(numbers[i]!=i+1)
                result.add(i+1);
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
                if(arr[i]<arr.length)
                swap(arr,i,correct);
            else
                i++;
        }
    }

    private static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}