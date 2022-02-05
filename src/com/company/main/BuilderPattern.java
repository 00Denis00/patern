package com.company.main;

public class BuilderPattern
{
    StringBuilder stringBuilder = new StringBuilder();

    public void set(String str)
    {
        stringBuilder.append(str);
    }

    public String get()
    {
        return stringBuilder.toString();
    }
}
