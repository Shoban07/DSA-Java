package com.DSAarrays.Assignments;

//Description: Product of Array Except Self
//Condition: Also should not use division operation
//Link: https://leetcode.com/problems/product-of-array-except-self/

import java.util.Arrays;

public class ProductOfArrayExceptSelf
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(ProductExceptSelf(arr)));
    }

    /* Time and Space Complexity
    * 1. Time: O(2n) = O(n)
    * 2. Space: O(1) no extra space was used
    * Condition: Should not use division operation*/
    public static int[] ProductExceptSelf(int[] arr)
    {
        int[] result = new int[arr.length];

        //calculating prefix
        int preFix = 1;
        for(int i = 0;i<arr.length;i++)
        {
            result[i] = preFix;
            preFix*=arr[i];
        }

        //calculating postfix and multiplying with prefix based result array
        int postFix = 1;
        for(int i = arr.length-1;i>=0;i--)
        {
            result[i] = postFix * result[i];
            postFix*=arr[i];
        }

        return result;
    }
}
