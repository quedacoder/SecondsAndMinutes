package com.quedacoder;

public class Main {

    // Constants definitions
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    private static final long VALUE_60_FOR_CALCULATION = 60L;

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    public static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / VALUE_60_FOR_CALCULATION;
        long remainingMinutes = minutes % VALUE_60_FOR_CALCULATION;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / VALUE_60_FOR_CALCULATION;
        long remainingSeconds = seconds % VALUE_60_FOR_CALCULATION;

        return getDurationString(minutes, remainingSeconds);
    }
}
