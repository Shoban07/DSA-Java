package com.shoban;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args)
    {
        Scanner ina = new Scanner(System.in);
//        Scanner inb = new Scanner(System.in);
//        Scanner inc = new Scanner(System.in);

        int a = ina.nextInt();
        int b = ina.nextInt();
        int c = ina.nextInt();

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max + " is the largest of Three Numbers");

    }
}
