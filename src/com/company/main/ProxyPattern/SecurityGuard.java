package com.company.main.ProxyPattern;

public class SecurityGuard
{
    HouseDoor door = new HouseDoor();
    String pass = "qwerty";

    public void open(String pass)
    {
        if(pass.equals(this.pass))
        {
            door.open();
        }
        else
        {
            System.out.println("Incorrect password!");
        }
    }

    public void close()
    {
        door.close();
    }
}
