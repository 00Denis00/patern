package com.company.main;

public class PrototypePattern
{
    private Type type;

    public enum Type
    {
        FIRST, SECOND
    }

    public PrototypePattern copy()
    {
        PrototypePattern prototype = new PrototypePattern();
        return prototype;
    }

    public void set(Type type)
    {
        this.type = type;
    }

    public String get()
    {
        return type.toString();
    }
}
