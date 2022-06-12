package com.DSAPatternPrograms;

import java.util.Scanner;

/*
* Pattern 4:
*   1
*   1 2
*   1 2 3
*   1 2 3 4
*   1 2 3 4 5
*/
public class Pattern4
{
    public static void main(String[] args) {
        int j = new Scanner(System.in).nextInt();
        for(int i = 1;i<=j;i++)
        {
            for(int k = 1;k<=i;k++)
            {
                System.out.printf("%d ",k);
            }
            System.out.println();
        }
    }
}
