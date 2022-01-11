package com.DSASearching.LinearSearch;

public class SearchInRange
{
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,78,0};
        System.out.println(LinearSearch(arr,6,0,4));
    }
    public static int LinearSearch(int[] arr,int target, int start, int end)
    {
        if(arr.length==0)
            return -1;

        for(int index=start;index<=end;index++)
        {
            if (arr[index]==target)
                return index;
        }

        return -1;
    }
}
