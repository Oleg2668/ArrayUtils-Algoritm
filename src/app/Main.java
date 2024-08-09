package app;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Створення та заповнення масиву випадковими числами
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);  // числа від 0 до 99
        }

        // Виведення оригінального масиву
        System.out.println("Original array: " + Arrays.toString(array));

        // Сортування масиву злиттям
        ArrayUtils.mergeSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Бінарний пошук елемента
        int target = array[random.nextInt(array.length)];
        int index = ArrayUtils.binarySearch(array, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}