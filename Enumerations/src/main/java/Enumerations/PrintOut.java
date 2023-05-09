package Enumerations;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public enum PrintOut {
    APPLE, PEAR, ORANGE, WATERMELLON;
    private static final Logger logger = LogManager.getLogger(PrintOut.class);
    public static PrintOut[] fruit = new PrintOut[]{PrintOut.APPLE, PrintOut.ORANGE, PrintOut.PEAR, PrintOut.WATERMELLON};


    public static Object getFruit() {
        for (var i = 0; i < 3; i++) {
            logger.info(fruit[i]);
        }
return null;
    }
}