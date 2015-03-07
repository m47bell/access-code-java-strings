package nyc.c4q.m47bell.helloworld;

/**
 * Created by c4q-marbella on 3/5/15.
 * Access Code 2.1
 * Marbella Vidals, Joshelyn
 * ForgetfulMachine.java
 * Exercise on user input
 *
 */


import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me a word! ");

        String firstWord = keyboard.nextLine();

        System.out.println(firstWord);


        System.out.println("Give me a second word!");

        String secondWord = keyboard.nextLine();

        System.out.println(secondWord);


        System.out.println("Great,now your favorite number? ");

        int favNum = keyboard.nextInt();

        System.out.println(favNum);


        System.out.println("And your second-favorite number...");

        int secNum = keyboard.nextInt();

        System.out.println(secNum);


        System.out.println("Whew! Wasn't that fun?");





    }





}
