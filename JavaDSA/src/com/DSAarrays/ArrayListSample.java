package com.DSAarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListSample
{
    public static void main(String[] args) {
        int initialCap = 5;
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>(initialCap);
        //System.out.println(intList.size());
        for(int i=0;i<initialCap;i++)
        {
            intList.add(in.nextInt());
        }
        for(int i=0;i<initialCap;i++)
        {
            System.out.print(intList.get(i)+", ");
        }
        System.out.println();
        for (int num: intList)
        {
            System.out.print(num+",");
        }
        System.out.println();
        System.out.println(intList);
    }
}
