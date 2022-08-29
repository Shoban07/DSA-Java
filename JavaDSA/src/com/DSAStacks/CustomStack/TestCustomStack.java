package com.DSAStacks.CustomStack;

public class TestCustomStack
{
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);

        stack.push(1);
        stack.push(7);
        stack.push(1);
        stack.push(2);
        stack.push(1996);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //for custom exception class
        //System.out.println(stack.pop());
    }
}
