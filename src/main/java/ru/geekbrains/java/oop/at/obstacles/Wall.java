package ru.geekbrains.java.oop.at.obstacles;

import ru.geekbrains.java.oop.at.participants.Runner;


public class Wall implements Obstacle {
    private int height;

    public Wall(int height){
        this.height = height;
    }
    public void check(Runner runner) {
        runner.run();
        runner.setSuccess(runner.getMaxLength() >= height);
        if(runner.getSuccess()) {
            System.out.println("Бегун " + runner.getName() + " выполнил испытание, пробежав дорожку длиной: " + height);
        } else {
            System.out.println("Бегун " + runner.getName() + " не пробежал дорожку длиной: " + height);
        }
    }
}

