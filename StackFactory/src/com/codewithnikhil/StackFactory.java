package com.codewithnikhil;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;

public class StackFactory
{
    public static IStack getStack(int c, int s) throws Exception
    {
        ArrayList<String> stacks = new ArrayList();

        FileInputStream fileInput = new FileInputStream(new File("C:\\Users\\Nikhil Smart\\Documents\\NetBeansProjects\\StackFactory\\ListOfStack.properties"));
        Properties stacksfile = new Properties();
        stacksfile.load(fileInput);
        fileInput.close();

        Enumeration stackskey = stacksfile.keys();
        while (stackskey.hasMoreElements())
        {
            String key = (String) stackskey.nextElement();
            String value = stacksfile.getProperty(key);
            stacks.add(value);
        }

        for (String str : stacks)
        {
            Class temp = Class.forName(str);
            QOS qos = (QOS) temp.newInstance();
            IStack stack = (IStack) temp.newInstance();
            int cost = qos.getCost();
            int speed = qos.getSpeed();
            if (cost <= c && speed >= s)
            {
                return stack;
            }
        }
        return null;
    }
}
