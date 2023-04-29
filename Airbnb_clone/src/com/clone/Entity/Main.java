// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package com.clone.Entity;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

import com.clone.Exceptions.FlagReasonException;
import com.clone.Exceptions.FlagWriteFileException;
import org.apache.log4j.Logger;


public class Main {

    private static Logger logger = Logger.getLogger(Main.class);


    public static void main(String[] args) throws IOException, NumberFormatException, FlagReasonException, FlagWriteFileException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        logger.info("AirBNB clone");


        User Darrin = new User("darrin", "darrin.allen@gmail.com", "passw0rd");
        System.out.println("user name: " + Darrin.getName());

        Cancellation lilly = new Cancellation("lilly", "novacation");
        System.out.println("name " +lilly);

        Chatroom john = new Chatroom("john", "xyz");
        Chatroom sam = new Chatroom("johnny", "xyz");
        System.out.println("john equals sam" + john.equals(sam));

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