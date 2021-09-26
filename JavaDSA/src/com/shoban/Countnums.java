package com.shoban;

import java.util.Scanner;

public class Countnums
{
    public static void main(String[] args) {

        int n = (new Scanner(System.in)).nextInt();

        int count = 0;
        while (n>0)
        {
            int rem = n%10;
            if (rem == 5)
            {
                count++;
            }
            n/=10;
        }
        System.out.println(count + " is the number of occurrences in the given input");
    }
}
