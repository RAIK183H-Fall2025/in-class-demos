package edu.unl.raikes.conditionals;

public class Misc {
    public static void main(String[] args) {
        System.out.println(round(-234.49)); // expect: -234
        System.out.println(round(234.49)); // expect: 234
        System.out.println(round(-234.51)); // expect: -235
        System.out.println(round(234.51)); // expect: 235
        System.out.println(round(0)); // 0
    }

    public static int round(double value) {
        boolean shouldRound = Math.abs(value % 1) >= .5;
        if (shouldRound && value > 0) {
            return (int) Math.ceil(value);
        } else if (shouldRound && value < 0) {
            return (int) Math.floor(value);
        } else {
            return (int) value;
        }
    }
}
