package com.company.main.ObserverPattern;

public class Citizen
{
    private String name;

    public Citizen(String name, Country country)
    {
        this.name = name;
        country.registerCitizen(this);
    }

    void update(String news)
    {
        System.out.println(name + " got the news: " + news);
    }
}
