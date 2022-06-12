package com.DSAarrays.Assignments;

//region Problem Description
/*
*Difficulty : Easy 11. Count Items Matching a Rule.
//reference link : https://leetcode.com/problems/count-items-matching-a-rule/
*
* You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:
ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.

Example 1:

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

*/
//endregion

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class    ItemsCountMatchingRule {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        ArrayList<String> array1 = new ArrayList<>();
        array1.add("phone");
        array1.add("blue");
        array1.add("pixel");
        ArrayList<String> array2 = new ArrayList<>();
        array2.add("computer");
        array2.add("silver");
        array2.add("lenovo");
        ArrayList<String> array3 = new ArrayList<>();
        array3.add("phone");
        array3.add("gold");
        array3.add("iphone");
        list.add(array1);
        list.add(array2);
        list.add(array3);
        for (ArrayList<String> arr: list) {
            System.out.println(Arrays.toString(arr.toArray()));
        }
        System.out.println(countMatches(list,"type","computer"));
    }
    public static int countMatches(ArrayList<ArrayList<String>> list, String ruleKey, String ruleValue)
    {
        int matches = 0, key = 0;
        switch (ruleKey){
            case "type":
                key = 0;
                break;
            case "color":
                key =1 ;
                break;
            case "name":
                key = 2;
                break;
        }
        for(ArrayList<String> item : list)
        {
            if(item.get(key).equals(ruleValue))
            {
                matches++;
            }
        }
        return matches;
    }
}
