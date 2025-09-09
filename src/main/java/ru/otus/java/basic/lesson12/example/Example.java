package ru.otus.java.basic.lesson12.example;

public class Example {
    public static void main(String[] args) {
        Box box1 = new Box("Red", 10);
        Box box2 = new Box("Red", 10);

        System.out.println(box1);
        System.out.println(box2);

        box2.setColor("Green");

        System.out.println(box1);
        System.out.println(box2);

        System.out.println(box1 == box2);

        System.out.println(box1.equals(box2));

        box1.equals(box2);

        String str = "Hello1";
        String str2 = new String("Hello1");
        String str3 = "Hello1";
        System.out.println(str);
        System.out.println(str2);

        System.out.println(str == str2);
        System.out.println(str == str3);
        System.out.println(str == str2.intern());

        String a = "a";
        for (int i = 0; i < 10_000; i++) {
            a += "A"; // aA
        } // 20 кб

        String q = "Java";
        String w = "Ja" + "va";
        String e = "Jav" + "a";

        StringBuilder sb = new StringBuilder("QWE");
        sb.append("a").append("b").append("c");
        String res = sb.toString();
        System.out.println(res);

        int intVal = Integer.parseInt("10");
    }
}
