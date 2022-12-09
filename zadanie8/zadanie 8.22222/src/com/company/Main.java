package com.company;


public class Main {
    static void posortowanaTablica() {

        int[] intArray = new int[]{25, 3, 534, 11, 876, 54, 221, 13, 67, 90};
        int temp = 0;

        System.out.println("Oryginalna tablica: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        System.out.println("\nTablica posortowana: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");

        }

    }


    public static void main(String[] args) {
        posortowanaTablica();

    }
}

