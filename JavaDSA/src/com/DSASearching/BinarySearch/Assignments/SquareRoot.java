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
    public static int squareRootOf(int x)
    {
        int start = 0;
        int end = x;
        if(end>46340) end = 46340; // when multiplied by itself it will exceed the max value that integer could hold
        while(end>=start)
        {
            int mid = (start+end)/2;

            if(mid*mid>x) end = mid -1;
            else if(mid*mid<x) start = mid + 1;
            else return mid;
        }
        return end;
    }
}
