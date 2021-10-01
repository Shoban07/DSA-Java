package com.Functions.Assignments.FirstJavaAssign;

import java.util.Scanner;

public class ComposeMultiplicationTable
{
    public static void composeTables(int num)
    {
        System.out.println();
        System.out.println(num+"th Table");
        for (int i = 1 ; i <= 15 ; i++) {
            int n = num*i;
            System.out.println(num+" x "+i+" = "+n);
        }
    }
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Multiplication Tables Printer");
        System.out.println();
        System.out.printf("Enter the number you want to print tables : ");
        int n = new Scanner(System.in).nextInt();
        composeTables(n);
    }
}
