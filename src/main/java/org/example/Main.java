package org.example;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        System.out.println();
    }
    public static void task1() {
        System.out.println("Задание 1");

        int[] array = {3, 87, 12, 98, 2, 4, 66};
        for (int i = array.length - 1; i >=0 ; i --) {
            System.out.println(array[i]);
        }

    }
    public static void task2 () {
        System.out.println("Задание 2");

    }
    public static void task3 () {
        System.out.println("Задание 3");
        int[] array = {6, 117, 44, 5, 32, 81, 9};
        for (int i = 0; i < array.length; i ++) {
         //   if (i % 2 == 0) {
          //      array [i] = i;
            array [i] = (i +1) % 2;
            System.out.println(array[i]);
        }
    }
}