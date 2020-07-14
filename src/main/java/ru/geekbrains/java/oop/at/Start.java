package ru.geekbrains.java.oop.at;

import ru.geekbrains.java.oop.at.obstacles.Obstacle;
import ru.geekbrains.java.oop.at.obstacles.RunningTrack;
import ru.geekbrains.java.oop.at.obstacles.Wall;
import ru.geekbrains.java.oop.at.participants.Cat;
import ru.geekbrains.java.oop.at.participants.Human;
import ru.geekbrains.java.oop.at.participants.Robot;
import ru.geekbrains.java.oop.at.participants.Runner;

public class Start {
    public static void main(String[] args) {
        Runner catTom = new Cat("Tom", 10, 5);
        Runner catTom2 = new Cat("Tom2", 11, 6);
        Runner catTom3 = new Cat("Tom3", 12, 7);

        Runner humanMax = new Human("Max", 13,4);
        Runner humanMax2 = new Human("Max2", 14,5);
        Runner humanMax3 = new Human("Max3", 15,6);

        Runner robotVally = new Robot("Vally", 12, 6);
        Runner robotVally2 = new Robot("Vally2", 13, 7);
        Runner robotVally3 = new Robot("Vally3", 14, 8);

        Runner[] runners = {catTom, catTom2, catTom3, humanMax, humanMax2, humanMax3, robotVally, robotVally2, robotVally3};

        Obstacle wall = new Wall(10);
        Obstacle wall2 = new Wall(11);
        Obstacle wall3 = new Wall(12);

        Obstacle runningTrack = new RunningTrack(13);
        Obstacle runningTrack2 = new RunningTrack(14);
        Obstacle runningTrack3 = new RunningTrack(15);

        Obstacle[] obstacles = {wall, wall2, wall3, runningTrack, runningTrack2, runningTrack3};

        System.out.println("Гонка началась!");
        for (int i = 0; i < obstacles.length; i++){
            System.out.println("\n\nИспытание " + (i + 1));

            for(Runner runner : runners){
                if(runner.getSuccess()){
                    System.out.println("------------");
                    obstacles[i].check(runner);
                }
            }
        }
    }
}

