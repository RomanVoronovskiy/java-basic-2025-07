package ru.otus.java.basic.lesson6;

public class Inventory {
    private String[] items = new String[5];

    public void add(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("В рюкзак был добавлен: " + item);
                return;
            }
        }
        System.out.println("В рюкзаке нет места для: " + item);
    }

    public void drop(String item) {
        for (int i = 0; i < items.length; i++) {
            if (item.equals(items[i])) {
                items[i] = null;
                System.out.println("Из рюкзака был удален: " + item);
                return;
            }
        }
        System.out.println("В рюкзаке нет элемента: " + item);
    }

    public void print() {
        System.out.println("состав рюкзака:");
        for (String item : items) {
            if(item!=null){
                System.out.print(item+" ");
            }
        }
        System.out.println();
    }
}
