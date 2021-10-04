package com.Functions.Assignments.FirstJavaAssign;

import java.util.Scanner;

public class AdditonOfNTerms
{
    public static void main(String[] args) {
        int num = 0;
        while (true)
        {
            System.out.println();
            System.out.println("Enter the numbers to add:");
            System.out.println("To print the result press 'x'");
            Scanner input = new Scanner(System.in);
            var in = input.next();
            if(!in.trim().equals("x"))
            {
                num += Integer.parseInt(in);
            }
            else {
                break;
            }
        }
        System.out.println("Sum of entered numbers : "+num);
    }
}
