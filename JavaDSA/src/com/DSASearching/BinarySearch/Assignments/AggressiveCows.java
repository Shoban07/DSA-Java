package com.DSASearching.BinarySearch.Assignments;

//Link: https://www.spoj.com/problems/AGGRCOW/
//Description: Aggressive Cows
//Find largest minimum distance with minimum time complexity

import java.util.Arrays;

public class AggressiveCows
{
    public static void main(String[] args)
    {
        int[] stalls = {1,5,1,2,8,4,9};
        int cows = 3;
        int result = aggressiveCows(stalls,cows);

        System.out.println(result);
    }

    //with brute force approach
    /*Time complexity is O((high-low)pow2 * N)*/

    //with binary search
    /*Time complexity = O(log(high-low) * N)*/ //where N is the length of the array
    static int aggressiveCows(int[] stalls, int k)
    {
        Arrays.sort(stalls);
        int low = 0;
        int high = stalls[stalls.length -1];
        int best = 0;
        int mid = 0;

        while(low<=high)
        {
            mid = low+(high-low)/2;

            int count = 1; int left = 0;

            for(int i =1; i<stalls.length && count<k;i++)
            {
                int gap = stalls[i] - stalls[left];
                if(gap >= mid)
                {
                    left = i;
                    count++;
                }
            }

            if(count>=k)
            {
                best = mid;
                low = mid+1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return best;
    }
}
