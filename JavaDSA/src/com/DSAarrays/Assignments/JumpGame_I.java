package com.DSAarrays.Assignments;

//Description: Jump game 1;
//Link:  https://leetcode.com/problems/jump-game/submissions/

public class JumpGame_I {
    public static void main(String[] args) {
        int[] nums = {1,2,1,0,4};
        System.out.println(canJumpEffectively(nums));
    }

    public static boolean canJump(int[] nums) {
        boolean result = false;

        int length = nums.length;
        int lastIndex = length - 1;
        if (length == 1) {
            result = true;
        }
        if (length > 1) {
            //need to write a recursive function
            int max = 0;
            for (int index = 0; index < length - 1 && max >= index; index++) {
                if (max < index + nums[index]) {
                    max = nums[index] + index;
                }
            }

            if (max >= lastIndex) {
                result = true;
            }
        }

        return result;
    }

    //need to write a function in a recursive way
    public static boolean canJumpGreedy(int[] nums) {
        int n = nums.length;
        int maxReachable = 0;

        for (int i = 0; i < n; i++) {

            if (maxReachable < i)
                return false;

            maxReachable = Math.max(nums[i] + i, maxReachable);
        }

        return true;

    }
    /*Time and Space Complexity
    * 1. Time: O(n)
    * Space: O(1) no extra space is used*/
    //Most Efficient Method with O(n) time complexity
    public static boolean canJumpEffectively(int[] num)
    {
        int lastPosition = num.length - 1;

        for(int i = num.length-1;i>=0;i--)
        {
            if(i+num[i]>=lastPosition)
            {
                lastPosition = i;
            }
        }
        return lastPosition == 0;
    }
}
