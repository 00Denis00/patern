package com.company.main.AbstractFactoryPattern;

public class BakerWorkerFactory implements WorkerFactory
{
    @Override
    public Bread getSubject()
    {
        return new Bread();
    }

    @Override
    public Baker getOccupation()
    {
        return new Baker();
    }
}
