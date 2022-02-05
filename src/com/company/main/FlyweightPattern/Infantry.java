package com.company.main.FlyweightPattern;

public class Infantry extends Force
{
    public Infantry()
    {
        name = "Infantry";
        equipment = "Swords";
    }

    @Override
    public void createForce()
    {
        System.out.println("Name: " + name);
        System.out.println("Equipment: " + equipment);
    }
}
