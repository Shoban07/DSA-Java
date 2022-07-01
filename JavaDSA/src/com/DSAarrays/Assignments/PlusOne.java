package com.DSAarrays.Assignments;

//Description : Plus One
//Link: https://leetcode.com/problems/plus-one/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlusOne
{
    public static void main(String[] args)
    {
        int[] arr = {9};
        System.out.println(Arrays.toString(plusOneatEnd(arr)));
    }
    public static int[] plusOneatEnd(int[] digits)
    {

        List<Integer> list = new ArrayList<>();
        int length = digits.length;
        int k = 1;

        while(length-- > 0 || k > 0){

            if(length >= 0)
                k = k + digits[length];

            list.add(k % 10);
            k = k / 10;
        }
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] plusOneatEnd2(int[] digits)
    {
        int[] sample = {9};
        int i = digits.length-1; // i = 0
        while(digits[i]==9 && i>0){ // 9 == && 0>0 (not satisfied) goes to line 42
            digits[i]=0;
            i--;
        }
        if(i==0 && digits[i]==9){ // 0 == 0 && digits[0] == 9 (satisfied)
            int nf[] = new int[digits.length+1]; // increase the array size as the value will generate 10
            nf[0]=1; // here now arr[0] will be set to one
            return nf;
        }
        digits[i]=digits[i]+1; //dig[0] = dig[0] + 1 => dig[0] = 10
        return digits;
    }
}
