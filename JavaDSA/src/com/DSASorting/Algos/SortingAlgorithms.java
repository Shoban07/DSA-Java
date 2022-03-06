package com.DSASorting.Algos;

import java.util.Arrays;

public class SortingAlgorithms
{
    public static void main(String[] args) {
        int[] arr = {-100, 0 ,2323,4349394, 901, -1010010};
        //cyclic sort works for linear number of elements.
        System.out.println(Arrays.toString(cyclicSort(new int[]{3,4,2,5,1})) + " Cyclic Sort");
        if(arr.length>1) {
            BubbleSort(arr);
            System.out.println(Arrays.toString(arr) + " Bubble Sort");
            SelectionSort(arr);
            System.out.println(Arrays.toString(arr) + " Selection Sort");
            InsertionSort(arr);
            System.out.println(Arrays.toString(arr) + " Insertion Sort");
        }
        else
        {
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void BubbleSort(int[] arr)
    {
        for (int i = 0; i<arr.length;i++)
        {
            boolean flag = false;
            for(int j = 0;j<arr.length-i-1;j++) // [j<arr.length-i-1]=> to reduce the loop, we are neglecting the pass count. As each pass will place an item in its sorted position
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);
                    flag =true;
                }
            }
            if(!flag)
            {
                break;
            }
        }
    }
    public static void SelectionSort(int[] arr)
    {
        for(int i = 0;i< arr.length;i++)
        {
            int lastIndex = arr.length-i-1;
            int maxElementIndex = getMaxElementIndex(arr,0,lastIndex);
            swap(arr,lastIndex,maxElementIndex);
        }
    }

    private static int getMaxElementIndex(int[] arr, int start, int lastIndex)
    {
        int maxIndex = start;
        for(int i = start;i<=lastIndex;i++)
        {
            if(arr[maxIndex]<arr[i])
            {
                maxIndex = i;
            }
        }
        return  maxIndex;
    }

    public static void InsertionSort(int[] arr)
    {
        for(int i = 0; i<arr.length-1;i++)
        {
            for(int j = i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else
                {
                    break;
                }
            }
        }
    }
    public static int[] cyclicSort(int[] arr)
    {
        int i = 0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[correct]!=arr[i])
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        return  arr;
    }
    public static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
