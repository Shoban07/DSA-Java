package com.DSAarrays.Assignments;

import java.util.Arrays;
//Difficulty : Easy 10. Check if the Sentence Is Pangram
//reference link : https://leetcode.com/problems/check-if-the-sentence-is-pangram/

/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

Example 2:

Input: sentence = "leetcode"
Output: false
* */

public class PangramString {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        //System.out.println(IsPangram(str));
        System.out.println(CheckIsPangram(str));
        System.out.println(IsPangramCheck(str));
//    char[] str = "thequickbrownfoxjumpsoverthelazydog".toCharArray();
//        System.out.println("b-a = "+('b'-'a'));
//        System.out.println(Arrays.toString(str));

    }
    //region
    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;
        boolean[] map = new boolean[26];
        for (char a: sentence.toCharArray()) map[a - 'a'] = true;
        for(boolean i : map) if (!i) return false;
        return true;
    }
    public static boolean IsPangram(String sentence)
    {
        boolean isPangram = false;
        boolean[] map = new boolean[26];
        if(!(sentence.length()<26))
        {
            for(char a : sentence.toCharArray())
            {
                map[a-'a']=true;
            }
            for(boolean i : map)
            {
                if(i){
                    isPangram = true;
                }
                else
                {
                    isPangram = false;
                }
            }
        }
        return isPangram;
    }
    //endregion

    // Time complexity o(n+26) = O(n) // Most effective way with 39.7 mb space occ
    public static boolean CheckIsPangram(String sentence)
    {
        for(int i =0;i<26;i++)
        {
            char ch = (char)(97+i);
            String s = new String(String.valueOf(ch));
            if(!sentence.contains(s)){return false;}
        }
        return true;
    }
// Time complexity 2(n+26) = O(n+26) = O(n)
    public static boolean IsPangramCheck(String sentence)
    {
        int[] num = new int[26];
        for(char ch : sentence.toCharArray())
        {
            num[ch-'a'] = 1;
        }
        for (int n: num) {
            if(n==0) return false;
        }
        return true;
    }

    //Another effective way the most with oms Time complexity and 39 mb space
    public static boolean PangramCheck(String sentence)
    {
        if(sentence.length()<26) return false;
        for(char ch = 'a'; ch<='z';ch++)
        {
            if (sentence.indexOf(ch)==-1) return false;
        }
        return true;
    }
}
