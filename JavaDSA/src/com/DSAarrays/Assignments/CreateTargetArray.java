package com.DSAarrays.Assignments;

import java.util.ArrayList;
import java.util.List;

//Difficulty : Easy 9. Create Target Array in the Given Order
//reference link : https://leetcode.com/problems/create-target-array-in-the-given-order/
/*
Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.*/
public class CreateTargetArray
{
    public int[] createTargetArray(int[] nums, int[] index) {
        int size = nums.length;
        List out = new ArrayList<>(size);
        for(int i=0;i<size;++i){
            out.add(index[i],nums[i]);
// System.out.println(out);
        }
        for(int i=0;i<size;++i){
            nums[i]= (int) out.get(i);
        }
        return nums;
    }
    public static void main(String[] args) {
    int[] num = {0,1,2,3,4};
    int[] index = {0,1,2,2,1};
    CreateTargetArray arr = new CreateTargetArray();
    arr.createTargetArray(num,index);
    }
}
