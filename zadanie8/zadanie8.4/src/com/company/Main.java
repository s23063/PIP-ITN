package com.company;

public class Main {

    static void czyOddwrotna(){

        int[] data1 = {11,23,43,55,34,97,21,15,414,32};
        int[] data2 = {32,414,15,21,97,34,55,43,23,11};

        System.out.println(czyOdwrotna(data1, data2));
    }

    public static boolean czyOdwrotna(int[] a, int[] b)
    {
        if (a.length != b.length)
            return false;
        for (int i=0;i<a.length;i++)
            if (a[i] != b[a.length-i-1])
                return false;
        return true;

    }

    public static void main(String[] args) {


        czyOddwrotna();


    }

}

