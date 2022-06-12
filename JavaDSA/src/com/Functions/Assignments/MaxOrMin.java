package com.Functions.Assignments;

import java.util.Scanner;

public class MaxOrMin
{
    public int Maximum(int a, int b, int c, int choice)
    {
        int result = 0;
        switch (choice)
        {
            case 1:
            {
                System.out.println("Maximum of three numbers "+ a+", "+b+", "+c);
                result =  Math.max(c,Math.max(a,b));
            }break;
            case 2:
            {
                System.out.println("Minimum of three numbers "+ a+", "+b+", "+c);
                result =  Math.min(c,Math.min(a,b));
            }break;
            default:
                System.out.println("Invalid Selection..!");
        }
                Math.max(c,Math.max(a,b));
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println("Maximum vs Minimum Number Finder");
        System.out.println();
        System.out.printf("Enter the three number you want to compare: ");
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println();
        System.out.println("Enter your Choice 1. To Find Maximum 2. To Find Minimum");
        int choice = in.nextInt();
        MaxOrMin find = new MaxOrMin();
        int result = find.Maximum(a,b,c,choice);
        System.out.println(result);
    }
}
