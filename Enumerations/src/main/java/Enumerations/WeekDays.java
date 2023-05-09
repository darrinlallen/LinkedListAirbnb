package Enumerations;

import org.apache.log4j.BasicConfigurator;

import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDY;
    private static final Logger logger = LogManager.getLogger(WeekDays.class);






    public static Object getDay() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        logger.info("Enter number between 0-7 ");

        int weekDay = myObj.nextInt();  // Read user input

        if (weekDay == 0){
            logger.info("day0 you selected is    " + WeekDays.SUNDY);
        } else if (weekDay ==2) {
            logger.info("day0 you selected is    " + WeekDays.TUESDAY);

        }
        else if  (weekDay ==1){
            logger.info("day1 you selected is    " + WeekDays.MONDAY);

        }
        else if  (weekDay ==3){
            logger.info("You selected :" + WeekDays.WEDNESDAY);
        }
        else if  (weekDay ==4){
            logger.info("You selected :" + WeekDays.THURSDAY);
        }
        else if  (weekDay ==5){
            logger.info("You selected :" + WeekDays.FRIDAY);
        }
        else if  (weekDay ==6){
            logger.info("You selected :" + WeekDays.SATURDAY);
        }

        else logger.info("number 0-7");
        return null;
    }
}
