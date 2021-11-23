package com.DSAarrays;

import java.util.Arrays;

public class ArraysSampleTask
{
    public static void main(String[] args) {
        //Region
        //swapping of values in array
            int[] arr = {1,5,4,3,6};
//            if(swap(arr,0,3))
//            {System.out.println("After swap: "+Arrays.toString(arr));}

        // finding maximum element of an array
//        System.out.println(Arrays.toString(arr));
//        System.out.println(max(arr));

        // finding maximum element of an array between given range
//        System.out.println(Arrays.toString(arr));
//        System.out.println(MaxInRange(arr,2,4));

        // reversing an array
//

        // reversing array between range
        System.out.println("Before Reversing: "+Arrays.toString(arr));
        ReverseArrayInRegion(arr,0,3);
        System.out.println("After Reversing: "+Arrays.toString(arr));
        //Endregion
    }
    //function to swap values in array
    static boolean swap(int[] arr,int index1, int index2)
    {
        boolean bool = false;
        if((index1 <0)||(index2>arr.length-1)){
            System.out.println("Swapping index are under out of bounds");
        }
        else{
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        bool = true;}
        return bool;
    }
    //maximum element of an array
    static int max(int[] arr)
    {
        int maxFar = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if (maxFar<arr[i])
            {
                maxFar = arr[i];
            }
        }
        return maxFar;
    }

    //finding maximum element in an array within given range
    static int MaxInRange(int[] arr, int start, int end)
    {
        int maxSoFar = arr[start];
        for(int i = start;i<=end;i++)
        {
            if(arr[i]>maxSoFar)
            {
                maxSoFar = arr[i];
            }
        }
        return maxSoFar;
    }

    //function to reverse an array using two pointer method
    static void ReverseArray(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    //function to reverse elements in an array within given range
    static void ReverseArrayInRegion(int arr[],int startPoint, int endPoint)
    {
        int start = startPoint;
        int end = endPoint;
        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
