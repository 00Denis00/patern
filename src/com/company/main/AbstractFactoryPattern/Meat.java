package com.company.main.AbstractFactoryPattern;

public class Meat implements Subject
{
    @Override
    public void getDescription()
    {
        System.out.println("It`s a meat!");
    }
}
