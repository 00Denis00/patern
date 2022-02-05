package com.company.main.MediatorPattern;

public class Programmer extends Colleague
{
    private Director director;

    public Programmer(Director director)
    {
        this.director = director;
    }

    @Override
    public void notify(String message)
    {
        System.out.println("Programmer got the message: " + message);
    }

    @Override
    public void send(String message)
    {
        director.send(message, this);
    }
}
