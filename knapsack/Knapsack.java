package com.telran.prof.org.algorithms.knapsack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Knapsack {

    public static void main(String[] args) {
        // Список предметов
        List<Item> items = new ArrayList<>();
        items.add(new Item(2, 10));  // Предмет 1
        items.add(new Item(3, 15));  // Предмет 2
        items.add(new Item(5, 25));  // Предмет 3
        items.add(new Item(7, 35));  // Предмет 4

        int maxWeight = 10; // Максимальная вместимость рюкзака

        // Сортировка предметов по убыванию ценности
        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Double.compare(o2.getValuePerWeight(), o1.getValuePerWeight());
            }
        });

        int currentWeight = 0; // Текущий вес рюкзака
        int totalValue = 0;    // Общая стоимость предметов в рюкзаке

        System.out.println("Выбираем предметы:");
        // Добавляем предметы в рюкзак
        for (Item item : items) {
            if (currentWeight + item.weight <= maxWeight) {
                currentWeight += item.weight;
                totalValue += item.value;
                System.out.println("Предмет с весом " + item.weight + " кг и стоимостью $" + item.value + " добавлен в рюкзак.");
            } else {
                System.out.println("Предмет с весом " + item.weight + " кг и стоимостью $" + item.value + " не помещается в рюкзак.");
            }
        }

        System.out.println("Общая стоимость предметов в рюкзаке: $" + totalValue);
        System.out.println("Общий вес предметов в рюкзаке: " + currentWeight + " кг");
    }
}