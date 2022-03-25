package com.quedacoder;

public class Main {

    public static void main(String[] args) {

        String durationString = getDurationString(89, 54);
        System.out.println(durationString);
        durationString = getDurationString(320, 80);
        System.out.println(durationString);
        durationString = getDurationString(0, 0);
        System.out.println(durationString);
        durationString = getDurationString(3670);
        System.out.println(durationString);
        durationString = getDurationString(3660);
        System.out.println(durationString);
        durationString = getDurationString(39600);
        System.out.println(durationString);

    }

    public static String getDurationString(int minutes, int seconds) {

        String durationString = "Invalid value";
        int numberOfHoursTotal = 0;
        int numberOfMinutesTotal = 0;

        // parameter validation checks
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {

            // Calculation for minutes to hours
            if (minutes <= 59) { // if minutes is 59 or less add to minutes
                numberOfMinutesTotal += minutes;
            } else if ( minutes > 59 ) { // if minutes is greater than 59 calculate number of hours
                numberOfHoursTotal = minutes / 60;
                int remainderInMinutes = minutes % 60;
                numberOfMinutesTotal += remainderInMinutes;
            }

            // build output string
            durationString = String.format("%02dh %02dm %02ds", numberOfHoursTotal, numberOfMinutesTotal, seconds);
        }

        return durationString;
    }

    public static String getDurationString(int seconds) {

        String durationString = "Invalid value";

        if (seconds >= 0) {

            if (seconds == 0) {
                durationString = getDurationString(0, seconds);
            } else if (seconds < 59) {
                durationString = getDurationString(0, seconds);
            } else {
                int minutes = seconds / 60;
                int secondsRemainder = seconds % 60;
                durationString = getDurationString(minutes, secondsRemainder);
            }
        }

        return durationString;
    }
}
