package com.DSASearching.BinarySearch.Assignments;

//Problem: Validate Perfect Square
//Link: https://leetcode.com/problems/valid-perfect-square/
public class PerfectSqreRoot
{
    public static void main(String[] args)
    {
        int num = 9;
        System.out.println(PerfectSquare(num));
    }
    public static boolean PerfectSquare(int x)
    {
        if(x==1) return true;

        long start = 1;
        long end = x/2;
        while (start<=end)
        {
            long mid = start+(end-start)/2;

            if(mid*mid==x) return true;
            if(mid>x/mid) end = mid-1;
            else start = mid +1;
        }
        return false;
    }
}
