package com.company.main;

import java.awt.*;

public class CompositePattern
{
    Container container = new Container();
    Component comp1 = new Component() {};
    Component comp2 = new Component() {};

    public void create()
    {
        container.add(comp1);
        container.add(comp2);
    }

    public void change()
    {
        container.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    }

    public void getAll()
    {
        System.out.println(comp1.getComponentOrientation().isLeftToRight());
        System.out.println(comp2.getComponentOrientation().isLeftToRight());
    }
}
