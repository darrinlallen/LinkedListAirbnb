// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import com.clone.Entity.*;
import com.clone.Exceptions.FlagReasonException;
import com.clone.Exceptions.FlagWriteFileException;//
//import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;


public class Main {

//    private static Logger logger = Logger.getLogger(Main.class);


    public static void main(String[] args) throws IOException, NumberFormatException, FlagReasonException, FlagWriteFileException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
 //       logger.info("AirBNB clone");


//////////////////////            create listing//////////////////////////////////////////////////
        Listing California1 = new Listing("111 south 8th street, orange county, CA");
        Listing California2 = new Listing("1081 brown street, beverly hills, CA");
        Listing California3 = new Listing("1521 north red avenue, California");
        Listing California4 = new Listing("9 east carson ave, California");
        Listing California5 = new Listing("1010 W. 3rd street, sacremento california");

//////////////////////////////////////////////////////////////////////////////////////////




/////////////////////Create owners ////////////////////////////////////////////////////////////////
        Owner Darrin = new Owner("darrin", "darrin.allen@gmail.com" , California1);
        System.out.println("user name: " + Darrin.getName());

        Owner Sam = new Owner("Sammy", "sam@gmail.com", California3);
        System.out.println("user name: " + Sam.getName());

        Owner Brett = new Owner("brett", "brett@yahoo.com", California4);
        System.out.println("user name: " + Brett.getName());

        Owner Sara = new Owner("Sara", "sara@yaoo.com", California4);
        System.out.println("user name: " + Sara.getName());

        Owner Emitt = new Owner("emitt", "emitt@yahoo.com", California5);
        System.out.println("user name: " + Emitt.getName());

////////////////////////////////////  Homes   //////////////////////////////////////////////
Homes home1 = new Homes(Darrin, California1, "May", "June" );

///////////////////////////////   Cabin  ////////////////////////////////////////
Cabin cabin1 = new Cabin(Sara, California2, "June", "july");



//////////////////////////////Mansion  ///////////////////////////////////////////////////

Mansion mansion1 = new Mansion(Sam, California4);




//////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////      equals           ////////////////////////////////////////////////////

        Chatroom john = new Chatroom("john", "xyz");
        Chatroom sam = new Chatroom("johnny", "xyz");
        System.out.println("john equals sam" + john.equals(sam));

/////////////////////////////////////////////////////////////////////////////////



        Message test = new Message("darrin", "lucy", "hello");
        System.out.println("hashcode " + Objects.hashCode(test));

        Review firstHouse = new Review(Darrin,
                "this is a great one",
                "9", new int[]{1, 2, 3, 4, 5});
        System.out.println("first house ratings: " + firstHouse.getRating());
        //  Writing exception to file



        Chatroom.testExcept();
        Cancellation.flagReason("Robert", "none given");
        flagWriteFile();
    }
    public static void flagWriteFile() throws FlagWriteFileException, IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files.txt"));
        ) {
            writer.write("This is my test file from Main");
            System.out.println("This is my test file from main");

        }
        catch (IOException e){
            throw new FlagWriteFileException("file not open");
        }
        finally {
            System.out.println("This is my test file from main");
        }
    }
}