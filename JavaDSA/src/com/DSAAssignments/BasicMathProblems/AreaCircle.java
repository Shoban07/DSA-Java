package com.DSAAssignments.BasicMathProblems;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.util.Scanner;

public class AreaCircle
{
    public static void main(String[] args) {
        double pi = 3.14;

        double area = 0;
        while (true)
        {
            System.out.println("Enter the radius");
            Scanner in = new Scanner(System.in);
            var radius = in.toString();
            try {
                if (Integer.parseInt(radius) > 0) {
                    int rad = Integer.parseInt(radius);
                    area = pi * (rad * rad);
                    System.out.println("Area of circle for radius: " + radius + " = " + area);
                    System.out.println("Enter 0 - Zero to exit...!!");
                } else {
                    break;
                }
            }
            catch (Exception ex)
            {
                System.out.println("Entered Value is not a radius");
            }
        }

    }
}
