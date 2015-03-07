package nyc.c4q.m47bell.helloworld;

/**
 * Created by c4q-marbella on 3/5/15.
 * Access Code 2.1
 * Marbella Vidals
 * Echo.java
 * Examples about prompting user input
 */

import java.util.Scanner;

public class Echo {
    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please say something. ");


        //next is a function..will only pick up one string.
        //String something = keyboard.next();

        //prints out the whole line- multiple strings
        String something = keyboard.nextLine();

        System.out.println(something);






    }


}
