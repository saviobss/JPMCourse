package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int [] getIntegers (int size) {
        int[]  array = new int[size];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < size; i++) {
            array [i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(String.format("Element %d contents %d", i, array[i]));
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        Arrays.sort(array);
        for(int i = 0; i < array.length;i ++) {
            sortedArray[i] = array[array.length - 1 - i];
        }
        return sortedArray;
    }
}
