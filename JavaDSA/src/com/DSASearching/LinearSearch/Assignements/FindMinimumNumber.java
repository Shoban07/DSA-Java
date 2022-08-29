package com.DSASearching.LinearSearch.Assignements;

public class FindMinimumNumber
{
    public static void main(String[] args) {
        int[] arr = {1,4,5,-50,78,-200};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    /*
    * Time Complexity : O(n) since have to traverse all the elements in the array
    * Space Complexity: O(1) no extra space is used*/
    public static int min(int[] arr)
    {
        if(arr.length == 0)
            return Integer.MAX_VALUE;

        int minIndex = 0;

        for(int i = 1; i<arr.length; i++)
        {
            if(arr[i] < arr[minIndex])
            {
                minIndex = i;
            }
        }

        return arr[minIndex];
    }

    public static int max(int[] arr)
    {
        if(arr.length == 0)
        {
            return Integer.MIN_VALUE;
        }

        int maxIndex = 0;

        for(int i = 1; i<arr.length; i++)
        {
            if(arr[i] > arr[maxIndex])
            {
                maxIndex = i;
            }
        }
        return arr[maxIndex];
    }
}
