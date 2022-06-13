package com.DSAarrays.Assignments;


//Decription: Decompress Run-Length Encoded List
//Link: https://leetcode.com/problems/decompress-run-length-encoded-list/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRunLengthEncodedList
{
    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        System.out.println(Arrays.toString(RunLengthEncodedList(arr)));
        System.out.println(Arrays.toString(V2RunLengthEncodedList(arr)));
    }

    //Recorded 9.10% faster in leetcode
    public static int[] RunLengthEncodedList(int[] numbers)
    {
        List<Integer> res = new ArrayList<Integer>();

        if(numbers.length>0 && numbers.length%2==0)
        {
            for(int i = 0;i<numbers.length;i+=2)
            {
                for(int j=0;j<numbers[i];j++)
                {
                    res.add(numbers[i+1]);
                }
            }
            return res.stream().mapToInt(Integer::intValue).toArray();
        }

        return new int[0];
    }

    //Recorded 100% faster in LeetCode
    public static int[] V2RunLengthEncodedList(int[] numbers)
    {
        if(numbers.length>0 && numbers.length%2==0) {
            int resArraySize = 0;
            for (int i = 0; i < numbers.length; i += 2) {
                resArraySize += numbers[i];
            }

            int[] resArray = new int[resArraySize];

            int startIdx = 0;
            for (int i = 0; i < numbers.length; i += 2) {
                Arrays.fill(resArray, startIdx, startIdx + numbers[i], numbers[i + 1]);
                startIdx += numbers[i];
            }
            return resArray;
        }
        return new int[0];
    }
}
