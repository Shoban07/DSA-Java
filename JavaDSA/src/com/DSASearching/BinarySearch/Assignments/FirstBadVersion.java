package com.DSASearching.BinarySearch.Assignments;
//Problem: First Bad Version
//Link : https://leetcode.com/problems/first-bad-version/
public class FirstBadVersion {
    public static void main(String[] args)
    {
        System.out.println(firstBadVersion(5));
    }
    public static int firstBadVersion2(int n)
    {
        int start = 1;
        int end = n;
        while(start<end)
        {
            int mid = start +(end-start)/2;
            
            if(isBadVersion(mid))
            end = mid;
            else
                start = mid+1;
        }
        return start;
    }
    public static int firstBadVersion(int n)
    {
        int fstBadVersion = Integer.MAX_VALUE;
        if(n==1) fstBadVersion = n;

        int start = 1;
        int end = n;
        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(isBadVersion(mid)==false)
            {
                start = mid+1;
            }
            else
            {
                end = mid -1;
                if(mid<fstBadVersion) fstBadVersion=mid;
            }
        }
        return fstBadVersion;

    }

    private static boolean isBadVersion(int mid)
    {
        int target = 4;
        return mid==target;
    }

}
