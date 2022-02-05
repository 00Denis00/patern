package com.company.main;

import com.company.main.AbstractFactoryPattern.BakerWorkerFactory;
import com.company.main.AbstractFactoryPattern.ButcherWorkerFactory;
import com.company.main.BridgePattern.*;
import com.company.main.CommandPattern.*;
import com.company.main.FabricPattern.Pizza;
import com.company.main.FabricPattern.PizzaFabric;
import com.company.main.FabricPattern.PizzaTypes;
import com.company.main.FacadePattern.GPSInterface;
import com.company.main.FacadePattern.GPSNotifier;
import com.company.main.FacadePattern.GPSPower;
import com.company.main.FacadePattern.RoadAdvisor;
import com.company.main.FlyweightPattern.FlyweightFactory;
import com.company.main.FlyweightPattern.Force;
import com.company.main.MediatorPattern.Customer;
import com.company.main.MediatorPattern.Director;
import com.company.main.MediatorPattern.Programmer;
import com.company.main.ObserverPattern.Citizen;
import com.company.main.ObserverPattern.Country;
import com.company.main.ProxyPattern.SecurityGuard;
import com.company.main.TemplateMethodPattern.AbstractFood;
import com.company.main.TemplateMethodPattern.ItalianFood;
import com.company.main.TemplateMethodPattern.UkrainianFood;
import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Commander
{
    public static final String ANSI_BLUE = "\u001B[38;5;33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args)
    {
        System.out.println(ANSI_BLUE + "To select BuilderPattern write \"Builder\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select FabricPattern write \"Fabric\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select PrototypePattern write \"Prototype\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select SingletonPattern write \"Singleton\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select AbstractFactoryPattern write \"AbstractFactory\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select ProxyPattern write \"Proxy\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select DecoratorPattern write \"Decorator\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select AdapterPattern write \"Adapter\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select CompositePattern write \"Composite\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select BridgePattern write \"Bridge\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select FacadePattern write \"Facade\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select CommandPattern write \"Command\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select StrategyPattern write \"Strategy\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select ChainPattern write \"Chain\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select IteratorPattern write \"Iterator\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select VisitorPattern write \"Visitor\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select ObserverPattern write \"Observer\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select MediatorPattern write \"Mediator\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select MementoPattern write \"Memento\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select TemplateMethodPattern write \"TemplateMethod\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To select FlyweightPattern write \"Flyweight\"" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "To end the program write \"END\"" + ANSI_RESET);
        System.out.println();

        int end = 0;
        while(end == 0)
        {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();

            if(command.equals("Builder"))
            {
                BuilderPattern BP = new BuilderPattern();

                BP.set("Hello");
                BP.set(" ");
                BP.set("world");

                System.out.println(BP.get());
            }

            else if(command.equals("Fabric"))
            {
                PizzaFabric fabric = new PizzaFabric();

                Pizza margherita = fabric.getPizza(PizzaTypes.MARGHERITA);
                Pizza hawaiian = fabric.getPizza(PizzaTypes.HAWAIIAN);
                Pizza quattroformaggi = fabric.getPizza(PizzaTypes.QUATTROFORMAGGI);

                margherita.eat();
                hawaiian.eat();
                quattroformaggi.eat();
            }

            else if(command.equals("Prototype"))
            {
                PrototypePattern prototype = new PrototypePattern();
                prototype.set(PrototypePattern.Type.FIRST);
                System.out.println(prototype.get());

                PrototypePattern clone = prototype.copy();
                clone.set(PrototypePattern.Type.SECOND);
                System.out.println(clone.get());
            }

            else if(command.equals("Singleton"))
            {
                SingletonPattern singleton = SingletonPattern.getInstance("ONLY");
                SingletonPattern anotherSingleton = SingletonPattern.getInstance("SECOND");
                System.out.println(singleton.value);
                System.out.println(anotherSingleton.value);
            }

            else if(command.equals("AbstractFactory"))
            {
                BakerWorkerFactory BWF = new BakerWorkerFactory();
                BWF.getSubject().getDescription();
                BWF.getOccupation().getDescription();

                System.out.println();

                ButcherWorkerFactory BUTCHWF = new ButcherWorkerFactory();
                BUTCHWF.getSubject().getDescription();
                BUTCHWF.getOccupation().getDescription();
            }

            else if(command.equals("Proxy"))
            {
                SecurityGuard security = new SecurityGuard();
                security.open("qwerty");
                security.close();
            }

            else if(command.equals("Decorator"))
            {
                DecoratorPattern deco = new DecoratorPattern();
                deco.decoratedAdd("ABC");
                deco.listAdd("apple");
                deco.get();
            }

            else if(command.equals("Adapter"))
            {
                AdapterPattern adapter = new AdapterPattern();
                adapter.add(0,"First");
                adapter.getAll();
                adapter.add(5,"ABC");
                adapter.getAll();
            }

            else if(command.equals("Composite"))
            {
                CompositePattern com = new CompositePattern();
                com.create();
                com.getAll();
                com.change();
                com.getAll();
            }

            else if(command.equals("Bridge"))
            {
                Shape square1 = new Square();
                Color blue = new Blue();
                System.out.println(square1.draw(blue));

                Shape square2 = new Square();
                Color green = new Green();
                System.out.println(square2.draw(green));
            }

            else if(command.equals("Facade"))
            {
                GPSPower power = new GPSPower();
                GPSNotifier notifier = new GPSNotifier();
                RoadAdvisor advisor = new RoadAdvisor();

                GPSInterface gps = new GPSInterface(power, notifier, advisor);

                gps.activate();
                gps.deactivate();
            }

            else if(command.equals("Command"))
            {
                Light light = new Light();
                Command switchUp = new TurnOnLightCommand(light);
                Command switchDown = new TurnOffLightCommand(light);

                Switch sw = new Switch(switchUp,switchDown);

                sw.flipUp();
                sw.flipDown();
            }

            else if(command.equals("Strategy"))
            {
                StrategyPattern strategyPattern = new StrategyPattern();
                List<String> list = Arrays.asList("Kiev", "Moscow", "Minsk");
                strategyPattern.sort(list);
            }

            else if(command.equals("Chain"))
            {
                ChainPattern chain = new ChainPattern();
                Logger logger = Logger.getLogger(Main.class.getName());
                chain.demonstrate(logger);
            }

            else if(command.equals("Iterator"))
            {
                IteratorPattern iterator = new IteratorPattern();
                List<String> list = Arrays.asList("Kiev", "Moscow", "Minsk");
                iterator.iterate(list);
            }

            else if(command.equals("Visitor"))
            {
                VisitorPattern visitor = new VisitorPattern();
                visitor.files("java.io.tmpdir");
            }

            else if(command.equals("Observer"))
            {
                Country USA = new Country();

                new Citizen("John", USA);
                new Citizen("Bob", USA);
                new Citizen("Martin", USA);

                USA.setNews("Presidential Election Completed!");
            }

            else if(command.equals("Mediator"))
            {
                Director director = new Director();

                Customer customer = new Customer(director);
                Programmer programmer = new Programmer(director);

                customer.send("Java program was ordered!");
            }

            else if(command.equals("Memento"))
            {
                MementoPattern memento = new MementoPattern("iPhone");
                System.out.println(memento.get());
                memento.set("Samsung");
                System.out.println(memento.get());
                memento.reset();
                System.out.println(memento.get());
            }

            else if(command.equals("TemplateMethod"))
            {
                AbstractFood italianFood = new ItalianFood();
                italianFood.cookFood();

                System.out.println();

                AbstractFood ukrainianFood = new UkrainianFood();
                ukrainianFood.cookFood();
            }

            else if(command.equals("Flyweight"))
            {
                FlyweightFactory factory = new FlyweightFactory();

                int[] nums = {1,2,3};

                for (int num : nums)
                {
                    Force force = factory.getForce(num);
                    force.createForce();
                    System.out.println();
                }
            }

            else if(command.equals("END"))
            {
                System.out.println("Program ends...");
                end = 1;
            }
        }
    }
}
