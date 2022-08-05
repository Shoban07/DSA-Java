package com.DSAarrays.Assignments;

//Description : Majority Element
//Link:https://leetcode.com/problems/majority-element/

import java.util.*;
public class MajorityElement
{
    public static void main(String[] args) {
        System.out.println("Majority Element :"+majorityElement(new int[]{1,1,2,3,1}));
    }

    /*
    * Time Complexity: O(n2) - since array is sorted and worst case of sorting the array is O(n2)
    * Space Complexity: O(1) no extra space is consumed*/
    public static int majorityElement(int[] nums)
    {
        if(nums.length==1){ return nums[0];}
        //sort the array
        Arrays.sort(nums);

        //Logic behind this is if we sort the array
        //duplicate elements will line up one after another.
        //given condition is count of majority element should be greater than [num.length/2]
        //thus the element at the index nums[nums.length/2] will be the maximum happening number in given array.
        return nums[nums.length/2];}
}
