package com.DSASearching.BinarySearch.Assignments;

/*
/Link:https://leetcode.com/problems/check-if-n-and-its-double-exist/
/Problem: Check If N and Its Double Exist
 */

public class CheckIfNthHasDouble
{
    public static void main(String[] args) {
        int[] array = {0,0};
        System.out.println(ifExists(array));

    }
    public static boolean ifExists(int[] array)
    {
        boolean result = false;
        //int length = array.length;;
        boolean[] isWholeNumber = new boolean[array.length];

        for(int i = 0; i<array.length;i++)
        {
            if(array[i]%2==0 && array[i]/2>0)
            {
                isWholeNumber[i] = true;
            }
        }

        for(int j = 0;j<isWholeNumber.length;j++)
        {
            if(isWholeNumber[j])
            {
                int target = array[j]/2;
                for (int k = 0; k<array.length;k++)
                {
                    if(array[k]==target)
                    return true;
                }
            }
        }

        return result;
    }
}
