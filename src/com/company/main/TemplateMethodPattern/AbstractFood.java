package com.company.main.TemplateMethodPattern;

public abstract class AbstractFood
{
    abstract void cookGarnish();
    abstract void cookSalad();
    abstract void cookDessert();

    public final void cookFood()
    {
        setPlate();
        cookGarnish();
        cookSalad();
        cookDessert();
    }

    private void setPlate()
    {
        System.out.println("Plate was set");
    }
}
