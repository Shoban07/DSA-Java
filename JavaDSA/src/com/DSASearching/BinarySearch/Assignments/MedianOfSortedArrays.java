package com.DSASearching.BinarySearch.Assignments;

//Description: Median of Two Sorted Array
//Condition: Achieve Time complexity - O(log(m+n))
//Link: https://leetcode.com/problems/median-of-two-sorted-arrays/

import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianOfSortedArrays
{
    public static void main(String[] args)
    {
        int[] sortedArray1 = {1,2};
        int[] sortedArray2 = {3,4};
        System.out.println(findMedianSortedArrays(sortedArray1,sortedArray2));
    }

    /*Method 1
    * 1. Concatenate both the arrays into one single array using built-in functions
    * 2. Sort the created single array
    * 3. If length of single array was even then take the middle and middle-1 element and return median of them
    * 4. If length of single array was odd then return the middle element of the array as median*/
    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        //Step 1
        int[] nums3 = new int[nums1.length+nums2.length];
        int k = 0;
        double result = 0;
        for(int i = 0; i<nums1.length;i++)
        {
            nums3[k] = nums1[i];
            k++;
        }
        for(int j = 0; j<nums2.length;j++)
        {
            nums3[k] = nums2[j];
            k++;
        }

        //Step 2
        Arrays.sort(nums3);

        //Step 3
        return median(nums3);
    }

    /*Method 2
    * 1. Concatenate both the arrays into one by comparing the elements such that arranging in sorted manner
    * 2. Now the arrays is sorted
    * 3. If length of single array was even then take the middle and middle-1 element and return median of them
    * 4. If length of single array was odd then return the middle element of the array as median*/


    public static double findMedianSortedArrays2(int[] nums1, int[] nums2)
    {
        int m = 0;
        int n = 0;
        int[] resultArray = new int[nums1.length+ nums2.length];
        int k = 0;
        while(m< nums1.length && n< nums2.length)
        {
            if(nums1[m]<nums2[n])
            {
                resultArray[k] = nums1[m];
                m++;
            }
            else
            {
                if(n< nums2.length)
                {
                    resultArray[k] = nums2[n];
                    n++;
                }
            }
            k++;
        }
        while(m< nums1.length)
        {
            resultArray[k] = nums1[m];
            m++;
            k++;
        }
        while(n< nums2.length)
        {
            resultArray[k] = nums2[n];
            n++;
            k++;
        }
        return median(resultArray);
    }

    public static double median(int[] nums3)
    {
        double result = 0.0;

        int start = 0;
        int end = nums3.length-1;
        int mid = start+(end - start)/2;
        if(nums3.length % 2 == 0)
        {
            result = nums3[mid]+nums3[mid+1];
            result /= 2;
        }
        else if(nums3.length % 2 != 0)
        {
            result = nums3[mid];
        }

        return result;
    }
}
