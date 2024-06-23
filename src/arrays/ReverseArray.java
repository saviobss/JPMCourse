package arrays;

import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array) {
        int maxLength = array.length - 1;
        int middle = array.length / 2;

        System.out.println("Array = " + Arrays.toString(array));

        for(int i = 0; i < middle; i++) {
            int temp = array[maxLength - i];
            array[maxLength - i] = array[i];
            array[i] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }
    
}
