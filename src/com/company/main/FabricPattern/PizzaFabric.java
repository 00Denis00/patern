package com.company.main.FabricPattern;

public class PizzaFabric
{
    public Pizza getPizza(PizzaTypes type)
    {
        Pizza toReturn = null;
        switch (type)
        {
            case HAWAIIAN:
                toReturn = new HawaiianPizza();
                break;
            case MARGHERITA:
                toReturn = new PizzaMargherita();
                break;
            case QUATTROFORMAGGI:
                toReturn = new PizzaQuattroFormaggi();
                break;
            default:
                throw new IllegalArgumentException("Wrong pizza type:" + type);
        }
        return toReturn;
    }
}
