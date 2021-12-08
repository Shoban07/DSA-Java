package com.DSASearching.LinearSearch;

import java.util.Scanner;

public class LinearSearchIntro
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] arr = {13,67, 89 ,92, 46, 0};
        int target = input.nextInt();
        int ans = LinearSearch1(arr,target);
        int ans2 = LinearSearch2(arr,target);
        boolean ans3 = LinearSearch3(arr,target);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }
    //returns the index
    public static int LinearSearch1(int[] arr, int target)
    {
        if(arr.length==0)
        {
            return  -1;
        }
        for(int index = 0;index<arr.length;index++)
        {
            if(arr[index]==target)
            {
                return index;
            }
        }
        //if element not found
        return -1;
    }
    //returns the element
    public static int LinearSearch2(int[] arr, int target)
    {
        if(arr.length==0)
        {
            return  -1;
        }
        for(int index = 0;index<arr.length;index++)
        {
            if(arr[index]==target)
            {
                return arr[index];
            }
        }
        //if element not found
        return Integer.MAX_VALUE;
    }
    public static boolean LinearSearch3(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return false;
        }
        for(int index = 0;index<arr.length;index++)
        {
            if(arr[index]==target)
            {
                return true;
            }
        }
        //if element not found
        return false;
    }
}
