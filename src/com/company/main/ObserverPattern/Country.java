package com.company.main.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Country
{
    private List<Citizen> citizens = new ArrayList<>();
    private String news;

    public void setNews(String news)
    {
        this.news = news;
        notifyCitizens();
    }

    public void registerCitizen(Citizen citizen)
    {
        citizens.add(citizen);
    }

    public void removeCitizen(Citizen citizen)
    {
        citizens.remove(citizen);
    }

    public void notifyCitizens()
    {
        for (Citizen citizen : citizens)
        {
            citizen.update(news);
        }
    }
}
