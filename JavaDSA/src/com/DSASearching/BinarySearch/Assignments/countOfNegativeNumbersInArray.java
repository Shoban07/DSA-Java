package com.DSASearching.BinarySearch.Assignments;

//Problem: Count Negative Numbers in a Sorted Matrix
//Link: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/submissions/
public class countOfNegativeNumbersInArray
{
    public static void main(String[] args) {
        int[][] arr = {
                        {4,3,2,-1},
                        {3,2,1,-1},
                        {1,1,-1,-2},
                        {-1,-1,-2,-3}};
        int[][] arr2 = {{3,-1,-3,-3,-3},{2,-2,-3,-3,-3},{1,-2,-3,-3,-3},{0,-3,-3,-3,-3}};

        int[][] arr3 = {{4,3,3,1,1},{1,0,0,-1,-1},{-2,-2,-2,-2,-3},{-2,-2,-2,-3,-3},{-3,-3,-3,-3,-3}};

        int[][] arr4 = {{10,9,8,8,8,7,6,6,5,5,4,-13,-14,-15},{10,9,7,7,7,7,5,4,3,2,1,-13,-15,-15},{10,9,7,6,6,5,4,4,2,2,0,-14,-16,-16},{9,9,7,5,4,4,4,4,1,1,-1,-15,-16,-16},{9,8,7,4,3,2,1,1,-15,-15,-16,-17,-18,-18},{9,7,7,3,2,2,-20,-20,-20,-20,-20,-20,-20,-20},{8,7,6,3,2,1,-20,-20,-20,-20,-20,-20,-20,-20},{8,6,6,-16,-16,-16,-20,-20,-20,-20,-20,-20,-20,-20},{-19,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20},{-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20},{-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20},{-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20},{-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20},{-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20},{-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20}};

        System.out.println("Count of negatives in given array: "+countNegatives(arr4));
    }
    public static int countNegatives(int[][] arr)
    {
        int countOfNegativeNumbers = 0;
        for(int i = 0;i<=arr.length-1;i++)
        {
            countOfNegativeNumbers += searchNegativeNumbers(arr[i],0,arr[i].length-1);
        }
        return countOfNegativeNumbers;
    }
    public  static int searchNegativeNumbers(int[] arr, int start, int end)
    {
        int count = 0;
        if(arr[start]<0)
            return arr.length;
        else if(arr.length>1 && arr[start+1]<0)
            return arr.length-1;
        else if(arr[end]>0)
            return count;
        if(arr.length>0) {
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] >= 0) {
                    //searchNegativeNumbers(arr, mid + 1, end);
                    start = mid+1;
                } else if (arr[mid] < 0 && arr[mid]<=arr[mid-1]) {
                    count += (end-mid)+1;
                    //searchNegativeNumbers(arr, mid + 1, end);
                    end = mid - 1;
                }
            }
        }
        if(start==end&&arr[start]<0)
        {
            count++;
        }
        return count;
    }
}
