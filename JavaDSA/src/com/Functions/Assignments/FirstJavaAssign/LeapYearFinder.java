package com.Functions.Assignments.FirstJavaAssign;

import java.util.Scanner;

public class LeapYearFinder
{
    public static void LeapYearOrNot(int year)
    {
        System.out.println();
        if (year%4==0 && year%100!=0 || year%400==0)
            System.out.printf(year+" is a Leap Year..!");
        else
            System.out.printf(year+" is not a Leap Year..!");
    }
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Leap Year Finder");
        System.out.println();
        System.out.printf("Enter the Year:");
        int year = new Scanner(System.in).nextInt();
        LeapYearOrNot(year);
    }
}
