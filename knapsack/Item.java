package com.telran.prof.org.algorithms.knapsack;

class Item {
    int weight; // Вес предмета
    int value;  // Стоимость предмета

    // Конструктор
    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    // Метод для расчета ценности (стоимость / вес)
    public double getValuePerWeight() {
        return (double) value / weight;
    }
}
