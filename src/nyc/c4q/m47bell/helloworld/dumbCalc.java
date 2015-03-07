package nyc.c4q.m47bell.helloworld;

import java.util.Scanner;

/**
 * Created by c4q-marbella on 3/5/15.
 *
 * Access Code 2.1
 * Marbella Vidals
 * ForgetfulMachine.java
 * Exercise on user input using doubles
 */

import java.util.Scanner;
public class dumbCalc {

    public static void main(String[] args) {


        //declaring variables, first, second, third numbers and scanner input
        double firstNum;
        double secNum;
        double thirdNum;
        double answer;
        Scanner input = new Scanner(System.in);


        //prompting user to enter first number
        System.out.println("What is your first Number?");

        //obtaining first number entered
        firstNum = input.nextDouble();



        System.out.println("What is your second number?");
        secNum = input.nextDouble();

        System.out.println("What is your third number?");
        thirdNum = input.nextDouble();

        answer = (firstNum + secNum + thirdNum) / 2;

        System.out.println("( " + firstNum + " + " + secNum + " + " + thirdNum + " ) / 2 is... " + answer);

    }
}
