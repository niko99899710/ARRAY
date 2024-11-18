package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        double[] array = {0.81, 0.22, 0.47};
        System.out.println(Arrays.toString(array1(array)));
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] array = {3, 87, 12, 98, 2, 4, 66};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    private static void task2() {
        System.out.println("Задание 2");
    }

    public static double[] array1(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }


    public static void task3() {
        System.out.println("Задание 3");
        int[] array = {6, 117, 44, 5, 32, 81, 9};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}