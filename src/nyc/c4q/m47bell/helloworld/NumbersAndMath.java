package nyc.c4q.m47bell.helloworld;

/**
 * Created by c4q-marbella on 3/3/15.
 */
public class NumbersAndMath {
    public static void main (String [] args)
    {

        //prints out string of I will now count my chickens
        System.out.println( "I will now count my chickens:" );

        //prints number of hens
        System.out.println( "Hens " + ( 25 + 30 / 6 ));

//prints number of roosters
        System.out.println( "Roosters " + ( 100 - 25 * 3 % 4 ));


        //prints out string of Now I will count the eggs
        System.out.println( "Now I will count the eggs:" );


        //order of operations
        System.out.println( 3 + 2+ 1 - 5 +4 % 2 - 1 / 4 + 6 );

        //prints out string Is it true that 3 + 2 < 5 - 7?
        System.out.println( "Is it true that 3 + 2 < 5 - 7?");

        System.out.println( 3 + 2 < 5 - 7);

        System.out.println( "What is 3 + 2?" + (3 + 2));

        System.out.println("What is 5 - 7?" + (5 + 7));

        System.out.println( "Ohh, thats why its false.");

        System.out.println( "How about some more.");

        System.out.println( "Is it greater?" + ( 5 > -2 ) );

        System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
        System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
    }



}
