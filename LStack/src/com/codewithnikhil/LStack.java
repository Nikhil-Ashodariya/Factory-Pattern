package com.codewithnikhil;

public class LStack implements IStack,QOS
{
    int cost=8;
    int speed=8;

    @Override
    public void push(int v) throws Exception
    {
        System.out.println("push of LStack");
    }

    @Override
    public int pop() throws Exception
    {
        System.out.println("Pop of LStack");
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
