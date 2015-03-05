package nyc.c4q.m47bell.helloworld;

/**
 * Created by c4q-marbella on 3/3/15.
 */
public class VariablesandNames {

        public static void main( String[] args )
        {
            //Declaring cars, drivers etc. as integers
            int cars, drivers, passengers, cars_not_driven, cars_driven;

            //declaring space_in_a_car etc. as a double
            double space_in_a_car, carpool_capacity, average_passengers_per_car;

            //assigning values to ints and doubles
            cars = 100;//assiging value 100 to int cars
            space_in_a_car = 4.0;//assigning a value of 4.0 to a double space_in_a_car
            drivers = 30;//assiging value 30 to int drivers
            passengers = 90;//assiging value 90 to int passengers


            //assign a value/formula for cars_not_driven by subtracting cars - drivers;
            cars_not_driven = cars - drivers;

            //assigning the same value to drivers to cars_ driven
            cars_driven = drivers;
            //assigning a value/formula to carpool_capacity=cars_driven * space_in_a_car;

            carpool_capacity = cars_driven * space_in_a_car;
            //assigning a value/formula to average_passengers_per_car=passengers / cars_driven;
            average_passengers_per_car = passengers / cars_driven;

            //printing out qty of cars avail
            System.out.println( "There are " + cars + " cars available." );
            ////printingout qty of drivers avail
            System.out.println( "There are only " + drivers + " drivers available." );
            ////printingout qty of empty cars/not driven today
            System.out.println( "There will be " + cars_not_driven + " empty cars today." );
            //printing out number of people transported today
            System.out.println( "We can transport " + carpool_capacity + " people today." );
            //printing out the # of passengers carpooling today
            System.out.println( "We have " + passengers + " to carpool today." );

            //printing out # of ppl per car
            System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
        }
    }



