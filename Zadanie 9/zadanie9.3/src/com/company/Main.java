package com.company;


public class Main
{
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};


        System.out.println("Oryginalna tablica:");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + "  ");

        System.out.println();
        System.out.println("Tablica w odwrotnej kolejnośći:");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");
    }
}