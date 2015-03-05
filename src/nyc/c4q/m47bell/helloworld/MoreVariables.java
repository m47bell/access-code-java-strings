package nyc.c4q.m47bell.helloworld;

/**
 * Created by c4q-marbella on 3/4/15.
 */
public class MoreVariables {
    public static void main( String [] args )
    {
        String Name, Eyes, Teeth, Hair;
        int Age, Height, Weight;
        double weightInKilos, heightInCm;

Name = "Zed A. Shaw";
        Age = 35; //not a lie
        Height = 74;  // inches
        Weight = 180; // lbs
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";
        weightInKilos = Math.round (Weight * 2.2);
        heightInCm = Math.round (Height * 2.54);



        System.out.println( "Let's talk about " + Name + "." );
        System.out.println( "He's " + Height + " inches tall." );
        System.out.println( "He's " + Weight + " pounds heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair." );
        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight
                + " I get " + (Age + Height + Weight) + "." );


       // write some variables that convert the inches and pounds to centimeters and kilos
System.out.println("His height in centimeters is: " + heightInCm  + " and his weight in kilos is: " + weightInKilos );



        
    }

}
