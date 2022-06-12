package com.DSAAssignments.BasicMathProblems;

import java.util.Scanner;

public class PerimeterCalculator
{
    public static void main(String[] args) {
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("Perimeter Calculator:");
        System.out.println("Choose the shape to calculate its Perimeter");
        String[] shapes = new String[]{"1. Circle","2. Square", "3. Rectangle",  "4. Parallelogram", "5. Rhombus", "6. Equilateral Triangle"};
        for (String shape:shapes)
        {
            System.out.println(shape);
        }
        System.out.println("Enter your Choice:");
        int choice = in.nextInt();
        double perimeter = 0;
        switch (choice)
        {
            case 1:
            {
                System.out.println("Perimeter of Circle:");
                System.out.println("Enter Radius:");
                double pi = 3.14;
                int radius = in.nextInt();
                perimeter = 2*pi*radius;
                System.out.println("Perimeter of circle with radius: "+radius+ " = "+perimeter);
            }
            break;
            case 2:
            {
                System.out.println("Perimeter of Square:");
                System.out.println("Enter Side:");
                int side = in.nextInt();
                perimeter = 4*side;
                System.out.println("Perimeter of Square with Side: "+side+ " = "+perimeter);
            }break;
            case 3:
            {
                System.out.println("Perimeter of Rectangle:");
                System.out.println("Enter Length:");
                int len = in.nextInt();
                System.out.println("Enter Breadth:");
                int breadth = in.nextInt();
                perimeter = 2*(len+breadth);
                System.out.println("Perimeter of Rectangle with Length: "+len+" and Breadth: "+breadth+ " = "+perimeter);
            }break;
            case 4:
            {
                System.out.println("Perimeter of Parallelogram:");
                System.out.println("Enter Base:");
                int base = in.nextInt();
                System.out.println("Enter Side:");
                int side = in.nextInt();
                perimeter = 2*(base+side);
                System.out.println("Perimeter of Parallelogram with base: "+base+" and side: "+side+ " = "+perimeter);
            }break;
            case 5:
            {
                System.out.println("Perimeter of Rhombus:");
                System.out.println("Enter Side:");
                int side = in.nextInt();
                perimeter = 4*side;
                System.out.println("Perimeter of Parallelogram with side: "+side+ " = "+perimeter);
            }break;
            case 6:
            {
                System.out.println("Perimeter of Equilateral Triangle:");
                System.out.println("Enter any Side's Value");
                int side = in.nextInt();
                //formulae 3*(side)
                perimeter = 3*(side);
                System.out.println("Perimeter of Equilateral Triangle with Side: "+side+ " = "+perimeter);
            }break;
            default:
                System.out.println("Invalid Input of Choice");
        }
    }
}
