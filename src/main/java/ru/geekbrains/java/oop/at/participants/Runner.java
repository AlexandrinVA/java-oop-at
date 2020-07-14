package ru.geekbrains.java.oop.at.participants;

public interface Runner {
    String getName();

    int getMaxLength();

    int getMaxHeight();

    boolean getSuccess();

    void setSuccess(boolean success);

    void run();

    void jump();

}
