package nyc.c4q.m47bell.helloworld;

/**
 * Created by c4q-marbella on 3/5/15.
 */

import java.util.Scanner;
public class userAge {
    public static void main(String[] args) {

        int currAge;
        int futAge;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your current age: ");
        currAge = input.nextInt();

        futAge = currAge + 5;


        System.out.println("You are_" + currAge + "_years old. In five years, you will be_" + futAge + "_years old!");

    }
}