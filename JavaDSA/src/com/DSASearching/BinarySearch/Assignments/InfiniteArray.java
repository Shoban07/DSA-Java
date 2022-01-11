package com.DSASearching.BinarySearch.Assignments;
//Problem Amazon Q
//Find position of an element in a sorted array of infinite numbers
//Link: https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray
{
 public static void main(String[] args)
 {
     int arr[] = {3, 5, 7, 9, 10, 90, 100, 130,
             140, 160, 170,200, 500, 600, 800, 801, 802};
     int target = 160;
     System.out.println(searchInfiniteSortedArray(arr,target));

 }
 public static int searchInfiniteSortedArray(int[] nums, int target)
 {
     //Declare start and end pointers as we not know their exact values [infinite array]
     int start = 0;
     int end = start + 1; //here we initially set the range as we progress with batch by batch to search element
    int ans = -1;
     while(target>nums[end])
     {
         //when the target element does not falls under the batch, then increase the batch size
         int temp = end + 1; // increasing the start index to next position of end, so that next binary search phase starts from not searched element

         // to remove the searched element from next batch we need to remove the searched indexes and increment to the next index for end position
         //double the box value
         //end = previous end + (sizeOfBox)*2  // #sizeOfBox = end - (start - 1) => end - start + 1
         end = end + (end - start + 1)*2;

         start = temp; //now set the start position, temp variable is for not altering the existing start position as we require that in the previous step.
     }
    ans = binarySearch(nums,target,start,end);
     return ans;
 }
 public static int binarySearch(int[] nums, int target, int start, int end)
 {
     while(start<=end)
     {
         int mid = start + (end - start)/2;
         if(target<nums[mid])
         {
             end = mid -1;
         }
         else if(target>nums[mid])
         {
             start = mid +1;
         }
         else
         {
             return mid;
         }
     }
     return -1;
 }
}
