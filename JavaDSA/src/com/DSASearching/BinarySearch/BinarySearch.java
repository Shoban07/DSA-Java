package com.DSASearching.BinarySearch;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 17, 18, 23, 57, 89};
        int target = 23;
        System.out.println(SearchBinary(arr,target)+" is the element index");
    }
    static int SearchBinary(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length -1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(target > arr[mid]) // if middle element was > target then increase the starting index to middle + 1
            {
                start = mid +1;
            }
            else if(target < arr[mid]) // if middle element was < target then decrease the end index to middle -1 ;
            {
                end = mid -1;
            }
            else{ // when target and middle element becomes same, then return the index number.
                return mid;
            }
        }
        //if no such element exists return index as -1
        return -1;
    }
}
