package com.company.main.TemplateMethodPattern;

public class ItalianFood extends AbstractFood
{
    @Override
    void cookGarnish()
    {
        System.out.println("Pizza was cooked");
    }

    @Override
    void cookSalad()
    {
        System.out.println("Caesar salad was cooked");
    }

    @Override
    void cookDessert()
    {
        System.out.println("Tiramisu was cooked");
    }
}
