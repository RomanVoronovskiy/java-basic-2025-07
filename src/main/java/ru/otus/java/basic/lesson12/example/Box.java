package ru.otus.java.basic.lesson12.example;

import java.util.Objects;

public class Box {
    private String color;
    private int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public Box() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Коробка цвета " + color +
                " имеет размер " + size + " см.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return size == box.size && Objects.equals(color, box.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, size);
    }
}
