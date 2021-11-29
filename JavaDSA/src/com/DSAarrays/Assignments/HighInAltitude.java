package com.DSAarrays.Assignments;
//region Problem Description
/*
*Difficulty : Easy 12. Find the Highest Altitude.
//reference link : https://leetcode.com/problems/find-the-highest-altitude/
*
* YThere is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

*/
//endregion

public class HighInAltitude
{
    public static void main(String[] args) {
        int[] altitudeGain = {-4,-3,-2,-1,4,3,2};
        System.out.printf("Highest Point Reached: %d",HighestPoint(altitudeGain));
    }

    public static int HighestPoint(int[] gain)
    {
        //Overall Highest Altitude Reached
        int maxSoFar = 0;
        // highest altitude reached from point a to b
        int highAltitude = 0;
        // current altitude
        int currentAltitude = 0;
        for(int i =0;i<gain.length;i++)
        {
            currentAltitude = highAltitude + gain[i];
            highAltitude = currentAltitude; // considering the current altitude as the highest to compare with maximum altitude
            if(highAltitude>maxSoFar)
            {
                maxSoFar = highAltitude; //if the present reached alt was the highest of all then that is the highest point reached
            }
        }
        return maxSoFar;
    }
}
