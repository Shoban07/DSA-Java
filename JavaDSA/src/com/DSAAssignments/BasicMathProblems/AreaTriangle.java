package com.DSAAssignments.BasicMathProblems;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        System.out.println("Area Calculator");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base value");
        int base = in.nextInt();
        System.out.println("Enter the height value");
        int height = in.nextInt();

        int area = 0;

        if (base!=0&&height!=0)
        {
            area = (base*height)/2;
        }
        else
        {
            System.out.println("Check the input values of base and height");
        }

        System.out.println(area);
    }
}
