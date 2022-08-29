package com.DSAQueue.CustomQueues;

public class CustomQueueReTest
{
    private int[] data;

    private int end = 0;

    private static final int DEFAULT_SIZE = 10;

    public CustomQueueReTest()
    {
        this(DEFAULT_SIZE);
    }

    public CustomQueueReTest(int size)
    {
        this.data = new int[size];
    }

    //enqueue or insert
    public boolean insert(int item)
    {
        //check if the queue is full or not
        if(isQueueFull())
        {
            return false;
        }
        data[end++] = item;
        return true;
    }
    //isQueueFull
    private boolean isQueueFull()
    {
        return end == data.length;
    }

    //dequeue or remove
    //time complexity = O(n) - as we have to traverse through the array for shifting the elements
    public int remove() throws Exception
    {
        if(isQueueEmpty())
        {
            throw new Exception("Queue is empty");
        }

        int removed = data[0];
        //shifts items into previous index
        for(int i = 1; i < end;i++)
        {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    //isQueueEmpty
    private boolean isQueueEmpty()
    {
        return end == 0;
    }

    //front
    public int front() throws Exception
    {
        if(isQueueEmpty())
        {
            throw new Exception("Queue is empty..!");
        }
        return data[0];
    }

    //display
    public void display()
    {
        for(int i = 0; i<end;i++)
        {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("end");
    }

}
