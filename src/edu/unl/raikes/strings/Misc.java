package edu.unl.raikes.strings;

import java.util.Scanner;

public class Misc {
    public static void main(String[] args) {

        System.out.printf("%+-,19.5f\n" + "something", Math.PI * 1000);
        System.out.printf("%+,19.5f\n", Math.PI * 1000);

        Scanner scnr = new Scanner(System.in);
        String s1 = "Olivia Scott";
        String s2 = "Isabelle Scott";
        System.out.println(s2.length());
        scnr.nextLine();
        System.out.println(s1.indexOf("e"));
        scnr.nextLine();
        System.out.println(s2.indexOf("e"));
        scnr.nextLine();
        System.out.println(s1.substring(7, 10));
        scnr.nextLine();
        String s3 = s2.substring(4, 10);
        System.out.println(s3.toLowerCase());
    }
}
