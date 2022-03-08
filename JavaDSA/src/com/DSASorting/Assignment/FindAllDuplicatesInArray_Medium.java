package com.DSASorting.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* FAANGM Medium Problem
* Problem: Find All Duplicates in an Array
* Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
*/

public class FindAllDuplicatesInArray_Medium
{
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,8,1,5,1};
        //int[] res = new int[];
        System.out.println(Arrays.toString(findDuplicates(arr).toArray()));
    }
    public static List<Integer> findDuplicates(int[] numbers)
    {
        List<Integer> result = new ArrayList<>();

        if(numbers.length>1)
        {
            cyclicSort(numbers);

            for(int i = 0;i<numbers.length;i++)
            {
                if(numbers[i]!=i+1)
                {
                    result.add(numbers[i]);
                }
            }
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
