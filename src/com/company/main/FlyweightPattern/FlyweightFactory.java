package com.company.main.FlyweightPattern;

import java.util.HashMap;

public class FlyweightFactory
{
    private HashMap<Integer, Force> forces = new HashMap();

    public Force getForce(int num)
    {
        Force force = forces.get(num);
        if (force == null)
        {
            switch (num)
            {
                case 1 :
                {
                    force = new Infantry();
                    break;
                }
                case 2 :
                {
                    force = new Cavalry();
                    break;
                }
                case 3 :
                {
                    force = new Artillery();
                    break;
                }
            }
            forces.put(num, force);
        }
        return force;
    }

}