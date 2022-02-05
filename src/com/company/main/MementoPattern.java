package com.company.main;

public class MementoPattern
{
    private final String state;
    private String value;

    public MementoPattern(String value)
    {
        this.state = value;
        this.value = value;
    }

    public String get()
    {
        return value;
    }

    public void set(String value)
    {
        this.value = value;
    }

    public void reset()
    {
        this.value = state;
    }
}
