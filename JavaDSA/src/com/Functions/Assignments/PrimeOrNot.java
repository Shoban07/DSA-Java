package com.Functions.Assignments;

import java.util.Scanner;

public class PrimeOrNot
{
    static boolean PrimeOrNotPrime(int num)
    {
        if (num<=1)
            return  false;
        else
        //let's say if input was 11, then modulo of 11 % 2 = 1
        /*
        i = 3; 11 % 3 = 2;
        i = 4; 11 % 4 = 3;
        i = 5; 11 % 5 = 1;
        i = 6; 11 % 6 = 5;
        i = 7; 11 % 7 = 4;
        i = 8; 11 % 8 = 3;
        i = 9; 11 % 9 = 2;
        i = 10; 11 % 10 = 1;
        hence we have come up to checking of all the possible factors between 1 and 10,
        and we came to conclusion that only 1 and 11 makes the reminder for 11 as o.
        Hence, the property of prime was achieved
        * */
            for (int i =2;i<num;i++)
            {
                if (num%i==0)
                    return  false;
            }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Verify the given number was prime or not");
        System.out.println();
        System.out.println("Enter the number : ");
        int n = new Scanner(System.in).nextInt();
        //PrimeOrNot find = new PrimeOrNot();
        boolean result = PrimeOrNotPrime(n);
        System.out.println();
        if (result)
            System.out.println(n+ " is a prime number");
        else
            System.out.println(n+ " is not a prime number");

    }
}
