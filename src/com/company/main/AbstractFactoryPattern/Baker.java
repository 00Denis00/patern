package com.company.main.AbstractFactoryPattern;

public class Baker implements Occupation
{
    @Override
    public void getDescription()
    {
        System.out.println("I bake bread!");
    }
}
