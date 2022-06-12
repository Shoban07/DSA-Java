package com.DSAarrays;

import java.util.Arrays;

public class PassingIntoFunctions
{
    //Basically Non Primitives are mutable
    public static void main(String[] args)
    {
        int a= 10; //integer is a primitive type and immutable
        int[] arr = {1,2,3,4,5}; // arrays are non-primitive type and are mutable
        System.out.println(a);//o/p -> 10
        System.out.println(Arrays.toString(arr)); //o/p -> [1,2,3,4,5]
        ChangeIndex(arr,a); //after modification of the object
        System.out.println(a); //o/p -> 10
        System.out.println(Arrays.toString(arr));//o/p -> [1,2,3,6,5]
    }
    static void ChangeIndex(int[] arr,int a)
    {
        a = 25;
        arr[3] = 6;
    }
}
