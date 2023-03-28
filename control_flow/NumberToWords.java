public class NumberToWords {
    public static void numberToWords (int number){
        if (number < 0) {
            System.out.println("Invalid Number");
        } else {
            int parameter = reverse(number);
            int numberDigitCount = getDigitCount(number), reverseDigitCount = getDigitCount(parameter);

            if (number == 0) {
                System.out.println("Zero");
            }
            while (parameter != 0 || parameter > 0) {
                int digit = parameter % 10;
                switch (digit) {
                    case 0:
                        System.out.print("Zero");
                        break;
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
                System.out.print(" ");

                parameter /= 10;
            }

            if (numberDigitCount != reverseDigitCount) {
                for (int i = 0; i < numberDigitCount - reverseDigitCount; i++) {
                    System.out.print("Zero ");
                }
            }

            System.out.println("");
        }
    }

    public static int reverse (int number){
        int reverse = 0;

        while (number != 0 || number > 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0 ) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        while (number > 0 || number % 10 != 0) {
            count ++;
            number /= 10;
        }
        return count;
    }
}
