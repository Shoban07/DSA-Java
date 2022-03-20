package com.DSAPatternPrograms;

import java.util.Scanner;

/*
* Pattern 3:
*   *****
*   ****
*   ***
*   **
*   *
**/
public class Pattern3
{
    public static void main(String[] args)
    {
        int c = new Scanner(System.in).nextInt();

        for(int a=1;a<=c;a++)
        {
            for(int b = c-a+1;b>0;b--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
