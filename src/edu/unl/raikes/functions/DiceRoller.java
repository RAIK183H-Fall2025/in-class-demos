package edu.unl.raikes.functions;

import java.util.Scanner;

public class DiceRoller {
    /**
     * Plays a fun, two-player dice game.
     * 
     * @param args This program does not accept any command line arguments.
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // get the player's names
        String player1Name = getPlayerNameFromUser(scnr, "Hey-oh! What's your name player 1? ", "Welcome, ");
        String player2Name = getPlayerNameFromUser(scnr, "Cheerio! What's your name player 2? ", "Bienvenidos, ");
        System.out.println();

        // get dice rolls for each player
        int player1Die1 = rollDice(scnr, player1Name);
        int player2Die1 = rollDice(scnr, player2Name);
        int player1Die2 = rollDice(scnr, player1Name);
        int player2Die2 = rollDice(scnr, player2Name);
        int player1Die3 = rollDice(scnr, player1Name);
        int player2Die3 = rollDice(scnr, player2Name);

        System.out.println("---------------------------------------");
        System.out.println("Final Results");
        System.out.println();

        int player1Sum = calculateResults(player1Die1, player1Die2, player1Die3, player1Name);
        int player2Sum = calculateResults(player2Die1, player2Die2, player2Die3, player2Name);

        if (player1Sum > player2Sum) {
            System.out.println("Congrats, " + player1Name + "!!!");
        } else if (player1Sum == player2Sum) {
            System.out.println("Ohhhhhhh, it's a tie!");
        } else { // player 2 wins
            System.out.println("Awesome, " + player2Name + "! Well done!");
        }

        scnr.close();
    }

    public static String getPlayerNameFromUser(Scanner methodScnr, String greeting, String welcome) {
        System.out.print(greeting);
        String playerName = methodScnr.nextLine();
        System.out.println(welcome + playerName);
        return playerName;
    }

    /**
     * Roll a die for a particular user.
     * 
     * @param methodScnr The way to get the user input.
     * @param playerName The player that will be rolling.
     * @return The value of the die that the user rolled.
     */
    public static int rollDice(Scanner methodScnr, String playerName) {
        System.out.print(playerName + ", roll your die! (Press ENTER!)");
        methodScnr.nextLine();

        final int DIE_SIDES = 6;
        int playerDie = (int) (Math.random() * DIE_SIDES + 1);
        System.out.println("🎲 " + playerName + " rolled " + playerDie);
        System.out.println();

        return playerDie;
    }

    /**
     * Print the results to the console.
     * 
     * @param die1       First die roll from the player.
     * @param die2       Second die roll from the player.
     * @param die3       Third die roll from the player.
     * @param playerName
     * @return
     */
    public static int calculateResults(int die1, int die2, int die3, String playerName) {
        System.out.println(playerName + " rolled 🎲 " + die1 + " | 🎲 " + die2 + " | 🎲 " + die3);

        int sum = die1 + die2 + die3;
        System.out.println(playerName + "'s sum is " + sum);

        System.out.println();

        return sum;
    }
}
