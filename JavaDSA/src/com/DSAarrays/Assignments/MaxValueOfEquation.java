package com.DSAarrays.Assignments;

//Description: Max Value of Equation
//Link: https://leetcode.com/problems/max-value-of-equation/

public class MaxValueOfEquation
{
    public static void main(String[] args)
    {
        int k =3;
        //int[][] points = {{1,3},{2,0},{5,10},{6,-10}};
        int[][] points = {{0,0},{3,0},{9,2}};
        System.out.println(findMaxValueOfEquation2(points,k));
    }
    public static int findMaxValueOfEquation(int[][] points, int k)
    {
        int maxSoFar = Integer.MIN_VALUE;

        //two pointers
        int pointer1 = 0;

        for(int i = pointer1;i<points.length-1;i++)
        {
            for(int j = i+1;j<points.length;j++)
            {
                int[] nums1 = points[i];
                int[] nums2 = points[j];

                int conditionValue = Math.abs(nums1[0] - nums2[0]);
                int max = 0;
                if(conditionValue <= k)
                {
                    max = nums1[1]+nums2[1]+conditionValue;
                    maxSoFar = max>maxSoFar ? max : maxSoFar;
                }
            }
        }
        return maxSoFar;
    }
    public static int findMaxValueOfEquation2(int[][] points, int k) {
        int max = Integer.MIN_VALUE;
        int ans = 0;
        int mod = 0;
        int flag = 1;
        for(int i = 0;i<points.length-1;i++)
        {
            if(flag<i+1)
                flag = i+1;

            for(int j = flag;j<points.length;j++)
            {
                mod = points[i][0]-points[j][0];
                if(mod<0)
                    mod = -mod;
                if(mod>k)
                    break; // x coordinate are sorted
                ans = points[i][1]+points[j][1]+mod;
                if(max<ans)
                {
                    max = ans;
                    flag = j-1;
                }
            }
        }
        return max;
    }
}
