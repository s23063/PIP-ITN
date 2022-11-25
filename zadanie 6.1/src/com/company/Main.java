package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj a");
        int a = scan.nextInt();
        System.out.println("Podaj b");
        int b = scan.nextInt();
        System.out.println("Jaka operacje chcesz wykonac podaj jej numer?");
        System.out.println("1.ADD");
        System.out.println("2.SUBB");
        System.out.println("3.DIV");
        System.out.println("4.MULL");
        int s = scan.nextInt();
        switch (s) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a / b);
                break;
            case 4:
                System.out.println(a * b);
                break;
        }
    }
}
