package Homework_gb;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        Action[] member = new Action[3];
        member[0] = new Human("Vasya", 5, 3);
        member[1] = new Cat("Barsik", 2, 1);
        member[2] = new Robot("05Fe", 20, 10);

        Obstacle[] obstacle = new Obstacle[5];

        for (int i = 0; i < obstacle.length; i++) {
            int distance = rand.nextInt(20);
            int height = rand.nextInt(10);
            boolean whichObstacle = rand.nextBoolean();
            if (whichObstacle) {
                obstacle[i] = new Track("Track " + i, distance);
            } else {
                obstacle[i] = new Wall("Wall " + i, height);
            }
        }
        for (int i = 0; i < member.length; i++) {
            boolean result = true;
            for (int j = 0; j < obstacle.length; j++) {
                result = obstacle[j].move(member[i]);

                if (!result) {
                    break;
                }
            }
            if (result) {
                System.out.println("Win!!!");
            } else {
                System.out.println("Defeat :(");
            }
        }
    }
}
