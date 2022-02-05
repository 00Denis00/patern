package com.company.main.MediatorPattern;

public class Director
{
    Customer customer = new Customer(this);
    Programmer programmer = new Programmer(this);

    public void send(String msg, Colleague colleague)
    {
        if (colleague.getClass() == customer.getClass())
        {
            programmer.notify(msg);
        }
        else if (colleague.getClass() == programmer.getClass())
        {
            customer.notify(msg);
        }
    }
}
