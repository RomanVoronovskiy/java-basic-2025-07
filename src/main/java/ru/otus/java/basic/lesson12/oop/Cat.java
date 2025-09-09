package ru.otus.java.basic.lesson12.oop;

public class Cat {
    private String name;
    private String color;
    private int age;
    private boolean isHungry;

    public Cat(String name, String color, int age, boolean isHungry) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.isHungry = isHungry;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                '}';
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public void eat(Plate plate) {
        if (isHungry) {
            System.out.println("name = " + name + " - поел");
            plate.decreaseFood(10);
            isHungry = false;
        } else {
            System.out.println("name = " + name + " - не голоден");
        }
    }
}
