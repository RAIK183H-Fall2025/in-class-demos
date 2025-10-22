package edu.unl.raikes.objects;

public class ZombieInvasion {
    public static void main(String[] args) {
        int townIndex = 0;

        Town[] towns = new Town[24]; // 🪄🎩✨
        towns[townIndex++] = new Town("Jeffreyville", "Adam Britten", 0, 0);

        // Olivia and Autumn
        towns[townIndex++] = new Town("SnoopyTown", "Charlie Brown", 19, 21);

        // Ripley and Alyn
        towns[townIndex++] = new Town("Columbusville", "Jim Bulkley", 21.24, 55.0);

        // Alexandra and Sandi
        towns[townIndex++] = new Town("Esthers Escape", "Stephanie Valentine", 66, 67);

        // Allie and Keerthana
        towns[townIndex++] = new Town("Steve’s Coop", "Steve Cooper", 20.25, 25.20);

        // Aruneem and Poppy
        towns[townIndex++] = new Town("Raikesburg", "Theresa Arneal", 22.0, 67.0);

        // Micah and Eli
        towns[townIndex++] = new Town("Ogotown", "Anderson Ibe-Ikechi", 6.0, 7.0);

        // Timofei and Tony’s Town
        towns[townIndex++] = new Town("Niermanville", "Caleb Nierman", 4.2, 7.5);

        // Julia and Krithik
        towns[townIndex++] = new Town("New Jett City", "Mr. Smeal", 167.5, 167.3);

        // Heidi and Mason
        towns[townIndex++] = new Town("Quahog", "Lois Griffin", 1000000, 1000000.67);

        // Jett and Lauren
        towns[townIndex++] = new Town("Ferdaville", "Zach Zeien", 41.41, 67.67);

        // Anderson and Caleb’s Town
        towns[townIndex++] = new Town("Smartville", "Guido van Rossum", 1e67, 1e41);

        // Jared and Leo
        towns[townIndex++] = new Town("Jesus-Town", "The Pope", -1e67, -1e41);

        // Liam and Henry
        towns[townIndex++] = new Town("Theresatown", "Theresa Arneal", Double.MAX_VALUE, -Double.MAX_VALUE);

        // Austin and Owen
        towns[townIndex++] = new Town("Scranton", "Dwight Schrute", 6.7, -6.7);

        // Craig and Nathan
        towns[townIndex++] = new Town("Edwardville", "J.D. Edwards", 0.67, 0.67);

        // Leah and Jessica
        towns[townIndex++] = new Town("Jelleah", "Jessica", 4, 23);

        // Finn and Matthew
        towns[townIndex++] = new Town("Finburg", "Adam Matterson", Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);

        // Sophie and Alex
        towns[townIndex++] = new Town("PolsluisPalace", "Seth Polslui", 67, 6.7);

        // Ningyun and Carrie
        towns[townIndex++] = new Town("Carrieville", "Ningyun Hu", 3.0, 15.0);

        // Ananya and Phoebe’s Town
        towns[townIndex++] = new Town("Phanyadin", "Mirle Raikes", 6767.6767, 42);

        // Matt and Hank
        towns[townIndex++] = new Town("Matland", "Matthew McConaughey", 16.2, 14.5);

        // Val's area
        towns[townIndex++] = new Town("Giesentine", 67, 14);

        // Showcasing the best constructor
        towns[townIndex++] = new Town("Vectorburg", 1.0f, Math.random() * Math.PI * 2f);
        String mayorsName = towns[0].getName();
        mayorsName.toUpperCase();
        // muahahahahaha - the power is all mine!!!";

        // for each town

        for (Town town : towns) {

            // calculate distances
            double distance = towns[0].distanceTo(town);
            String distanceString = String.format("%.3f", distance);

            // convert distances to times for when the zombies will arrive
            System.out
                    .println("eeek! " + town + " you are " + distanceString + " mile(s) from " + towns[0].getName()
                            + " and will be overwrought by zombies in *some amount of time*!");

            // notify
        }

    }
}
