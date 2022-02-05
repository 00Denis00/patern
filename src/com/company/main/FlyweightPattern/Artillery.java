package com.company.main.FlyweightPattern;

public class Artillery extends Force
{
    public Artillery()
    {
        name = "Artillery";
        equipment = "Cannons";
    }

    @Override
    public void createForce()
    {
        System.out.println("Name: " + name);
        System.out.println("Equipment: " + equipment);
    }
}