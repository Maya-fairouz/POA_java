package ggg;


public class HorseRace {
    public static void main(String[] args) {
        // Number of horses in the race
        int n = 10;
        // Array to store the Horse objects
        Horse[] horses = new Horse[n];

        // Create Horse objects
        for (int i = 0; i < n; i++) {
            String name = "CH" + (i + 1);
            int minSpeed = 10;
            int maxSpeed = 20;
            horses[i] = new Horse(name, minSpeed, maxSpeed);
        }

        // Start the race
        for (Horse horse : horses) {
            horse.start();
        }

        // Wait for the race to finish
        for (Horse horse : horses) {
            try {
                horse.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Display the finishing order
        System.out.println("Finishing order:");
        for (Horse horse : horses) {
            System.out.println(horse.getName() + ": " + horse.getDistance() + " meters");
        }
    }
}