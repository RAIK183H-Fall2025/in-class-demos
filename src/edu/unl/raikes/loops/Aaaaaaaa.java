package edu.unl.raikes.loops;

public class Aaaaaaaa {
    public static void main(String[] args) {
        printAs(8);
        System.out.println();
        printAs(7);
        System.out.println();
        printAs(4);
        System.out.println();
        printAs(3);
    }

    public static void printAs(int size) {
        // Take a look at this image of graph paper:
        // https://tinyurl.com/graph-paper-image
        // The graph paper has major lines (the darker ones) and minor lines (the
        // lighter ones).
        // The intersections of the minor lines make small cells in a small grid.
        // These small cells have a row number and a column number.
        // The intersections of the major lines make large cells in a large grid.
        // So we don't get confused, let's call the large cells "blocks,"
        // the large rows "stripes," and the large columns "towers."

        // loop through all of the rows in the small grid
        int totalRows = size * 3;
        for (int row = -1; row < totalRows + 1; row++) {
            // use integer division on the small-grid row to get
            // the number of the stripe (the rows of the big grid)
            int stripe = row / size;

            // at the start of a new row, print the left border
            System.out.print("|");

            // loop through all of the columns in the small grid
            for (int col = 0; col < 10 * size; col++) {
                int tower = col / size;
                // if the stripe is even, we want blank blocks on odd towers.
                // if odd, we want blank blocks on even towers.
                boolean isEmpty = (stripe % 2 == 0 && tower % 2 == 1) || (stripe % 2 == 1 && tower % 2 == 0);

                // if this tower is on the right side solid-fill area
                boolean isSolidZone = tower >= 5;

                // actually print the appropriate char
                if (isSolidZone && stripe % 2 == 0) { // if this is in the right-side solid area and an even stripe
                    System.out.print("%");
                } else if (isSolidZone && stripe % 2 == 1) { // if we're in the right-side solid area and an odd stripe
                    System.out.print("+");
                } else if (isEmpty) { // if we're in the star area but the block should be empty
                    System.out.print(".");
                } else { // if this is in the star area and the block should be an A
                    System.out.print(getAPixel(row % size, col % size, size));
                }
            }

            // at the end of the row, print the right border
            System.out.println("|");
        }
    }

    public static String getAPixel(int row, int col, int size) {
        int oneIfEven = (size + 1) % 2;
        int center = (size - 1) / 2;
        boolean isBar = row == center;
        boolean isLeg = (col == 0 || col == size - 1) && row > center;
        boolean isLeftUpline = row < center && col == center - row;
        boolean isRightUpline = row < center && col == center + row + oneIfEven;

        if (isBar || isLeg || isLeftUpline || isRightUpline) {
            return "*";
        } else {
            return ".";
        }
    }
}
