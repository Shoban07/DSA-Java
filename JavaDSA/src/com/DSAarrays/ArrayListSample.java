package com.DSAarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSample
{
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Sample");
        list.add(1);
        list.add(true);
        list.add(1.1);
        list.add(1.001);

        System.out.println(Arrays.toString(list.toArray()));
        list.set(2,false);
        list.remove(4);
        System.out.println(list);
    }
}
