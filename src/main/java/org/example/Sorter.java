package org.example;
import java.util.Arrays;
import java.util.Random;

public class Sorter {
    public static void sortDescending(int[] arr, int leftIndex, int rightIndex) {
        if (arr == null || leftIndex < 0 || rightIndex >= arr.length || leftIndex >= rightIndex) {
            throw new IllegalArgumentException("Неправильні індекси");
        }

        Arrays.sort(arr, leftIndex, rightIndex + 1);
        reverse(arr, leftIndex, rightIndex);
    }

    private static void reverse(int[] arr, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
}
