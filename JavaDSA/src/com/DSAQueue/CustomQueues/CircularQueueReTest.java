package com.DSAQueue.CustomQueues;

public class CircularQueueReTest
{
    protected int[] data;

    protected int front = 0;
    protected int end = 0;

    public int size = 0;

    private static final int DEFAULT_SIZE = 10;

    public CircularQueueReTest()
    {
        this(DEFAULT_SIZE);
    }

    public CircularQueueReTest(int Size)
    {
        this.data = new int[Size];
    }

    //isFull
    public boolean isCQueueFull()
    {
        return size == data.length;
    }

    //isEmpty
    public boolean isCQueueEmpty()
    {
        return size == 0;
    }

    //insert O(1) time complexity
    public boolean insert(int item)
    {
        if(isCQueueFull()) {
            System.out.println("Queue is full..! Unable to insert");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    //remove time complexity O(1)
    public int remove() throws Exception
    {
        if(isCQueueEmpty())
        {
            throw new Exception("Queue is empty..!");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    //front
    public int front() throws Exception
    {
        if(!isCQueueEmpty())
        {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display()
    {
        if(!isCQueueEmpty())
        {
            int i = front;
            do {
                System.out.print(data[i]+ " <- ");
                i++;
                i = i % data.length;
            }while(i != end);

            System.out.println("END");
        }
    }
}
