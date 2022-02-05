package com.company.main;

import com.sun.tools.javac.Main;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.ConsoleHandler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class ChainPattern
{
    public void demonstrate(Logger logger)
    {
        ConsoleHandler consoleHandler = new ConsoleHandler()
        {
            @Override
            public void publish(LogRecord record)
            {
                System.out.println(record + " обработан!");
            }
        };
        logger.addHandler(consoleHandler);
        logger.info("chain");
    }
}
