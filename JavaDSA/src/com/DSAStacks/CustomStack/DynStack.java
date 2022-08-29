package com.DSAStacks.CustomStack;

public class DynStack
{
    private int[] data;

    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1;

    public DynStack()
    {
        this(DEFAULT_SIZE);
    }
    public DynStack(int size)
    {
        this.data = new int[size];
    }

    //to check stack is full
    public boolean isStackFull()
    {
        return ptr == data.length-1;
    }

    //to check the stack is empty
    public boolean isEmpty()
    {
        return ptr == -1;
    }

    //push
    public boolean push(int item) throws StackException
    {
        if(isStackFull())
        {
            int[] temp = new int[data.length*2];

            for(int i = 0; i< data.length;i++)
            {
                temp[i] = data[i];
            }
            data = temp;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    //pop
    public int pop() throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("Stack is empty..!");
        }

        return data[ptr--];
    }

    //peek
    public int peek()
    {
        return data[ptr];
    }
}
