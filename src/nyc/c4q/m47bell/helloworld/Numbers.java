package nyc.c4q.m47bell.helloworld;

/**
 * Created by c4q-marbella on 3/1/15.
 */
public class Numbers {

    public static void main(String[] args)
    {

        System.out.println(42);
        System.out.println("42");

        System.out.println(42.0);//integer
        System.out.println(42.0000);//float
        System.out.println("42.0000");//string
        System.out.println(41.999999999999999) ;   // float fifteen 9's
        System.out.println("41.999999999999999\n\n");//string

        System.out.println(17 + 25);//will first compute and prints out result
        System.out.println("17" + "25");//combine two strings
        System.out.println("17" + 25);//combines one string (17) to one integer
        System.out.println(17 + "25");//combines one integer and one string

    }

}
