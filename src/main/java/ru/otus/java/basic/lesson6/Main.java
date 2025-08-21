package ru.otus.java.basic.lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] array = {2, 3, 1, 4, 7, 3, 9, 5, 6};
//        printMinElemInArray(array);
//        printMaxElemInArray(array);
//        functionMinMax(array);
//        playInGuessWorld();
//        wheel();
        Inventory my = new Inventory();
        my.add("веревка");
        my.add("палатка");
        my.add("тент");
        my.add("одежда");
        my.add("одежда2");
        my.add("одежда3");

        my.print();

        my.drop("палатка");
        my.drop("тент");
        my.drop("бутерброд");

        my.print();
    }

    private static void wheel() {
        String[] fruits = {
                "apple", "plum",
                "kiwi", "pear",
                "pineapple", "grape",
                "strawberry", "cherry",
                "banana", "orange",
                "mango"
        };
        int randomIndex = (int) (Math.random() * fruits.length);
        String wordToGuess = fruits[randomIndex];
        char[] mask = new char[wordToGuess.length()];
//        for (int i = 0; i < mask.length; i++) {
//            mask[i] = '*';
//        }
        Arrays.fill(mask, '*');

        Scanner sc = new Scanner(System.in);
        boolean win = false;

        while (!win) {
            System.out.println("Крутим коллесо, называй букву");
            char letter = sc.next().charAt(0);
            char[] toGuess = wordToGuess.toCharArray();
            for (int i = 0; i < toGuess.length; i++) {
                if (toGuess[i] == letter) {
                    mask[i] = toGuess[i];
                }
            }
            System.out.println(Arrays.toString(mask));
            if (containsStar(mask)) {
                win = true;
            }
        }
    }

    private static boolean containsStar(char[] mask) {
        boolean starIsEmpty = true;
        for (int i = 0; i < mask.length; i++) {
            if (mask[i] == '*') {
                starIsEmpty = false;
                break;
            }
        }
        return starIsEmpty;
    }

    private static void playInGuessWorld() {
        String[] fruits = {
                "apple", "plum",
                "kiwi", "pear",
                "pineapple", "grape",
                "strawberry", "cherry",
                "banana", "orange",
                "mango"
        };
        int randomIndex = (int) (Math.random() * fruits.length);
        String wordToGuess = fruits[randomIndex];

        Scanner sc = new Scanner(System.in);
        boolean win = false;

        while (!win) {
            System.out.println("Введи фрукт!");
            String inputFruit = sc.next();
            if (wordToGuess.equals(inputFruit)) {
                System.out.println("Угадали!");
                win = true;
            } else {
                char[] toGuess = wordToGuess.toCharArray();
                char[] input = inputFruit.toCharArray();
                for (int i = 0; i < toGuess.length && i < input.length; i++) {
                    if (toGuess[i] == input[i]) {
                        System.out.print(input[i]);
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println("\nпопробуй еще раз!");
            }
        }
    }


    private static void functionMinMax(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);
    }

    private static void printMaxElemInArray(int[] array) {
        System.out.println(Arrays.toString(array));
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);
    }

    /**
     * @param array массив с входными значеними
     * @apiNote метод предназначен для нахождения минимума в массиве и его печати
     */
    private static void printMinElemInArray(int[] array) {
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);
    }
}