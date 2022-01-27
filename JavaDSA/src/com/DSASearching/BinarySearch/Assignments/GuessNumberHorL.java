package com.DSASearching.BinarySearch.Assignments;

//Problem: Guess Number Higher or Lower
//Link: https://leetcode.com/problems/guess-number-higher-or-lower/
public class GuessNumberHorL
{
    /**
     * Forward declaration of guess API.
     * @param  @num   your guess
     * @return 	     -1 if num is lower than the guess number
     *			      1 if num is higher than the guess number
     *               otherwise return 0
     * int guess(int num);
     */
    public static void main(String[] args) {

    }
    public static int guess(int mid)
    {
        return 0;
    }
    public static int guessNumber(int n)
    {
        int start = 0;
        int end = n;

        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(guess(mid)==0)
                return mid;

            else if(guess(mid)==-1)
                end = mid -1;

            else
                start = mid +1;
        }
        return 0;
    }
}
