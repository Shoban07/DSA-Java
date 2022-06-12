package com.DSAarrays.Assignments;

//Description: Final Value of Variable After Performing Operations
//Link: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

public class ValueOfOperation
{
    public static void main(String[] args)
    {
        String[] input = {"X++","X--","--X","++X","++X","++X"};
        System.out.println("Result :"+OperationValues(input));
    }
    public static int OperationValues(String[] operations)
    {
        int x = 0;
//        for (String operation : operations)
//        {
//            if (operation.equals("X++") || operation.equals("++X"))
//            {
//                x++;
//            }
//            else if(operation.equals("X--") || operation.equals("--X"))
//            {
//                x--;
//            }
//        }

        for(int i = 0; i<operations.length;i++)
        {
            x += operations[i].charAt(1)=='+' ? 1 : -1;
        }

        for (String opertion : operations)
        {
            x+= opertion.charAt(1)=='+' ? 1 : -1;
        }
        return x;
    }
}
