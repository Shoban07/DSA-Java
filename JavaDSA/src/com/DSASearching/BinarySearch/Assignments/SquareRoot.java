package com.DSASearching.BinarySearch.Assignments;

//Problem: Sqrt(x)
//Link: https://leetcode.com/problems/sqrtx/

public class SquareRoot
{
    public static void main(String[] args)
    {
        int x = 49;
        System.out.println(squareRootOf(x));
    }

    /*
    * Time Complexity: O(log n) since we use binary search as we search through sorted number line
    * Space Complexity: O(1) no extra space is used*/
    public static int squareRootOf(int x)
    {
        //Apply Binary search
        int start = 0;
        int end = x;

        //edge case
        if(end>Integer.MAX_VALUE) end = Integer.MAX_VALUE;

        while(end >= start)
        {
            int mid = (start+end)/2;

            if(mid*mid > end) end = mid - 1;

            else if(mid*mid<end) end = mid + 1;

            else return mid;
        }
        return start;
    }

    //If not given constraint to avoid built-in functions
    public static int squareRootOf2(int x)
    {
        return (int)Math.sqrt(x);
    }
}
