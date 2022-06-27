package com.DSAarrays.Assignments;

//Description: Add to Array-Form of Integer
//Link: https://leetcode.com/problems/add-to-array-form-of-integer/
import java.text.DecimalFormat;
import java.util.*;

public class AddToArrayFormOfInteger
{
    public static void main(String[] args) {
        //int[] array= {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3}; int k = 516;
        int[] array = {1,2,0,0}; int k = 34;
//        System.out.println(Arrays.toString(new List[]{addToArrayForm(array, k)}));
        System.out.println(Arrays.toString(addToArrayForm2(array,k).toArray()));
    }

    public static List<Integer> addToArrayForm2(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int length = num.length;

        while(length-- > 0 || k > 0){

            if(length >= 0)
                k = k + num[length];

            list.add(k % 10);
            k = k / 10;
        }
        Collections.reverse(list);
        return list;
    }

    public static List<Integer> addToArrayForm(int[] num, int target) {


        int k=0;
        int sum=0;
        for(int i=0;i<num.length;i++){
            k = k*10;
            k=k+num[i];
        }
        sum= k+target;

        List<Integer> resultArray = new ArrayList<>();
        while(sum > 0)
        {
            resultArray.add((int) (sum%10));
            sum = sum / 10;
        }
        Collections.reverse(resultArray);

        return resultArray;
    }
}
