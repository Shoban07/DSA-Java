package com.DSAStacks;

import java.util.*;

public class InBuiltStacksAndQueues
{
    public static void main(String[] args) {

        //initialization
        //Stack
        Stack<String> stack = new Stack<>();

        //Deck / Deque - double ended queue / Array Deque is  an abstract type of Deque interface
        Deque<String> deque = new ArrayDeque<>();

        //inserting element in stack
        stack.push("N");
        stack.push("A");
        stack.push("B");
        stack.push("O");
        stack.push("H");
        stack.push("S");



        //inserting element at Deque
        // we can add elements at both the ends
        deque.add("S");
        deque.addFirst("H");
        deque.addFirst("O");
        deque.addLast("B");
        deque.addLast("A");
        deque.addLast("N");



        //pop element from stack
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("/*************************/");



        System.out.println(deque.remove("S"));// returns true if removed
        System.out.println(deque.remove());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
    }
}
