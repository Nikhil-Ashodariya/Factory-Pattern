package serviceconsumer;

import com.codewithnikhil.IStack;
import com.codewithnikhil.StackFactory;

public class ServiceConsumer
{
    public static void main(String[] args) throws Exception
    {
        IStack a = StackFactory.getStack(10,2);
        System.out.println("Stack object = " + a);
    }
}