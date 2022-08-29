package com.DSAQueue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQueue
{
    public static void main(String[] args) {

        //Since queue is an interface we are creating object of its base type linked list
        Queue<String> queue = new LinkedList<>();

        //inserting element in queue
        queue.add("S");
        queue.add("H");
        queue.add("O");
        queue.add("B");
        queue.add("A");
        queue.add("N");

        //removing element in queue
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        System.out.println("/*************************/");

    }
}
