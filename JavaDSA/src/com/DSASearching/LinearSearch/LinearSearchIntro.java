package com.DSASearching.LinearSearch;

import java.util.Scanner;

public class LinearSearchIntro
{
    public static void main(String[] args)
    {
        int[] array = {2,4,932,17,912,9,10};
        LinearSearchIntro ls = new LinearSearchIntro();
        System.out.println("Find index of item 10: "+ls.linearSearch(array,10));
        System.out.println("Find the element in index 4: "+ls.linearSearchElement(array,4));
        System.out.println("Check whether element 11 is present or not: "+ ls.linearSearchContainsElement(array,11));
    }
    //returns the index
    public int linearSearch(int[] array, int item)
    {
        if(array.length == 0)
        {
            return -1;
        }

        for(int i = 0; i<array.length; i++)
        {
            if(array[i] == item)
            {
                return i;
            }
        }
        return -1;
    }

    //returns element itself
    public int linearSearchElement(int[] array, int index)
    {
        if(array.length == 0)
        {
            return Integer.MAX_VALUE;
        }

        for(int i = 0; i<array.length;i++)
        {
            if(i == index)
                return array[i];
        }

        return Integer.MAX_VALUE;
    }

    //returns true if element present and vice versa
    public boolean linearSearchContainsElement(int[] array, int item)
    {
        if(array.length == 0)
        {
            return false;
        }

        for(int i = 0; i<array.length; i++)
        {
            if(array[i] == item)
                return true;
        }
        return false;
    }

}
