package com.company;

public class Main {


         static void nieposortowanaTablica() {
            Integer[] intArray = {4,6,32,42,587,634,7,1,90};


            System.out.println("Oryginalna tablica:");
            for(int i=0;i<intArray.length;i++)
                System.out.print(intArray[i] + "  ");

            System.out.println();


            System.out.println("Tablica w odwrotnej kolejności:");
            for(int i=intArray.length-1;i>=0;i--)
                System.out.print(intArray[i] + "  ");
        }


    public static void main(String[] args) {
	nieposortowanaTablica();
    }
}
