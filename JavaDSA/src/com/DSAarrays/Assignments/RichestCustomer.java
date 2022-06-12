package com.DSAarrays.Assignments;

//Difficulty : Easy 4. Richest Customer Wealth
//reference link : https://leetcode.com/problems/richest-customer-wealth/

/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
* */

public class RichestCustomer
{
    public static int maximumWealth(int[][] accounts)
    {
         /*int res = 0;
         int maxSoFar = 0;
        int[] resarray = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++)
        {
            int sumof1dArray = 0;
            for (int j = 0; j < accounts[i].length; j++)
            {
                sumof1dArray += accounts[i][j];
            }
            resarray[i] = sumof1dArray;
        }

        for (int i= 0;i<resarray.length;i++)
        {
            maxSoFar = Math.max(resarray[i],maxSoFar);
        }
        //res = Math.max()
        return  maxSoFar;*/
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account:accounts)
        {
            int currentWealth = 0;
            for (int money: account)
            {
                    currentWealth+=money;
            }
            maxWealth = Math.max(currentWealth,maxWealth);
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] arr= {{1,2},{1}};
        System.out.println(maximumWealth(arr));
    }
}
