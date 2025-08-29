package edu.unl.raikes.variables;

import java.util.Scanner;

public class MagicTrick {
    public static void main(String[] args) {
        // We’ll ask the user to enter an integer
        Scanner scnr = new Scanner(System.in);

        // Ask the user to enter an integer
        System.out.println("Enter an integer: ");
        int myNumber = scnr.nextInt();
        int magicNumber = myNumber;

        // Add 4, then multiply the result by 4.
        magicNumber = magicNumber + 4;
        magicNumber = magicNumber * 4;

        // Subtract 8,
        magicNumber = magicNumber - 8;
        // then divide the result by 4.
        magicNumber = magicNumber / 4;
        // Finally subtract your original secret number.
        magicNumber = magicNumber - myNumber;

        // The answer is always 2.
        System.out.println("The answer is always 2.");
        System.out.println("The answer is: " + magicNumber);

        scnr.close();
    }
}
