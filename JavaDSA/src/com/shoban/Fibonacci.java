package com.shoban;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        int n = in.nextInt();

        int a = 0; int b =1;
//        int count = 2;
        System.out.println(a);
        for (int count = 1; count <= n; count++)
        {
         int temp = b;
         b=a+temp;
         a=temp;
            System.out.println(b);
        }
        System.out.println(n+"th fibonacci number is " +b);
    }
}
