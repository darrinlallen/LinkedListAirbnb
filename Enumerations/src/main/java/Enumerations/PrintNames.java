package Enumerations;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum PrintNames {ADAM,MICHAEL,DARRIN,SCOTT;
    private static final Logger logger = LogManager.getLogger(PrintNames.class);
    private static PrintNames[] letters = new PrintNames[]{PrintNames.ADAM, PrintNames.SCOTT, PrintNames.MICHAEL, PrintNames.DARRIN};
    private static PrintNames[] sorted = letters;

    public static Object getSort() {

        sorted[0] = PrintNames.DARRIN;
        sorted[1] = PrintNames.MICHAEL;
        sorted[2] = PrintNames.SCOTT;
        sorted[3] = PrintNames.ADAM;

        for (var i = 0; i < 4; i++) {
            logger.info(sorted[i]);
        }
        return null;
    }
}

