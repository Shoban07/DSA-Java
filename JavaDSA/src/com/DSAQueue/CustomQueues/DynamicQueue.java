package com.DSAQueue.CustomQueues;

public class DynamicQueue extends CircularQueueReTest
{
    public DynamicQueue()
    {
        super();
    }

    public DynamicQueue(int size)
    {
        super(size);
    }

    //insert
    @Override
    public boolean insert(int item)
    {
        //check if the DynamicQueue is full
        if(isCQueueFull())
        {
            //doubled the size
            int[] temp = new int[data.length*2];

            //place the elements in the temp int[]
            for(int i = 0; i< data.length;i++)
            {
                temp[i] = data[(i+front) % data.length];
            }
            //at this point in the temp elements will be arranged from oth index to size of the data[] array.
            front = 0;
            end = data.length;

            //now point the temp variable into data variable
            data = temp;
        }

        return super.insert(item);
    }
}
