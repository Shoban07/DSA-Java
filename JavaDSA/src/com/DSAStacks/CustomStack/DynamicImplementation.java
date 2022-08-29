package com.DSAStacks.CustomStack;

public class DynamicImplementation extends CutomStackImplementation
{
    public DynamicImplementation()
    {
        super();
    }
    public DynamicImplementation(int size)
    {
        super(size);
    }

    @Override
    public boolean Push(int item) throws StackException
    {
        int[] temp = new int[data.length*2];

        for(int i = 0; i< data.length;i++)
        {
            temp[i] = data[i];
        }

        return super.Push(item);
    }

}
