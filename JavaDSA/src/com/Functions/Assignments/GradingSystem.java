package com.Functions.Assignments;

import java.util.Scanner;

public class GradingSystem
{
    public void GradeForStudent(int marks)
    {
        if (marks>=91 && marks<=100)
        {
            System.out.println("Student has acquired Grade: AA");
        }
        else if (marks>=81 && marks<=90)
        {
            System.out.println("Student has acquired Grade: AB");
        }
        else if (marks>=71 && marks<=80)
        {
            System.out.println("Student has acquired Grade: BB");
        }
        else if (marks>=61 && marks<=70)
        {
            System.out.println("Student has acquired Grade: BC");
        }
        else if (marks>=51 && marks<=60)
        {
            System.out.println("Student has acquired Grade: CD");
        }
        else if (marks>=41 && marks<=50)
        {
            System.out.println("Student has acquired Grade: DD");
        }
        else if(marks<=40 && marks>-1){
            System.out.println("Perform well next time., Grade: Fail");
        }
        else
        {
            System.out.println("Enter the marks in correct format");
        }
    }
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Grade Calculator...!");
        System.out.println();
        System.out.printf("Enter the marks that you have score : ");
        int mark = new Scanner(System.in).nextInt();
        GradingSystem find = new GradingSystem();
        System.out.println();
        find.GradeForStudent(mark);
    }
}
