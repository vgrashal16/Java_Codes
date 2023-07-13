public class PrimeIndexSum {
    public static int sumOfPrimeIndexValues(int[] input1, int input2) {
        int sum = 0;
        for (int i = 2; i < input2; i++) {
            if (isPrime(i)) {
                sum += input1[i];
            }
        }
        return sum;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = {-4,5};
        int sum = sumOfPrimeIndexValues(array,2);
        System.out.println(sum);
    }
}
