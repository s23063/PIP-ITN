package com.company;

public class Main {
    public static int F(int x) {if(x == 0) {return 0;
    }if(x == 1)
    {return 1;}
    else{
        return F(x-1) + F(x-2);
        }
    }
    public static void main(String[] args) {
        int x = 6;
        System.out.println(F(x));

    }
}
