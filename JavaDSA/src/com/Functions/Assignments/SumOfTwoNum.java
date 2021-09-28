package com.Functions.Assignments;

import java.util.Scanner;

public class SumOfTwoNum
{
    static  int SumOfTwo(int a, int b)
    {
        return  a+b;
    }
    public static void main(String[] args)
    {
        System.out.println();
        System.out.printf("Enter two numbers to calculate its sum: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println();
        System.out.println("sum of two numbers "+a+" + "+b+" = "+SumOfTwo(a,b));
    }
}
