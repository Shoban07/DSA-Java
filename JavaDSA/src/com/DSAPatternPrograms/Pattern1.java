package com.DSAPatternPrograms;

import java.util.Scanner;

/**
 * Pattern: 1
 *  *****
 *  *****
 *  *****
 *  *****
 */


public class Pattern1
{
    public static void main(String[] args) {
        int j = new Scanner(System.in).nextInt();
            for(int i = 1;i<=j;i++)
            {
                for(int k = 1;k<=j;k++)
                {System.out.print("*");}
                System.out.println();
            }
    }
}
