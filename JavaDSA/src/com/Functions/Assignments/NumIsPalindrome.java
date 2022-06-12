package com.Functions.Assignments;

import java.util.Scanner;

public class NumIsPalindrome
{
    public boolean IsPalindrome(int n)
    {
        int num = n;
        int result = 0;
        while (num>0)
        {
            int rem = num%10;
            result=+(result*10)+rem;
            num/=10;
        }
        if (result==n)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Find given number is palindrome or not..?");
        System.out.println();
        System.out.print("Enter the number : ");
        int num = new Scanner(System.in).nextInt();
        NumIsPalindrome find = new NumIsPalindrome();
        boolean result = find.IsPalindrome(num);
        if (result)
            System.out.println(num +" is a palindrome");
        else
            System.out.println(num+ " is not a palindrome");
    }
}
