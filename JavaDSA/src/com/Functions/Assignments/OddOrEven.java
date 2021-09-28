package com.Functions.Assignments;

import java.util.Scanner;

public class OddOrEven
{
    public boolean OddEven(int a)
    {
        return a % 2 == 0;
    }
    public static void main(String[] args)
    {
        OddOrEven find = new OddOrEven();
        System.out.println();
        System.out.println("Program to define a number is odd or even");
        System.out.println();
        System.out.print("Enter the number to check:");
        int num = new Scanner(System.in).nextInt();
        System.out.println();
        boolean res = find.OddEven(num);
        if (res)
            System.out.println(num+ " is an even number");
        else
            System.out.println(num+ " is an odd number");
    }
}
