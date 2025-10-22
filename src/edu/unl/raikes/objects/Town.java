package edu.unl.raikes.objects;

public class Town {
    // secrets teehee
    private String name;
    private String mayorsName;
    private double xCoord;
    private double yCoord;
    private String superlative;
    

    public Town(String name, String mayorsName, double xCoord, double yCoord) {
        this.name = name;
        this.mayorsName = mayorsName;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public Town(String name, double xCoord, double yCoord) {
        this(name, null, xCoord, yCoord);
    }

    public Town(String name, float radius, float angle) {
        this(name, null, radius * Math.cos(angle), radius * Math.sin(angle));
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
// 
    // Matt and Autumn
    public String toString() {
        if (this.mayorsName == null && this.superlative == null) {
            return "The town: " + this.name + " has no mayor and no superlative";
        }
        if(this.superlative == null) {
            return "The town: " + this.name + " has the nicest mayor: " + this.mayorsName;
        }
        if(this.mayorsName == null) {
            return "The " + this.superlative + " town: " + this.name + " has no mayor"; 
        }
        return "The " + this.superlative + " town: " + this.name + " has the nicest mayor: " + this.mayorsName;
    }

// public Town(String name, double xCoord, double yCoord) {
    // this.name = name;
    // this.mayorsName = mayorsName;
    // this.xCoord = xCoord;
    // this.yCoord = yCoord;
    // }

    //

    // HANK AND KRITHIK
    // public Town(String name, double xCoord, double yCoord, ) {
    // this.name = name;
    // this.mayorsName = "hank";
    // this.xCoord = xCoord;
    // this.yCoord = yCoord;
    // }

    // // Allie and Anderson
    public Town(String name, int xCoord) {
        this(name, null, xCoord, 0.0);
    }

    // Alexandra and Olivia
    public Town(String name, String mayorsName, double xCoord, double yCoord, int population) {
        this(name, mayorsName, xCoord, yCoord);
        // this.population = population;
    }

    // SANDARIKA AND RITHVIKA
    // public Town(double yCoord, double xCoord, String mayorsName, String name)
    // }this.yCoord=yCoord;this.xCoord=xCoord;this.mayorsName=mayorsName;this.name=name;

    // Jett and Jared
    // public Town(String mayorsName, double xCoord, double yCoord) {
    // this(null, mayorsName, xCoord, yCoord);

    // Owen and Alex
    public Town(double xCoord, double yCoord) {
        this.name = null;
        this.mayorsName = null;
        this.xCoord = 33;
        this.yCoord = -67;
    }

    // Caleb & Maso
    public Town(int xCoord) {
        this("", "", xCoord, 67);
    }

    // LAUREN AND FINN
    public Town(String name, String mayorsName, double yCoord) {
        this.name = name;
        this.mayorsName = mayorsName;
        this.yCoord = yCoord;

    }

    // Keerthana & Heidi
    // public Town(String mayorsName, double xCoord, double yCoord) {
    // this.mayorsName = mayorsName;
    // this.xCoord = xCoord;
    // this.yCoord = yCoord;
    // //will return the mayor’s location lol
    // //ours is the coolest constructor
    // }

    // Autumn and Matthew
    // public Town(String name, String mayorsName, double xCoord, double yCoord) {
    // this.name = name;
    // this.mayorsName = mayorsName;
    // this.xCoord = xCoord;
    // this.yCoord = yCoord;
    // }

    // Leah and Eli
    // public Town(String name, String mayorsName, double xCoord, double yCoord) {
    // this.name = “New York”;
    // this.mayorsName = “Leah”;
    // this.xCoord = 250;
    // this.yCoord = 500;

    // }

    // Liam & Carrie
    public Town(String name, String mayorsName) {
        this(name, mayorsName, 0, 0);
    }

    // Poppy and Tony
    // public Town(String name) {
    // this.name = name;
    // }

    // Julia and Henry
    public Town(double yCoord) {
        this(null, null, 0, yCoord);
    }

    // Austin and Matthew
    // public Town(String townName, String mayorsName, double xCoord, double yCoord)
    // {
    // this.townName = townName;
    // this.mayorsName = mayorsName;
    // this.xCoord = xCoord;
    // this.yCoord = yCoord;
    // }

    // Nathan and Ananya
    // public Town(String name, String mayorsName, double xCoord, double yCoord) {
    // this.name = name;
    // this.mayorsName = mayorsName;
    // this.xCoord = xCoord;
    // this.yCoord = yCoord;
    // }

    // Craig and Leo
    // public Town(double xCoord, double yCoord) {
    // this.xCoord = xCoord;
    // this.yCoord = yCoord;
    // }

    public String getName() {
        return this.name;
    }
    
    public void setSuperlative(String superlative) {
        this.superlative = superlative;
    }

    public String getMayorsName() {
        return this.mayorsName;
    }

}