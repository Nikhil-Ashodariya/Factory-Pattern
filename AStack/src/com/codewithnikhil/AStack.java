package com.codewithnikhil;

public class AStack implements IStack,QOS
{
    int cost=5;
    int speed=7;

    @Override
    public void push(int v) throws Exception
    {
        System.out.println("push of AStack");
    }

    @Override
    public int pop() throws Exception
    {
        System.out.println("Pop of AStack");
        return 0;
    }

    @Override
    public int getCost()
    {
        return cost;
    }

    @Override
    public int getSpeed()
    {
        return speed;
    }

    @Override
    public String getName()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
