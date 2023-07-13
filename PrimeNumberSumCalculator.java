public class PrimeNumberSumCalculator {

    public static int calculatePrimeNumberSumExceptLargest(int[] array) {
        int sum = 0;
        int largestPrime = Integer.MIN_VALUE;
        boolean hasPrime = false;

        for (int num : array) {
            if (isPrime(num)) {
                if (num > largestPrime) {
                    sum += largestPrime;
                    largestPrime = num;
                } else {
                    sum += num;
                }
                hasPrime = true;
            } else {
                sum += num;
            }
        }

        if (hasPrime) {
            sum -= largestPrime;
        } else {
            sum -= findLargestNumber(array);
        }

        return sum;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int findLargestNumber(int[] array) {
        int largestNumber = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largestNumber) {
                largestNumber = num;
            }
        }

        return largestNumber;
    }

    public static void main(String[] args) {
        int[] array = {10, 41, 18, 50, 43, 31, 29, 25, 59, 96, 67};
        int sum = calculatePrimeNumberSumExceptLargest(array);
        System.out.println("Sum: " + sum);
    }
}
