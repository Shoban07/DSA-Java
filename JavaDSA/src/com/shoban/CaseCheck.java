package com.shoban;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if(ch >= 'A' && ch <= 'Z')
        {
            System.out.println(ch + " Is in Upper Case");
        }
        else if(ch>='a' && ch<='z')
        {
            System.out.println(ch +" Is in lower case");
        }
        else
        {
            System.out.println(ch+ " Is not a alphabet");
        }
    }
}
