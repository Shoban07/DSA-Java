package com.DSASearching.LinearSearch;

public class LinearSearchInStrings
{
    public static void main(String[] args)
    {
        String name = "shoban";
        char target = 'b';
        System.out.println(LinearSearchString(name,target));
        System.out.println(LinearSearchString2(name,target));
    }

    public static boolean LinearSearchString2(String str, char target)
    {
        if(str.length()==0)
        {
            return false;
        }
        for(char ch : str.toCharArray())
        {
            if(ch == target)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean LinearSearchString(String str, char target)
    {
        if(str.length()==0)
        {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
}
