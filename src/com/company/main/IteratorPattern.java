package com.company.main;

import java.util.*;

public class IteratorPattern
{
    public void iterate(List<String> list)
    {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
