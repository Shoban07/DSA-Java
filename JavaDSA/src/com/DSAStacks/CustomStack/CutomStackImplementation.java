package com.DSAStacks.CustomStack;

public class CutomStackImplementation
{
    protected int[] data;

    private static final int DEFAULT_SIZE = 15;

    private int top = -1;

    public CutomStackImplementation()
    {
        this(DEFAULT_SIZE);
    }

    public CutomStackImplementation(int size)
    {
        data = new int[size];
    }

    public boolean isStackFull()
    {
        return top == data.length-1;
    }

    private boolean isEmpty()
    {
        return top == -1;
    }

    public boolean Push(int item) throws StackException
    {
        if(isStackFull())
        {
            throw new StackException("Unable to push new element, stack is full");
        }
        top++;
        data[top] = item;
        return true;
    }

    public int Pop() throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("No elements to remove, Stack is empty");
        }

        return data[top--];
    }

    public int Peek() throws  StackException
    {
        if(isEmpty())
        {
            throw new StackException("No elements to remove, Stack is empty");
        }
        return data[top];
    }
}
