package com.DSASearching.LinearSearch.Assignements;
//Description: Find Numbers with Even Number of Digits
//Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits
{
    /*
    * Time complexity: O(n2) as nested loops present in the method 2
    * In Method 1: Time complexity: O(n) but we use built-in functions*/
    public static void main(String[] args)
    {
        //count the number of entities with even digits
        int[] ints = {01,12, 3, 67, 123, 5, 7, 1234,10,00};
        System.out.println(evenDigits(ints));
    }

    //method 1
    public int findNumbers(int[] nums) {
         int res = 0;
           for(int num: nums) {
               res += (int)(Math.log10(num))+1;
           }
           return res;
    }

    //method 2
    public static int evenDigits(int[] arr)
    {
        int evenDigitsCount = 0;
        if(arr.length == 0)
            return 0;

        for(int i = 0; i< arr.length;i++)
        {
            if(arr[i]<0)
            {
                arr[i] = arr[i]*-1;
            }
            int num = arr[i];
            int count = 0;
            while(num>0)
            {
                count++;
                num = num/10;
            }

            if(count%2==0)
            {
                evenDigitsCount++;
            }
        }

        return evenDigitsCount;
    }

}
