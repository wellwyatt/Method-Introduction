package com.LickingHeights;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String userName;
       Scanner keyboard;
        keyboard = new Scanner(System.in);
       Question();
       userName = keyboard.nextLine();
       printGreetings(userName);




    }
    public static void printGreetings (String userName){
    System.out.println("Hello "+ userName);

    }
   public static void Question(){

        System.out.println("What is your name?");

   }
   //public static void

}
