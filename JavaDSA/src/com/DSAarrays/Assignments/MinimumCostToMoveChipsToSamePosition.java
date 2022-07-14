package com.DSAarrays.Assignments;

//Description : Minimum Cost to Move Chips to The Same Position
//Link: https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/

public class MinimumCostToMoveChipsToSamePosition
{
    public static void main(String[] args)
    {
        int[] arr = {2,2,2,3,3};
        System.out.println("Minimum Cost to move chips to same position = "+minCostToMoveChips(arr));
    }
    //Time and Space Complexity
    //Time Complexity: O(n) - one for loop, maximum possibility if we have to move all the chips to last element
    //Space complexity : O(1) - we have not included any new arrays etc.,
    public static int minCostToMoveChips(int[] position)
    {
        //As per the instruction moving into odd position cost us 1cost
        // Moving into even position cost us 0 cost.
        //Hence, by calculating the number of odd and even position we come to know the minimum cost to move.
        //Thus ,the minimum value in between odd positions and even positions will decide the minimum cost.
        if(position.length>1)
        {
            int oddPositions = 0;
            int evenPositions = 0;
            for (int j : position) {
                if (j % 2 == 0) {
                    evenPositions++;
                } else {
                    oddPositions++;
                }
            }
            return evenPositions < oddPositions ? evenPositions : oddPositions;
        }
        else return 0;
    }
}
