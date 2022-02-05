package com.company.main.CommandPattern;

public class TurnOffLightCommand implements Command
{
    private Light light;

    public TurnOffLightCommand(Light light)
    {
        this.light = light;
    }

    public void execute()
    {
        light.turnOff();
    }
}
