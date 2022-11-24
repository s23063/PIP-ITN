package com.company;

import java.util.Random;

class Main {

    static void randomString(){
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 5;

        for(int i = 0; i < length; i++) {
            int in = random.nextInt(alfabet.length());

            char randomChar = alfabet.charAt(in);
            sb.append(randomChar);
        }

        String randomString = sb.toString();
        System.out.println(" String " + randomString);



    }



    public static void main(String[] args) {
        randomString();


    }
}