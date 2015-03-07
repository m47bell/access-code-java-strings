package nyc.c4q.m47bell.helloworld;

/**
 * Created by c4q-marbella on 3/5/15.
 *
 * Access Code 2.1
 * Marbella Vidals, Joshelyn Vivas
 * ForgetfulMachine.java
 * Exercise on user input
 */

import java.text.DecimalFormat;
import java.util.Scanner;
public class BMICalc {
    public static void main(String[] args){

        double height;
        double weight;
        double answer;

        Scanner input = new Scanner(System.in);

        System.out.println("Your height in m:");
        height= input.nextDouble();


        System.out.println("Your weight in kg: ");
        weight= input.nextDouble();


      //math.pow (base,exponent) to write exponents or square
        answer = (weight/Math.pow (height, 2));


        // used to round answer to 5 significant digits
        DecimalFormat df = new DecimalFormat("##.#####");

        df.format(answer);


        System.out.println("Your BMI is " + df.format(answer));







    }

}
