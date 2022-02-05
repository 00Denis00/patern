package com.company.main.FlyweightPattern;

public class Cavalry extends Force
{
    public Cavalry()
    {
        name = "Cavalry";
        equipment = "Horses";
    }

    @Override
    public void createForce()
    {
        System.out.println("Name: " + name);
        System.out.println("Equipment: " + equipment);
    }
}
