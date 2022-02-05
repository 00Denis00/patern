package com.company.main.AbstractFactoryPattern;

public class Bread implements Subject
{
    @Override
    public void getDescription()
    {
        System.out.println("It`s a bread!");
    }
}
