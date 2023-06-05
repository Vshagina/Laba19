package com.company;


import java.util.Scanner;

public class Laba19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        int x = scanner.nextInt();
        System.out.print("Введите значение y: ");
        int y = scanner.nextInt();

        Singleton calculator = Singleton.getInstance();
        System.out.println(calculator.calculator(x, y));
    }

    public static class Singleton {
        private static Singleton instance;

        private Singleton() {
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

        public double calculator(int x, int y) {
            return 2 * x + 3.0 / y;
        }
    }
}
