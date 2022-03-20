package com.DSAPatternPrograms;

import java.util.Scanner;

/*
* Pattern 7:
*   *****
*    ****
*     ***
*      **
*       *
*/
public class Pattern7
{
    public static void main(String[] args) {
        int k = new Scanner(System.in).nextInt();
        for(int i = 1;i<=k;i++)
        {
            for(int j = k;j>0;j--)
            {
                int l = k-i+1;
                if(l>=j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
