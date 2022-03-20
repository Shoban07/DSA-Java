package com.DSAPatternPrograms;

import java.util.Scanner;

/*
* Pattern 5:
*   *
*   **
*   ***
*   ****
*   *****
*   ****
*   ***
*   **
*   *
*/
public class Pattern5
{
    public static void main(String[] args)
    {
        int j = new Scanner(System.in).nextInt();

        for(int a = 1;a<=j;a++)
        {
            for(int b = 1; b<=a;b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int a = 1;a<=j;a++)
        {
            for(int b = j -a ; b>0;b--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
