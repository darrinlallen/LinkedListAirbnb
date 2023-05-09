package Enumerations;

import java.util.Random;

public enum RandomVal {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);

    private final int value;

    private RandomVal(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static RandomVal getRandom() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}

