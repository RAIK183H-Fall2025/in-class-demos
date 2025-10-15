package edu.unl.raikes.objects;

public class Town {
    public String name;
    public String mayorsName;
    public double xCoord;
    public double yCoord;

    public Town(String name, String mayorsName, double xCoord, double yCoord) {
        this.name = name;
        this.mayorsName = mayorsName;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public static double distanceTo(Town town1, Town town2) {
        double xSquared = Math.pow(town2.xCoord - town1.xCoord, 2);
        double ySquared = Math.pow(town2.yCoord - town1.yCoord, 2);
        return Math.sqrt(ySquared + xSquared);
    }

    public double distanceTo(Town otherTown) {
        double xSquared = Math.pow(this.xCoord - otherTown.xCoord, 2);
        double ySquared = Math.pow(this.yCoord - otherTown.yCoord, 2);
        return Math.sqrt(ySquared + xSquared);
    }

}
