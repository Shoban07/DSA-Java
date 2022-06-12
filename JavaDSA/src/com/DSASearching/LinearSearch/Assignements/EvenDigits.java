package com.DSASearching.LinearSearch.Assignements;

public class EvenDigits
{
    public static void main(String[] args)
    {
        //count the number of entities with even digits
        int[] ints = {01,12, 3, 67, 123, 5, 7, 1234,10,00};
        int count = 0;
//        for (int i: ints)
//        {
//            int j = String.valueOf(i).length();
//            if (j%2==0)
//            {
//                count++;
//            }
//        }
        for(int num: ints) {
            count += (int)Math.log10(num)&1;
        }
        System.out.println(count);
    }

}
