package com.DSASearching.LinearSearch.Assignements;

//Description: Richest Customer Wealth
//Link: https://leetcode.com/problems/richest-customer-wealth/
//Time Complexity: O(n2) - two nested loops are there
//Space complexity: O(1) - no extra space is used

public class WealthiestPerson
{
    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3},{3,4,2},{5,6,1},{6,6,1}};
        System.out.println("Max Wealth : "+CalculateWealth(arr));
    }
    static int  CalculateWealth(int[][] arr)
    {
        int maxWealth = 0;
        for (int[] ints : arr) {
            int currentWealth = 0;
            for (int anInt : ints) {
                currentWealth += anInt;
            }
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        return maxWealth;
    }

    static int CalculateWealth2(int[][] accounts)
    {
        int maxWealth = Integer.MIN_VALUE;
        if(accounts.length == 0)
            return 0;

        for(int person = 0; person<accounts.length; person++)
        {
            int sumOfPersonWealth = 0;
            for(int account = 0; account < accounts[person].length; account++)
            {
                sumOfPersonWealth += accounts[person][account];
            }

            if(sumOfPersonWealth > maxWealth)
            {
                maxWealth = sumOfPersonWealth;
            }
        }

        return maxWealth;
    }
}
