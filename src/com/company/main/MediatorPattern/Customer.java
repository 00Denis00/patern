package com.company.main.MediatorPattern;

public class Customer extends Colleague
{
    private Director director;

    public Customer(Director director)
    {
        this.director = director;
    }

    @Override
    public void notify(String message)
    {
        System.out.println("Customer got the message: " + message);
    }

    @Override
    public void send(String message)
    {
        director.send(message, this);
    }
}
