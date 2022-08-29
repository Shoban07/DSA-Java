package com.DSAString.Assignments;

import java.util.ArrayList;
import java.util.List;

public class DeleteOperationForTwoString
{
    public static void main(String[] args)
    {
        String word1 = "leetcode";
        String word2 = "etco";
        System.out.println(minDistance2(word1,word2));
    }

    public static int minDistance2(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 0; i <= word1.length(); i++) {
            for (int j = 0; j <= word2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = 1 + Math.min(dp[i][j - 1], dp[i - 1][j]);
                    }
                }
            }
        }


        return dp[word1.length()][word2.length()];
    }

    public static int minDistance(String word1, String word2)
    {
        int distance = 0;
        int result = 0;
        List<Character> countedChar = new ArrayList<Character>();
        char[] wordArray1 = word1.toCharArray();

        for(char ch : wordArray1)
        {
            if(word2.indexOf(ch) != -1)
            {
                if(!countedChar.contains(ch)) {
                    countedChar.add(ch);
                    distance++;
                }
            }
        }
        result = (word1.length()-distance) + (word2.length()-distance);
        return result;
    }
}
