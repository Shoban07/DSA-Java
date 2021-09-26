package com.DSAAssignments.BasicMathProblems;

import java.util.Scanner;

public class AreaCalculator
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Area Calculator:");
        System.out.println("Choose the shape to calculate its area");
        String[] shapes = new String[]{"1. Circle","2. Triangle", "3. Rectangle", "4. Isosceles Triangle", "5. Parallelogram", "6. Rhombus", "7. Equilateral Triangle"};
        for (String shape:shapes)
        {
            System.out.println(shape);
        }
        System.out.println("Enter your Choice:");
        int choice = in.nextInt();
        double area = 0;
        switch (choice)
        {
            case 1:
            {
                System.out.println("Area of Circle:");
                System.out.println("Enter Radius:");
                double pi = 3.14;
                int radius = in.nextInt();
                area = pi*(radius*radius);
                System.out.println("Area of circle with radius: "+radius+ " = "+area);
            }
            break;
            case 2:
            {
                System.out.println("Area of Triangle:");
                System.out.println("Enter Base:");
                int base = in.nextInt();
                System.out.println("Enter Height:");
                int height = in.nextInt();
                area = (base*height)/2;
                System.out.println("Area of Triangle with base: "+base+" and height: "+height+ " = "+area);
            }break;
            case 3:
            {
                System.out.println("Area of Rectangle:");
                System.out.println("Enter Length:");
                int len = in.nextInt();
                System.out.println("Enter Breadth:");
                int breadth = in.nextInt();
                area = len*breadth;
                System.out.println("Area of Rectangle with Length: "+len+" and Breadth: "+breadth+ " = "+area);
            }break;
            case 4:
            {
                System.out.println("Area of Isosceles Triangle:");
                System.out.println("Enter Base:");
                int base = in.nextInt();
                System.out.println("Enter Height:");
                int height = in.nextInt();
                area = (base*height)/2;
                System.out.println("Area of Isosceles Triangle with base: "+base+" and height: "+height+ " = "+area);
            }break;
            case 5:
            {
                System.out.println("Area of Parallelogram:");
                System.out.println("Enter Length:");
                int len = in.nextInt();
                System.out.println("Enter Breadth:");
                int breadth = in.nextInt();
                area = len*breadth;
                System.out.println("Area of Parallelogram with Length: "+len+" and Breadth: "+breadth+ " = "+area);
            }break;
            case 6:
            {
                System.out.println("Area of Rhombus:");
                System.out.println("Enter Diagonal 1:");
                int d1 = in.nextInt();
                System.out.println("Enter Diagonal 2:");
                int d2 = in.nextInt();
                area = (d1*d2)/2;
                System.out.println("Area of Parallelogram with Diagonal 1: "+d1+" and Diagonal 2: "+d2+ " = "+area);
            }break;
            case 7:
            {
                System.out.println("Area of Equilateral Triangle:");
                System.out.println("Enter any Side's Value");
                int side = in.nextInt();
                //formulae (sqrt(3)/4)side*side
                area = (1.732/4)*(side*side);
                System.out.println("Area of Equilateral Triangle with Side: "+side+ " = "+area);
            }break;
            default:
                System.out.println("Invalid Input of Choice");
        }
    }
}
