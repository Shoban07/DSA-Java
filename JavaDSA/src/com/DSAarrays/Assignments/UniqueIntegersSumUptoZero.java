package com.DSAarrays.Assignments;

//Description : Find N Unique Integers Sum up to Zero
//Link: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

import java.util.Arrays;

public class UniqueIntegersSumUptoZero
{
    public static void main(String[] args) {

        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    public static int[] sumZero(int n)
    {
        int[] resArray = new int[n];

        if(n%2==1) // if length was odd we can put 0 in one of the index and remaining things as +ve and _ve integers
        {
            resArray[0] = 0;

            for(int i = 1;i<n;i=i+2)
            {
                resArray[i] = i*1;
                resArray[i+1] = i*-1;
            }
        }
        else // if input length was even numbers, then we have to place the +ve and -ve integers without zero to tally the count, else will result in out of bounds exception
        {
            for(int i = 0; i<n ; i = i+2)
            {
                resArray[i] = (i+1)*1;
                resArray[i+1] = (i+1)*-1;
            }
        }

        return resArray;
    }
}
