package com.DSAPatternPrograms;

import java.util.Scanner;

/*
* Pattern 6:
*       *
*      **
*     ***
*    ****
*   *****
*/
public class Pattern6
{
    public static void main(String[] args) {
        int k = new Scanner(System.in).nextInt();

        for(int i = 1;i<=k;i++)
        {
            for(int j = 1;j<=k;j++)
            {
                int  l = k-i;
                if(j>l) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
