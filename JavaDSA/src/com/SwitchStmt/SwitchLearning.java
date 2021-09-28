package com.SwitchStmt;

import java.util.Locale;
import java.util.Scanner;

public class SwitchLearning
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next().trim().toLowerCase();
        switch (fruit)
        {
            case "orange":
                System.out.println("It is a round shaped fruit");
                break;
            case "apple":
                System.out.println("Sweet red fruit");
                break;
            case "banana":
                System.out.println("Long and yellow fruit");
                break;
            case "plum":
                System.out.println("based out of cherries");
                break;
            default:
                System.out.println("Not a valid fruit..!");
        }
    }
}
