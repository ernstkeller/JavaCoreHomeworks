package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Задание 1

        System.out.println("Задание 1");

        String[] array1 = {"Кот", "Собака", "Лошадь", "Человек"};
        System.out.println("Изначальное содержание массива:");
        System.out.println(Arrays.toString(array1));
    ReplaceArrayElements(array1, 2, 3);
        System.out.println("Результат перестановки:");
        System.out.println(Arrays.toString(array1));
        System.out.println("");


        //Задание 2

        System.out.println("Задание 2");

       Box box1 = new Box();
       box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());

        System.out.println("Вес коробки 1: " + box1.getWeight());

        Box box2 = new Box();
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());
       System.out.println("Вес коробки 2: " + box2.getWeight());

        System.out.println("Сравнение веса коробок:");
        System.out.println("Вес коробок " + (box1.compare(box2) ? "одинаковый" : "разный") + ".");

        System.out.println("В коробке 1 хранятся " + box1.getFruit().get(0).getClass().getSimpleName());

        Box box3 = new Box();
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());

        System.out.println("Вес коробки 3: " + box3.getWeight());
        System.out.println("В коробке 3 хранятся " + box3.getFruit().get(0).getClass().getSimpleName());

        box1.shiftSingleItem(box3);

        System.out.println("Вес коробки 3: " + box3.getWeight());
        System.out.println("Вес коробки 1: " + box1.getWeight());

        try {
            box2.shiftSingleItem(box3);
        } catch (BoxException e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки 3: " + box3.getWeight());
        System.out.println("Вес коробки 2: " + box2.getWeight());

        try {
            box3.add(new Orange());
            box3.add(new Orange());
            box3.add(new Orange());
        } catch (BoxException e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки 3: " + box3.getWeight());


    }


    public static <T> void ReplaceArrayElements(T[] modifiableArray, int elemNum1, int elemNum2) {
        T backupElement = modifiableArray[elemNum1];
        modifiableArray[elemNum1] = modifiableArray[elemNum2];
        modifiableArray[elemNum2] = backupElement;
    }



}

