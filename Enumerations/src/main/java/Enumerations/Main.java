package Enumerations;



import org.apache.log4j.BasicConfigurator;


public class Main {


    public static void main(String[] args) {
        BasicConfigurator.configure();

        WeekDays.getDay();
        PrintOut.getFruit();
        AddNums.getTotal();
        PrintNames.getSort();
        RandomVal randomEnum = RandomVal.getRandom();
        System.out.println("Random enum value: " + randomEnum + ", integer value: " + randomEnum.getValue());
    }
    }
