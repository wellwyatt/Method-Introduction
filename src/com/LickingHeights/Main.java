package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String userName;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        double number1, number2;
        Question1();
        userName = keyboard.nextLine();
        printGreetings(userName);
        System.out.println("Give me a number. ");
        number1 = keyboard.nextInt();
        System.out.println("Give me another number.");
        number2 = keyboard.nextInt();
        System.out.println(division(number1, number2));
        System.out.println(multiplication(number1,number2));

    }

    public static void printGreetings(String userName) {
        System.out.println("Hello " + userName);


    }

    public static void Question1() {
        System.out.println("What is your name?");
    }


    public static double division(double numberA, double numberB) {
        return numberA / numberB;
    }
    public static double multiplication(double numberC, double numberD){


        return numberC*numberD;
    }

}



