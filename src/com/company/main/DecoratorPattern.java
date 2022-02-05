package com.company.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorPattern
{
    List<String> list = new ArrayList<>();
    List<String> decorated = Collections.checkedList(list, String.class);

    public void listAdd(String str)
    {
        list.add(str);
    }

    public void decoratedAdd(String str)
    {
        decorated.add(str);
    }

    public void get()
    {
        System.out.println(decorated);
    }
}
