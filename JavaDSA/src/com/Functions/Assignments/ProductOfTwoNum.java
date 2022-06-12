package com.Functions.Assignments;

import java.util.Scanner;

public class ProductOfTwoNum
{
    static  int ProductOfTwo(int a, int b)
    {
        return  a*b;
    }
    public static void main(String[] args)
    {
        System.out.println();
        System.out.printf("Enter two numbers to calculate its Product: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println();
        System.out.println("Product of two numbers "+a+" x "+b+" = "+ProductOfTwo(a,b));
    }
}
