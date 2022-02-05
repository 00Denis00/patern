package com.company.main.BridgePattern;

public class Square implements Shape
{
    @Override
    public String draw(Color color)
    {
        return "Square drawn! " + color.fill();
    }
}
