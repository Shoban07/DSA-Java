package com.DSAStacks.CustomStack;

public class CustomStack
{
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1;

    public CustomStack()
    {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size)
    {
        data = new int[size];
    }

    //checks the stack is full or not
    public boolean isStackFull()
    {
        return ptr == data.length-1; //since we are initiating from -1
    }
    //checks the stack is empty or not
    public boolean isEmpty()
    {
        return ptr == -1;
    }

    //push
    public boolean push(int item) throws StackException
    {
        if(isStackFull())
        {
            throw new StackException("Stack is full, unable to insert..!");
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    //pop
    public int pop() throws  StackException
    {
        if(isEmpty())
        {
            throw new StackException("No items left, Stack is empty");
        }
//        int removed = data[ptr];
//        ptr--;
//
//        return removed;
        return data[ptr--];
    }

    //peek
    public int peek() throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("No items left, Stack is empty");
        }
        return data[ptr];
    }


}
