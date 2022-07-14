package com.DSAarrays.Assignments;

//Description: Remove Duplicate Elements from Sorted Array
//Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args)
    {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int uniqueCharacterIndex = removeDuplicates(nums);
        for(int i = 0; i<uniqueCharacterIndex;i++)
        {
            System.out.print(nums[i]+",");
        }
        System.out.println("    Unique Numbers Count : "+uniqueCharacterIndex);
    }

    //Time and space complexity
    //Time : O(2n) -> O(n) [2n is if all the elements are unique then both the pointers have to iterate]
    //Space : O(1) -> as we utilize the same array variable for storing the unique elements.
    public static int removeDuplicates(int[] nums)
    {
        if(nums.length>1) // edge case 1 ; if given array was having more than one element
        {
            //two pointer method
            int i  = 1; //pointer one to maintain the insertion point of unique elements

            for(int j = 1; j<nums.length;j++) // pointer two to check and skip the duplicate elements
            {
                if(nums[j] != nums[j-1])
                {
                    nums[i] = nums[j];
                    i++;
                }
            }

            return i;
        }
        else// edge case 2: If given array was having less than one element.
        {
            return 1;
        }
    }
}
