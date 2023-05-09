package Enumerations;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

    public enum AddNums {
        PENNY, NICKEL, DIME, QUARTER;
        private static final Logger logger = LogManager.getLogger(AddNums.class);
        private static AddNums[] currency = new AddNums[]{AddNums.QUARTER, AddNums.PENNY, AddNums.NICKEL, AddNums.DIME};
        private static int total;

        public static Object getTotal() {
            for (var i = 0; i < 3; i++) {
                if (currency[i] == AddNums.DIME) {
                    total += 10;

                } else if (currency[i] == AddNums.PENNY) {
                    total += 1;
                } else if (currency[i] == AddNums.NICKEL) {
                    total += 5;
                } else if (currency[i] == AddNums.QUARTER) {
                    total += 25;
                }
            }
            logger.info(total);
            return null;
        }
    }