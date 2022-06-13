package com.DSAarrays.Assignments;

//Description: Create Target Array in Given Order
//Link: https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.Arrays;
import java.util.List;
import  java.util.ArrayList;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
     int[] arr = {0,1,2,3,4}; int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(arr,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        if(nums.length>0 && nums.length == index.length) {
            List list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(index[i], nums[i]);
            }

            for (int i = 0; i < list.size(); i++) {
                index[i] = (int) list.get(i);
            }
            return index;
        }
        return new int[0];
    }
}
