package com.DSAarrays.Assignments;

import java.util.ArrayList;
import java.util.List;

//Difficulty : Easy 6. Kids With the Greatest Number of Candies
//reference link : https://leetcode.com/problems/shuffle-the-array/

/*
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.



Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
* */

public class KidsWithMoreCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        /*List<Boolean> lst = new ArrayList<Boolean>();
        int maxSoFar = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxSoFar) {
                maxSoFar = candies[i];
                lst.add(true);
            } else {
                lst.add(false);
            }
        }
        return lst;*/
        List booleanList = new ArrayList<>(candies.length);
        int maxInCandies = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= maxInCandies) {
                maxInCandies = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= maxInCandies) {
                booleanList.add(true);
            } else {
                booleanList.add(false);
            }
        }
        return booleanList;
    }

    public static void main(String[] args) {
        int[] candies = {2, 8, 7};
        int extraCandies = 1;
        KidsWithMoreCandies kwc = new KidsWithMoreCandies();
        System.out.println(kwc.kidsWithCandies(candies, extraCandies));
    }
}
