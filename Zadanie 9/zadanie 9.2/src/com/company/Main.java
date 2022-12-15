package com.company;

public class Main {
    static int fib(int x)
    {
        if (x <= 1)
            return x;
        return fib(x - 1) + fib(x - 2);
    }


    public static void main(String args[])
    {
        int x = 3;
        System.out.println(fib(x));
    }
}


