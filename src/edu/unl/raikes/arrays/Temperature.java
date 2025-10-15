package edu.unl.raikes.arrays;

import java.util.Arrays;
import java.util.Scanner;
import edu.unl.raikes.inputvalidation.InputValidation;

public class Temperature {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // get the number of temperatures from the user
        int totalDays = InputValidation.queryInt(
                scnr,
                "How many days of temperatures do you want to collect?",
                "That's not an int, please enter an int temperature");

        // declare array with size of days
        double[] recordedTemperatures = new double[totalDays];
        double sum = 0.0;

        // loop datesTemperatures times, prompt and save into array.
        for (int day = 0; day < recordedTemperatures.length; day++) {
            // prompt
            recordedTemperatures[day] = InputValidation.queryDouble(
                    scnr,
                    "Day " + (day + 1) + "'s high temp:",
                    "That's not a a double. Please enter a double temperature.");
            sum += recordedTemperatures[day];
        }

        // share average
        double average = sum / recordedTemperatures.length;
        System.out.println("the avg is : " + average);

        // how many days were above average?
        int daysAboveAverage = 0;
        for (int day = 0; day < recordedTemperatures.length; day++) {
            if (recordedTemperatures[day] > average) {
                daysAboveAverage++;
            }
        }

        System.out.println("days above average : " + daysAboveAverage);
        System.out.println(Arrays.toString(recordedTemperatures));
    }
}
