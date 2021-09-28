package com.Functions.Assignments;

import java.util.Scanner;

public class EligibleToVote
{
    static boolean EligibleOrNot(int age)
    {
        return age>=18;
    }
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Major or not Checked for Voting Eligibility");
        System.out.println();
        System.out.printf("Please enter your age here: ");
        int age = new Scanner(System.in).nextInt();
        System.out.println();
        boolean result = EligibleOrNot(age);
        if (result)
            System.out.println("Eligible to Vote..!");
        else
            System.out.println("Not Eligible..!");
    }
}
