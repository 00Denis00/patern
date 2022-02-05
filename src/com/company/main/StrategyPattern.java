package com.company.main;

import java.util.*;

public class StrategyPattern
{
    public void sort(List<String> list)
    {
        Comparator<String> comparator = Comparator.comparingInt(String::length);
        Set set = new TreeSet(comparator);
        set.addAll(list);
        System.out.println(set);
    }
}
