package com.DSAarrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimDynamicArrays
{
    public static void main(String[] args) {
        //region
        //region Scanners
         Scanner in = new Scanner(System.in);
        //endregion
        //introduction
        ArrayList<ArrayList<String>> list = new ArrayList<>(); //declaration

        //initialization
        for (int i =0;i<3;i++)
        {
            list.add(new ArrayList<String>());
        }

        //add elements
        for(int i = 0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                list.get(i).add(in.next());
            }
        }
        System.out.print(list);
        //endregion
    }
}
