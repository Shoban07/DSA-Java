package com.DSAarrays.Assignments;

//Description: House Robber
//Link: https://leetcode.com/problems/house-robber/submissions/

public class HouseRobbing
{
    public static void main(String[] args) {
        int[] moneyInHouses = {2,1,1,2};
        System.out.println(rob(moneyInHouses));
    }
    /*Time and space complexity
    * Time: O(n) single for loop
    * Space: O(1) no extra space is used*/
    public static int rob(int[] nums)
    {
        int maximumWealthSoFar = nums[0];
        int currentMaximumWealth = 0;
        int newMaximumWealth;

        for(int i=1;i<nums.length;i++)
        {
            //newMaximumWealth = Math.max(maximumWealthSoFar,currentMaximumWealth);
            newMaximumWealth = (maximumWealthSoFar>currentMaximumWealth)?maximumWealthSoFar:currentMaximumWealth;
            maximumWealthSoFar = nums[i]+currentMaximumWealth;
            currentMaximumWealth = newMaximumWealth;
        }

        return (currentMaximumWealth>maximumWealthSoFar)?currentMaximumWealth:maximumWealthSoFar;
    }
}
