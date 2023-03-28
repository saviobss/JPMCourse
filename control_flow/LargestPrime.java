public class LargestPrime {
    public static int getLargestPrime (int number) {
        int largest = -1;
        if (number < 0 || number == 0 || number == 1) {
            return largest;
        } else {
            int aux = number;
            for (int i = number - 1 ; i > 0; i--) {
                largest = i ;
                if (aux % largest == 0 && largest > 1) {
                    aux = largest;
                }
            }
        return aux;
        }
    }
}
