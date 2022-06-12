package com.DSASearching.LinearSearch.Assignements;

public class WealthiestPerson
{
    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3},{3,4,2},{5,6,1},{6,6,1}};
        System.out.println("Max Wealth : "+CalculateWealth(arr));
    }
    static int  CalculateWealth(int[][] arr)
    {
        int maxWealth = 0;
        for (int[] ints : arr) {
            int currentWealth = 0;
            for (int anInt : ints) {
                currentWealth += anInt;
            }
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        return maxWealth;
    }
}
