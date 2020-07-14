package ru.geekbrains.java.oop.at.participants;

public class Human implements Runner {
    private String name;
    private int maxLength;
    private int maxHeight;
    private boolean success = true;

    public Human(String name, int maxLength, int maxHeight){
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }
    public void run(){
        System.out.println(name + " бежит максимум: " + maxLength);
    }
    public void jump(){
        System.out.println(name + " прыгает максимум: " + maxHeight);
    }
    public String getName(){
        return name;
    }
    public int getMaxLength(){
        return maxLength;
    }
    public int getMaxHeight(){
        return maxHeight;
    }
    public boolean getSuccess(){
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
}
