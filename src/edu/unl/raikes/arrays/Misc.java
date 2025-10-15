package edu.unl.raikes.arrays;

import java.util.Arrays;
import java.util.Scanner;

import edu.unl.raikes.inputvalidation.InputValidation;

public class Misc {
    public static void main(String[] args) {
        // String[][] strTable = new String[5][8];
        // System.out.print(strTable.length + " ");
        // System.out.print(strTable[0].length + " ");
        // strTable[2][3] = "monday morning";
        // System.out.print(strTable[2][3].length());

        // int[] a = { 1, 7, 5, 6, 4, 14, 11 };
        // for (int i = 0; i < a.length - 1; i++) {
        // if (a[i] > a[i + 1]) {
        // a[i + 1] = a[i + 1] * 2;
        // }
        // }
        // System.out.println(Arrays.toString(a));

        int numDays = 7;
        int numChildren = 5;
        int numMeasurementsPerDay = 3;

        double[][][] measurements = new double[numChildren][numDays][numMeasurementsPerDay];
        Scanner scnr = new Scanner(System.in);

        for (int dayNum = 0; dayNum < measurements[0].length; dayNum++) {
            System.out.println("Starting day number: " + (dayNum + 1));

            for (int childNum = 0; childNum < measurements.length; childNum++) {
                System.out.println("  Child # " + childNum);

                for (int ___; ___ < measurements[childNum][dayNum].length; __++) {
                    InputValidation.queryDouble(scnr,
                            "      What's the length of child " + childNum + " today (measurement " + measurementNum
                                    + ")?");

                }
            }
        }

    }
}
