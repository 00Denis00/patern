package com.company.main.ProxyPattern;

public class HouseDoor implements Door
{

    @Override
    public void open()
    {
        System.out.println("Открытие двери дома...");
    }

    @Override
    public void close()
    {
        System.out.println("Закрытие двери дома...");
    }
}
