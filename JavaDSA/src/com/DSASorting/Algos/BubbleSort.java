package com.DSASorting.Algos;

import java.util.Arrays;
//Notes:

//Bubble Sort was also known as Sinking sort, Exchange Sort
/*
* In Sorting there were two methods of grouping Stable vs Unstable sorting.
* If sorting followed the hierarchy of first come first place, then it i stable
* If sorting was not based on place of the element or its hierarchy but based on the values alone. Then it is unstable sorting
*E.g: Sorting of red and black balls with same values on each of them
*
* Complexity
* Space: O(1) -> which means no extra space is required. No new arrays needs to be created. This kind of sorting is also called
* -> In-Space Sorting Algorithms -> It will not use extra space
* Time: Best Case: O(N)
*       Worst Case: O(N2) :>N square*/

public class BubbleSort
{
    public static void main(String[] args) {
        int[] arr = {0,1,-9,200,-450};
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSorting(int[] arr)
    {
        //Flag counter for making sure if there is any comparison
        boolean flag = false;
        //Passes
        for(int i = 0;i<arr.length;i++)
        {
            //Comparisons
            for(int j = 1; j<arr.length-i;j++) // to avoid the sorted elements comparison we are neglecting them based on the passes count
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                    flag = true;
                }
            }
            if(!flag)
            {
                break;
            }
        }
    }
}
