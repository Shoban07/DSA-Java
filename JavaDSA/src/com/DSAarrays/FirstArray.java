package com.DSAarrays;

import java.util.Scanner;

public class FirstArray
{
    public static void main(String[] args) {

        int[] arr = {10,20,30,40};
        arr[1] =10;
        float[] fl = new float[5];
        String[] str = new String[5];
        Long[] lng = new Long[4];
        System.out.println();
        System.out.printf("Enter the index of the array: ");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        System.out.println("Element at index "+index+ " in given array : "+arr[index]);
        System.out.println(fl[4]+" "+str[2]+" "+ lng[2]);

    }
}
