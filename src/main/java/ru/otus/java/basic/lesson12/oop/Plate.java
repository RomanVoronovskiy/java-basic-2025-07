package ru.otus.java.basic.lesson12.oop;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public Plate() {
        food = 100;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке осталось: " + food + " еды");
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }
}
