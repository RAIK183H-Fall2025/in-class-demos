package edu.unl.raikes.loops;

public class Misc {
    public static void main(String[] args) {
        // get int from user
        int size = 3;
        printA(8);
        System.out.println();
        printA(7);
        System.out.println();
        printA(4);
        System.out.println();
        printA(3);
    }

    public static void printA(int size) {
        int center = (size - 1) / 2;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                boolean isBar = row == center;
                boolean isLeg = (col == 0 || col == size - 1) && row > center;
                boolean isLeftUpline = row < center && col == center - row;
                boolean isRightUpline = row < center && col > center && size - row + col == center;

                if (isBar || isLeg || isLeftUpline || isRightUpline) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
