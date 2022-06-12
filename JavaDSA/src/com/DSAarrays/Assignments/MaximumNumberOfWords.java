package com.DSAarrays.Assignments;

//Decription: Maximum Number of Words Found in Sentences
//Link: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

public class MaximumNumberOfWords
{
    public static void main(String[] args) {
        String[] inout = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(inout));
    }
    public static int mostWordsFound(String[] sentences)
    {
        int wordsCount = 0;

        for (String sentence: sentences)
        {
            int count = 1;
            for (char character: sentence.toCharArray())
            {
                if(character == ' ')
                {
                    count++;
                }
            }
            if(count>wordsCount) {
                wordsCount = count;
            }
        }
        return wordsCount;
    }
}
