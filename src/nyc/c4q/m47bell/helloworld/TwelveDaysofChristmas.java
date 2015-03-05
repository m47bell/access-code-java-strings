package nyc.c4q.m47bell.helloworld;

/**
 * Created by c4q-marbella on 3/3/15.
 */
public class TwelveDaysofChristmas {
    public static void main (String [] args)

    {


        //chorus1 is On the... string
        String Chorus1 = "On the ";

        //declaring the number of x-mas day
        int NumDay = 1;


        //chorus 2 is of Christmas my true love sent to me
        String Chorus2 = " day of Christmas my true love sent to me\n";

        // first stanza
        String FirstStanza = " a Partridge in a Pear Tree.\n";

        String SecondStanza = "Two Turtle Doves\n";

        String ThirdStanza = "Three French Hens\n";


        String FourthStanza = "Four Calling Birds\n";

        String FifthStanza = "Five Gold Rings\n";

        String SixthStanza = "Six Geese a-Laying\n";


        String SevenStanza = "Seven Swans a-Swimming\n";

        String EightStanza = "Eight Maids a-Milking\n";

        String NinthStanza = " Nine Ladies Dancing\n";


        String TenthStanza = "Ten Lords a-Leaping\n";

        String EleventhStanza = "Eleven pipers Piping\n";

        String lastStanza = "Twelve Drummers Drumming\n";




        System.out.println(Chorus1 + (NumDay++) + "st" + Chorus2 + FirstStanza );
        System.out.println(Chorus1 + (NumDay++) + "nd" + Chorus2 + SecondStanza + "and " + FirstStanza );
        System.out.println(Chorus1 + (NumDay++) + "rd" + Chorus2 + ThirdStanza + SecondStanza + "and" + FirstStanza );

        System.out.println(Chorus1 + (NumDay++) + "th" + Chorus2 + FourthStanza + ThirdStanza + SecondStanza + "and" + FirstStanza );
        System.out.println(Chorus1 + (NumDay++) + "th" + Chorus2 + FifthStanza + FourthStanza + ThirdStanza + SecondStanza + "and" + FirstStanza );
        System.out.println(Chorus1 + (NumDay++) + "th" + Chorus2 + SixthStanza + FifthStanza + FourthStanza + ThirdStanza + SecondStanza + "and" + FirstStanza );


        System.out.println(Chorus1 + (NumDay++) + "th" + Chorus2 + SevenStanza + SixthStanza + FifthStanza + FourthStanza + ThirdStanza + SecondStanza + "and" + FirstStanza );
        System.out.println(Chorus1 + (NumDay++) + "th" + Chorus2 + EightStanza + SevenStanza +SixthStanza + FifthStanza
                + FourthStanza + ThirdStanza + SecondStanza + "and" + FirstStanza );
        System.out.println(Chorus1 + (NumDay++) + "th" + Chorus2 + NinthStanza +EightStanza + SevenStanza +SixthStanza + FifthStanza
                + FourthStanza + ThirdStanza + SecondStanza + "and" + FirstStanza );


        System.out.println(Chorus1 + (NumDay++) + "th" + Chorus2 + TenthStanza + NinthStanza +EightStanza + SevenStanza +SixthStanza + FifthStanza
                + FourthStanza + ThirdStanza + SecondStanza + "and" + FirstStanza );

        System.out.println(Chorus1 + (NumDay++) + "th" + Chorus2 + EleventhStanza + TenthStanza + NinthStanza +EightStanza + SevenStanza +SixthStanza + FifthStanza
                + FourthStanza + ThirdStanza + SecondStanza + "and" + FirstStanza );

        System.out.println(Chorus1 + (NumDay++) + "th" + Chorus2 + lastStanza + EleventhStanza + TenthStanza + NinthStanza +EightStanza + SevenStanza +SixthStanza + FifthStanza
                + FourthStanza + ThirdStanza + SecondStanza + "and" + FirstStanza );






    }



}
