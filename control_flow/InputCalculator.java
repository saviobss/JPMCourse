import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long average = 0;
        int totalNumbersRead = 0;
        int number;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean isInt = scanner.hasNextInt();
            if(!isInt) {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
            number = scanner.nextInt();
            totalNumbersRead++;
            sum += number;
            average = Math.round((double)sum/totalNumbersRead);
        }

        scanner.close();
    }
}

