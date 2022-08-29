package com.DSAStacks.CustomStack;

public class DynamicStack  extends  CustomStack
{
    public DynamicStack()
    {
        super();
    }

    public DynamicStack(int size)
    {
        super(size);
    }

    @Override
    public boolean push(int item) throws StackException
    {
        //checks if the stack was full, if yes then increase the size 2 times,
        // else will insert the item into the stack
        if(super.isStackFull())
        {
            //create a temp array and set the size double times
            int[] temp = new int[data.length*2];

            //iterate the old array and fill the elements in the new array
            for(int i = 0;i<data.length;i++)
            {
                temp[i] = data[i];
            }
            data = temp;
        }

        return super.push(item);
    }
}
