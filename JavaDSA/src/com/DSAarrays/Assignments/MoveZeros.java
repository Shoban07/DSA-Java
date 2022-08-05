package com.DSAarrays.Assignments;

//Description: Move Zeroes
//Link: https://leetcode.com/problems/move-zeroes/
import java.util.Arrays;

public class MoveZeros
{
    public static void main(String[] args)
    {
        int[] nums = {1,0,3,0,12};
        moveZerosEfficient(nums);
        System.out.println(Arrays.toString(nums));
    }
    /*
    * Time Complexity: O(2n) => O(n) since we used two loops in worst case we may end up in O(2n)
    * Space Complexity: O(1) no extra space is used*/
    public static void moveZerosEfficient(int[] nums)
    {
        //first filling the initial position with non zero elements
        int j = 0;
        for(int i = 0; i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[j] = nums[i];
                j++;
            }
        }
        //j is the counter of non-zero numbers
        //Now fill the remaining places as 0
        while(j<nums.length)
        {
            nums[j] = 0;
            j++;
        }

    }
    //Generic way, but need to do the zeroes swap in place.
    //Created this method myself
    /*
     * Time Complexity: O(3n) => O(n) since we used three loops in worst case we may end up in O(2n)
     * Space Complexity: O(n) same size of input array was used to create the new array*/
    public static void moveZeroes(int[] nums)
    {
        int zeroIndex = nums.length-1;
        int[] res = new int[nums.length];
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                res[zeroIndex] = nums[i];
                zeroIndex--;
            }
        }

        int j = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]!=0 && j<=zeroIndex)
            {
                res[j] = nums[i];
                j++;
            }
        }

        for(int i = 0; i<nums.length;i++)
        {
            nums[i] = res[i];
        }
    }
}
