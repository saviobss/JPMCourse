package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        scanner.close();

        return integer;

    }

    private static int[] readElements(int numberOfElements) {

        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[numberOfElements];
        
        for(int i = 0; i< numberOfElements;i++) {
            elements[i] = scanner.nextInt();
        }

        scanner.close();

        return elements;

    }

    private static int findMin(int[] elements) {
        Arrays.sort(elements);
        return elements[0];
    }
}