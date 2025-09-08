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
        System.out.println("After adding 4, the result is: " + magicNumber);

        // Add 4, then multiply the result by 4.
        magicNumber = magicNumber * 4;
        System.out.println("After multiplying by 4, the result is: " + magicNumber);

        // Subtract 8,
        magicNumber = magicNumber - 8;
        System.out.println("After subtracting 8, the result is: " + magicNumber);

        // then divide the result by 4.
        magicNumber = magicNumber / 4;
        System.out.println("After dividing by 4, the result is: " + magicNumber);

        // Finally subtract your original secret number.
        magicNumber = magicNumber - myNumber;
        System.out.println("After subtracting the original number, the result is: " + magicNumber);

        // The answer is always 2.
        System.out.println("The answer is always 2.");
        System.out.println("The answer is: " + magicNumber);

        scnr.close();

        double x =  3.7 % 1.3;
        int y = -235435 % 7;
        int u = -235435 / 7;
        System.out.println("The answer is: " + y + " and " + u);
    }
}
