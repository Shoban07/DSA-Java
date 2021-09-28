package com.Functions.Assignments;

import java.util.Scanner;

public class CircumferenceAndArea
{
    public double CalculateAreaCircumference(int choice, double radius)
    {
        double result = 0.0;
        double pi = 3.14;
        switch (choice)
        {
            case 1:
            {
                System.out.println();
                System.out.printf("Area of the circle with radius "+radius+ " :");
                result = pi*(radius*radius);
            }break;
            case 2:
            {
                System.out.println();
                System.out.printf("Circumference of the circle with radius "+radius+ " :");
                result = 2*pi*radius;
            }break;
            default:
                System.out.println("Invalid Choice");
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.printf("Circumference and Area Calculator : Shape-Circle");
        System.out.println();
        System.out.println("Enter your Choice: 1. Area 2.Circumference");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        System.out.println();
        System.out.printf("Now, Enter the radius: r- ");
        double radius = in.nextDouble();
        CircumferenceAndArea find = new CircumferenceAndArea();
        double result = find.CalculateAreaCircumference(choice,radius);
        System.out.println(result);
    }
}
