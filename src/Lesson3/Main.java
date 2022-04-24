package Lesson3;

import java.util.ArrayList;

public class Main<T> {

    public static <T> T[] change(T[] arr, int a, int b) {
        T var;
        var = arr[a];
        arr[a] = arr[b];
        arr[b] = var;
        return arr;
    }

    public static <T> ArrayList<T> toArrayList(T[] arr) {
        ArrayList<T> arrL = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            arrL.add(arr[i]);
        }
        return arrL;
    }

    public static <T> void arrPrint(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");
        String[] arr = {"Кот", "Собака", "Лошадь", "Человек"};
        System.out.println("Изначальное содержание массива:");
        arrPrint(arr);
        System.out.println("Результат перестановки:");
        change(arr, 2, 3);
        arrPrint(arr);

        //Задание 2
        System.out.println("Задание 2");

        Box<Apple> appleBox = new Box<>();
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.add(new Apple());
        System.out.println("Вес второй коробки с яблоками: " + appleBox2.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

        System.out.println("Сравнение веса коробок с яблоками и апельсинами: " + orangeBox.compare(appleBox));

        appleBox.union(appleBox2);
        System.out.println("Общий вес второй коробки с яблоками после перекидывания фруктов: " + appleBox2.getWeight());

    }


}

