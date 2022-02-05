package com.company.main.AbstractFactoryPattern;

public class Butcher implements Occupation
{
    @Override
    public void getDescription()
    {
        System.out.println("I sell meat!");
    }
}
