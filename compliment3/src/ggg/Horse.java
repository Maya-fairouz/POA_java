package ggg;

import java.util.Random;

class Horse extends Thread {
    private String name;
    private int minSpeed;
    private int maxSpeed;
    private int distance;

    public Horse(String name, int minSpeed, int maxSpeed) {
        this.name = name;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.distance = 0;
    }
  
    public int getDistance() {
        return distance;
    }

    @Override
    public void run() {
        Random rand = new Random();
        while (distance < 5000) {
            // Calculate the speed of the horse using the min and max speed values
            int speed = minSpeed + (int)((maxSpeed - minSpeed) * rand.nextDouble());
            distance += speed;

            // Display the name of the horse every 200 meters
            if (distance % 200 == 0) {
                System.out.println(name + " is at " + distance + " meters.");
            }

            // Sleep for 1 second
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}