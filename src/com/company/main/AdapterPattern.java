package com.company.main;

import java.util.Arrays;
import java.util.List;

public class AdapterPattern
{
    String[] array = {"One", "Two", "Three"};
    List<String> strings = Arrays.asList(array);

    public void add(Integer i, String str)
    {
        try
        {
            strings.set(i, str);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Adapter cannot add new elements to the array!");
        }
    }

    public void getAll()
    {
        System.out.println(Arrays.toString(array));
    }
}
