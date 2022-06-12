package com.Functions.Assignments;

import java.util.Scanner;

public class FactorialOfNumber
{
    public void FactorialNum(int num)
    {
        int result = 1;
        int n = num;
        if (num==0)
        {
            System.out.println("Factorial of given number "+num+"! : "+result);
        }
        else
        {
            for (int i = n; n>=1;n--)
            {
                result *=n;
            }
            System.out.println("Factorial of given number "+num+"! : "+result);
        }
    }
    public int RecursionFactorial(int num)
    {
        if (num==0)
            return 1;
        else
        return (num * RecursionFactorial(num-1));

    }
    public static void main(String[] args) {
        FactorialOfNumber find = new FactorialOfNumber();
        System.out.println();
        System.out.println("Factorial Finder...!");
        System.out.println();
        System.out.printf("Enter the number : ");
        int num = new Scanner(System.in).nextInt();
        System.out.println();
        find.FactorialNum(num);
        int result = find.RecursionFactorial(num);
        System.out.println();
        System.out.println("Factorial of given number using recursion "+num+"! : "+result);
    }
}
