package com.DSASearching.LinearSearch.Assignements;

//Description: Pow(x, n)
//Link: https://leetcode.com/problems/powx-n/

public class Power
{
    public static void main(String[] args)
    {
        double x = 2.0000;
        int n = -2;
        System.out.println(power(x,n));
    }

    public static double power2(double x, int n)
    {
        return Math.pow(x,n);
    }
    public static double power(double x, int n)
    {
        double result = 0.0000;
        //return Math.pow(x,n);
        if(n<0)
        {
            double ans = x;
            n = n*-1;
            for(int i =1;i<n;i++)
            {
                ans = ans*x;
            }
            result = 1/ans;

            return result;
        }

        if(n>0)
        {
            double ans = x;
            for(int i = 1;i<n;i++)
            {
                ans = ans*x;
            }

            result =  ans;
            return result;
        }

        if(n==0)
        {
            result = (double)1;
        }
        return result;
    }
}
