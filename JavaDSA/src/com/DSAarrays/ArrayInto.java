package com.DSAarrays;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayInto
{
    public static void main(String[] args) {
        Scanner strScan = new Scanner(System.in);
//        //region Sample code application
//        System.out.println("Introduction to Arrays...");
//        System.out.println("1. Introduction");
//        System.out.println("2. Why we need to use Arrays");
//        System.out.println("3. Where we need to use Arrays");
//        System.out.println("4. Types");
//        System.out.println("5. Alternatives Instead of Arrays");
//        int choice = (new Scanner(System.in)).nextInt();
//        switch (choice)
//        {
//            case 1: {
//                System.out.println("Introduction");
//                System.out.println(" (*) An Array is a Data structure used to keep data in linear structure");
//                System.out.println(" (*) An Array stores data as continuous memory allocation, It means they are stores in a continuous blocks. But heap objects are not continuous");
//                System.out.println(" (*) In Java heap objects are not continuous, Hence Array objects stored in heaps may or may not be continuous. It depends on JVM");
//                System.out.println(" (*) Arrays can consist of set of sorted data as well as set of unsorted data\n" +
//                        "Syntax: 'Datatype'[] variablename = new 'Datatype'[sizemention]; \n" +
//                        "eg: int[] myArr; -> Declaration of Array, Happens at compile time i.e, when we type this\n" +
//                        "     myArr = new int[5]; -> Allocates memory space, It basically creates object in the heap memory, Happens when program runs");
//                System.out.println(" (*) Based on their holding of capacity, Arrays can be concluded into two types: \n " +
//                        "1. Static Arrays - Have a static size of capacity which is decided when getting initialized \n" +
//                        "2. Dynamic Arrays - Have their size getting expanded as the number of components gets increased \n");
//            }
//            break;
//            case 2:
//            {
//                System.out.println("2. Why Arrays ..?");
//                System.out.println(" (*) Arrays are helpful when there is need for collection of data of same data type");
//                System.out.println(" (*) Eg: Lets say Natural Numbers. It is a collection of numbers, Which in turn comes under Datatype 'Integers' \n" +
//                        "-> If we need natural numbers, Instead of saving each natural number each in a single separate variables\n" +
//                        "-> we can create an Array of type Integer and store the values\n" +
//                        "-> All the data type of an array should be same");
//            }
//            break;
//             default:
//             {System.out.println("Invalid Selection");}
//
//        }
//        //endregion
// region Introduction
   // region Primitive Type
        //declaration
        int[] arr;

        //initialization
        //arr = new int[5];
        //arr = new int[]{12, 45, 6, 2, 9};
        //System.out.println(arr[3]); Printing output based on indexes

        //Take input for the array
        arr = new int[5];
        Scanner in = new Scanner(System.in);
        //taking input one by one using for loop
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = in.nextInt();
        }

        //using same for loop we can print the values
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.println(); //shifting to next line

        //we can also use optimized for loop which is foreach loop in java
        //instead of index traversing, here we traverse through elements and print their values
        for(int num : arr)
        {
            System.out.print(num+", ");
        }
        System.out.println();

        //Another way is to use, Arrays data type available in Java
        //in this way array was constructed out as string, To string method available in Arrays class does this
        System.out.println(Arrays.toString(arr));
        //endregion
   //region Non-Primitive / Object type
        String[] str = new String[5];
        //using for loop taking input and printing output
        for(int i=0;i<str.length;i++)
        {
            str[i] = strScan.next();
        }

        for(int i = 0;i<str.length;i++)
        {
            System.out.print(str[i]+", ");
        }
        System.out.println();
        //using for each loop to print values
        for (String val:str) {
            System.out.print(val+", ");
        }
        System.out.println();
        //using Arrays.ToString to print values
        System.out.print(Arrays.toString(str));
   //endregion
        //endregion
    }
}
