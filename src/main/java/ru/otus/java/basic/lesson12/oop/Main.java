package ru.otus.java.basic.lesson12.oop;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", "Рыжий", 3,false);
        Cat tihon = new Cat("Тихон", "Белый", 2,true);
        Plate plate = new Plate();
        System.out.println(barsik);
        System.out.println(tihon);
        plate.info();

        Cat[] cats = {barsik,tihon};
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

        System.out.println(barsik);
        System.out.println(tihon);
        plate.info();
    }
}
