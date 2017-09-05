package dao;

import org.apache.log4j.*;
public class HelloWorld {
    Logger logger = Logger.getLogger(HelloWorld.class);
    public String print()
    {
        return "HelloWorld";
    }

    public static void main(String[] args)
    {
        HelloWorld helloWorld = new HelloWorld();
        System.out.print(helloWorld.print());
    }
}