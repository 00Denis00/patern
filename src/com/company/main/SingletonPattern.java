package com.company.main;

public final class SingletonPattern
{
    private static SingletonPattern instance;
    public String value;

    public SingletonPattern(String value)
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonPattern getInstance(String value)
    {
        if (instance == null)
        {
            instance = new SingletonPattern(value);
        }
        return instance;
    }
}
