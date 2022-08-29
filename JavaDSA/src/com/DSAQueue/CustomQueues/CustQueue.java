package com.DSAQueue.CustomQueues;

public class CustQueue
{
    //Basic DataStructure
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    private int end = 0;

    public CustQueue()
    {
        this(DEFAULT_SIZE);
    }
    public CustQueue(int size)
    {
        this.data = new int[size];
    }
    //insert
    public boolean insert(int item) throws CustomQueueException
    {
        if(isQueueFull())
        {
            throw new CustomQueueException("Queue is full, Unable to insert");
        }
        data[end++] = item;
        return true;
    }

    //remove
    public int remove() throws CustomQueueException
    {
        if(isEmpty())
        {
            throw new CustomQueueException("No items to remove, Queue is empty..!");
        }

        int removed = data[0];

        for(int i = 1; i<end;i++)
        {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    //front
    public int front() throws CustomQueueException
    {
        if(isEmpty())
        {
            throw new CustomQueueException("No items to remove, Queue is empty..!");
        }
        return data[0];
    }

    //display
    public void display()
    {
        for(int i = 0; i<end;i++)
        {
            System.out.print(data[i]+ "<-");
        }
        System.out.println("END");
    }

    //to check whether queue is full or not
    public boolean isQueueFull()
    {
        return end == data.length;
    }

    //to check whether queue is empty or not
    public boolean isEmpty()
    {
        return end == 0;
    }
}
