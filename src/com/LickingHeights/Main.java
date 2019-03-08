package com.LickingHeights;

import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        // write your code here
        String userName, wordA, wordB;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        double number1, number2;
        helloworld();
        Question1();
        userName = keyboard.nextLine();
        printGreetings(userName);
        System.out.println("Give me a number. ");
        number1 = keyboard.nextInt();
        System.out.println("Give me another number.");
        number2 = keyboard.nextInt();
        System.out.println(division(number1, number2));
        System.out.println(multiplication(number1, number2));
        keyboard.nextLine();
        System.out.println("Give me one word");
        wordA = keyboard.nextLine();
        System.out.println("Give me another");
        wordB = keyboard.nextLine();
        System.out.println(wordFlip(wordA, wordB));
        System.out.println("The Max Number is " +maxNum(number1,number2));

    }

    public static void helloworld() {
        System.out.println("Hello World");

    }


    public static void printGreetings(String userName) {
        System.out.println("Hello " + userName);


    }

    public static void Question1() {
        System.out.println("What is your name?");
    }


    public static double division(double numberA, double numberB) {
        System.out.print("The first number divided by the second number = ");
        return numberA / numberB;
    }

    public static double multiplication(double numberA, double numberB) {
        System.out.print("The first number times the second number = ");
        return numberA * numberB;
    }

    public static String wordFlip(String wordA, String wordB) {
        System.out.println("The words flipped are ");
        return (wordB + " " + wordA);
    }

    public static double maxNum(double numberA, double numberB) {
        if (numberA > numberB) {
            return numberA;
        } else if (numberA < numberB) {
            return numberB;
        } else
            System.out.println("The numbers are equal.");
            return numberA + numberB;
        }


    }
