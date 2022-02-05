package com.company.main.TemplateMethodPattern;

public class UkrainianFood extends AbstractFood
{
    @Override
    void cookGarnish()
    {
        System.out.println("Borsch was cooked");
    }

    @Override
    void cookSalad()
    {
        System.out.println("Olivier salad was cooked");
    }

    @Override
    void cookDessert()
    {
        System.out.println("Cinnamon bun was cooked");
    }
}
