package com.DSASearching.BinarySearch.Assignments;
import java.util.ArrayList;
import java.util.Arrays;

//Problem: Intersection of Two Arrays II
//Link: https://leetcode.com/problems/intersection-of-two-arrays-ii/submissions/
public class IntersectionTwoArrays2
{
    /*region*
    alternate solution
    /
    public static void main(String[] args)
    {
        int[] arr1 = {3,1,2};
        int[] arr2 = {1,1};
        System.out.println(Arrays.toString(intersection(arr1,arr2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {

        boolean isNum1GreaterThanNum2 = false;
        int start = 0;
        int end = 0;
        ArrayList<Integer> resArray = new ArrayList<Integer>();
        int counter = 0;

        if(nums1.length>nums2.length){
            sortingArray(nums1);
            isNum1GreaterThanNum2 = true;
        }
        else
            sortingArray(nums2);

        if(isNum1GreaterThanNum2)
        {
            //end = nums1.length-1;
            for (int target:nums2) {
                if(!resArray.contains(target)){
                    int res = binarySearch(nums1,target);
                    if(res>=0)
                        resArray.add(res);}
//                while(start<=end)
//                {
//                    int mid = start + (end-start)/2;
//                    if(nums1[mid]<target)
//                        start = mid+1;
//                    else if(nums1[mid]>target)
//                        end = mid-1;
//                    else
//                        if(!resArray.contains(target)){
//                        resArray.add(nums1[mid]);}
//                        break;
//                }
            }
        }
        else
        {
            //end = nums2.length-1;
            for (int target:nums1) {
                if(!resArray.contains(target)){
                    int res = binarySearch(nums2,target);
                    if(res>=0)
                        resArray.add(res);}
//                while(start<=end)
//                {
//                    int mid = start + (end-start)/2;
//                    if(nums2[mid]<target)
//                        start = mid+1;
//                    else if(nums2[mid]>target)
//                        end = mid-1;
//                    else
//                    if(!resArray.contains(target)){
//                        resArray.add(nums1[mid]);}
//                    break;
//                }
            }
        }
        return resArray.stream().mapToInt(i->i).toArray();
    }
    public static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target) return arr[mid];
            if(arr[mid]<target)
            {
                start = mid+1;
            }
            else if(arr[mid]>target)
            {
                end = mid-1;
            }
        }
        return result;
    }
    public static void sortingArray(int[] arr)
    {
        boolean flag = false;
        //Passes
        for(int i = 0;i<arr.length-1;i++)
        {
            //Comparisons
            for(int j = 1; j<=arr.length-1;j++) // to avoid the sorted elements comparison we are neglecting them based on the passes count
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                    flag = true;
                }
            }
            if(!flag)
            {
                break;
            }
        }
    }
    //sort the array
     */

    public static void main(String[] args) {
        int[] arr1 = {3,1,2};
        int[] arr2 = {1,1,};

    }
    public static int[] intersect(int[] nums1, int[] nums2)
    {
        int[] hashCode = new int[nums1.length>nums2.length?nums1.length:nums2.length];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i : nums1)
        {
            hashCode[i]++; //arranging the numbers based on their index into new array
        }

        for(int i : nums2)
        {
            if(hashCode[i]>0)
            {
                //iterating through each element and comparing them.
                //Based on the index of hash array, if 1 means the element present at the index if 0 means no element present at the index
                if(hashCode[i]>0)
                {
                    hashCode[i]--; //here we do not consider the same element after one iteration
                    arrayList.add(i);
                }
            }
        }
        return arrayList.stream().mapToInt(i->i).toArray();

    }

}
