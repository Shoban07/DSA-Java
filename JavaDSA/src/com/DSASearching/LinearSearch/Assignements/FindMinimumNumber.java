package com.DSASearching.LinearSearch.Assignements;

public class FindMinimumNumber
{
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,78,-200};
        System.out.println(min(arr));
    }
    public static int min(int[] arr)
    {
        int minSofar = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]<minSofar)
            {
                minSofar = arr[i];
            }
        }
        return minSofar;
    }
}
