package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите курс доллара: \n");
        double d = reader.nextFloat();
        System.out.print("Введите количество рублей: \n");
        double r = reader.nextFloat();
        String result = String.format("%.2f", r / d);
        System.out.println("Итого = " + result + " долларов");
    }
}
