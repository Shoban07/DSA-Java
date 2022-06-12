package com.DSAString;

public class Palindrome
{
    public static void main(String[] args) {
        String s = null;
        System.out.println(IsPalindromeOrNot(s));
    }

    private static boolean IsPalindromeOrNot(String s) {

        if(s==null||s.length()==0)
            return true;

        char[] input = s.toCharArray();

        int start = 0;
        int end = input.length-1;

        while(start<=end)
        {
            if(input[start] == input[end])
            {
                start++;end--;
            }
            else
            {
                return false;
            }
        }
        return true;

    }
}
