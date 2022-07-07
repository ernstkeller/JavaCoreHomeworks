package Lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Собака", "Кот", "Попугай", "Морская свинка", "Кот", "Рыбка", "Хорек", "Собака", "Крыса", "Ящерица"};

        // Задание 1
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> uniqWord = new HashSet<>(Arrays.asList(words));
        System.out.println(uniqWord);
        System.out.println("");

        // Задание 2
        Phonebook phoneBook = new Phonebook();

        phoneBook.add("Иванов", "+7-916-099-98-51");
        phoneBook.add("Иванов", "+7-495-510-86-95");
        phoneBook.add("Кузнецов", "+7-917-566-69-62");
        phoneBook.add("Петров", "+7-915-000-79-52");
        phoneBook.add("Борисов", "+7-903-626-45-55");

        System.out.println(phoneBook.get("Иванов"));
    }
}
