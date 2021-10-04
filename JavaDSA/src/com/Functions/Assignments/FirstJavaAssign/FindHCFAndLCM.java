package com.Functions.Assignments.FirstJavaAssign;

import java.util.Scanner;

public class FindHCFAndLCM
{
    public static void getCalculateHcfAndLcm(int num1, int num2)
    {
     int hcf = 0 ; int lcm = 0;
     int temp = 0; int temp1 = 0;int temp2 = 0;
     temp1 = num1;
     temp2 = num2;
     //divide until the reminder becomes zero
     while(temp2!=0)
     {
         temp = temp2;
         temp2 = temp1%temp2;
         temp1 = temp;
     }

     //when the above loop ends hcf will be temp 1 and lcm will be (num1*num2)/hcf
        hcf = temp1;
        lcm = (num1*num2)/hcf;

        System.out.printf("HCF of %d and %d = %d",num1,num2,hcf);
        System.out.println();
        System.out.printf("LCM of %d and %d = %d",num1,num2,lcm);

    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("To Find HCF and LCM of the given 2 numbers :");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        getCalculateHcfAndLcm(num1, num2);
    }


}
