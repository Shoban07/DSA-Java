package com.DSASearching.BinarySearch.Assignments;
//Problem: Arranging Coins
//Link: https://leetcode.com/problems/arranging-coins/
public class ArrangingCoins
{
    public static void main(String[] args)
    {
        String name = "shoban";
        for (char ch:name.toCharArray())
        {

        }
        int coinsCount = 2;
        System.out.println("Maximum filled staircase :"+arrangeCoins(coinsCount));
    }
    public static int arrangeCoins(int n)
    {
        if(n<=1) return 1;
        if(n<=3) return n==3?2:1;
        long start = 1;
        long end = n;
        while(start<end)
        {
            long mid = start+(end-start)/2;
            long capacity = mid*(mid+1)/2;

            if(capacity>n)
            {
                end = mid -1;
            }
            else if(capacity<n)
            {
                start = mid + 1;
            }
            else if(capacity==n)
            {
                return (int)mid;
            }
        }
        //when pointers start,end and mid, points to the same staircase then check for the capacity.
        //if capacity <= coins then maximum filled staircase was either any of the pointer(start/end/mid)
        if((end*(end+1)/2)<=n)
            return (int)end;
//        else if capacity>coins then the maximum filled staircase will be the previous staircase from current pointer.
//        Because the current staircase (start/end/mid)
//        was not completely filled with the coins.
//        Hence, the previous staircase was the completely filled one.
        else return (int)end-1;
    }
}
