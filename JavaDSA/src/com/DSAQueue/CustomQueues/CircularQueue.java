package com.DSAQueue.CustomQueues;

public class CircularQueue
{
    public int[] data;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;
    private static final int DEFAULT_SIZE = 10;

    public CircularQueue()
    {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int sizenum)
    {
        data = new int[sizenum];
    }

    public boolean isFull()
    {
        return size == data.length;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }

        data[end++] = item;
        end %= data.length;
        size++;
        return true;
    }

    public int remove() throws CustomQueueException
    {
        if(isEmpty())
        {
            throw new CustomQueueException("Queue is empty...!");
        }

        int dataRemoved = data[front++];
        front %= data.length;
        size--;

        return dataRemoved;
    }

    public int front() throws CustomQueueException
    {
        if(isEmpty())
        {
            throw new CustomQueueException("Queue is empty...!");
        }

        return data[front];
    }

    public void display() throws CustomQueueException
    {
        if(isEmpty())
        {
            throw new CustomQueueException("Queue is empty...!");
        }

        int i = front;
        do{
            System.out.print(data[i]+" ->");
            i++;
            i%= data.length;
        }while(i != end);

        System.out.println("END");
    }

}
