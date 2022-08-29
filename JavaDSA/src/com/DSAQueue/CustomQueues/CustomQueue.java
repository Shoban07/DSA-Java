package com.DSAQueue.CustomQueues;

public class CustomQueue
{
    private int[] data;

    private static final int DEFAULT_SIZE = 10;

    private int end = 0; //starting place to insert

    public CustomQueue()
    {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size)
    {
        this.data = new int[size];
    }

    //insert
    public boolean insert(int item)
    {
        if(isQueueFull())
        {
            System.out.println("Unable to insert into queue, Queue is full..!");
            return false;
        }
        data[end++] = item;
        return true;
    }

    //remove
    /*Time Complexity : O(n) -> n length of the queue*/
    public int remove() throws CustomQueueException
    {
        if(isEmpty())
        {
            throw new CustomQueueException("Queue is empty, No items to remove");
        }

        int removedItem = data[0];
        //we need to shift the elements to its previous index in array as sign of removing the first element in the queue
        for(int i = 1;i<end;i++)
        {
            data[i-1] = data[i];
        }
        end--;
        System.out.println(removedItem);
        return removedItem;
    }

    public int front() throws CustomQueueException
    {
        if(isEmpty())
        {
            throw new CustomQueueException("Queue is empty..!, No items to view");
        }
        return data[0];
    }

    public void display()
    {
        for(int i = 0; i< end;i++)
        {
            System.out.print(data[i] + " <-");
        }
        System.out.println("END"); //marks the end of the queue
    }

    public boolean isQueueFull()
    {
        return end == data.length;
    }

    public boolean isEmpty()
    {
        return end == 0;
    }
}
