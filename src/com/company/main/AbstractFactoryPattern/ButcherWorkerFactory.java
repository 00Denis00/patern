package com.company.main.AbstractFactoryPattern;

public class ButcherWorkerFactory implements WorkerFactory
{
    @Override
    public Meat getSubject()
    {
        return new Meat();
    }

    @Override
    public Butcher getOccupation()
    {
        return new Butcher();
    }
}
