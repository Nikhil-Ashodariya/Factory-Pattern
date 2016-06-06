package com.codewithnikhil;

public interface IStack
{
    /**
     *
     * @param v
     * @throws Exception
     */
    void push(int v) throws Exception;

    int pop() throws Exception;

    String getName();

    void display();

    default int peek() throws Exception
    {
        int v = pop();
        push(v);
        return v;
    }
}
