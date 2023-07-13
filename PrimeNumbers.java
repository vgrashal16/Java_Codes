import java.util.ArrayList;

public class PrimeNumbers {

    public static void main(String[] args) {
        int[] array = {10, 20,30,40};
        int length = array.length;

        System.out.println(findPrimesAndRemoveLargest(array, length));
    }

    public static int findPrimesAndRemoveLargest(int[] array, int length) {
        // Find prime numbers from the array
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (isPrime(array[i])) {
                primes.add(array[i]);
            }
        }


        // Remove the largest element from the new array
        if (!primes.isEmpty()) {
            int max = primes.get(0);
            int maxIndex = 0;
            for (int i = 1; i < primes.size(); i++) {
                if (primes.get(i) > max) {
                    max = primes.get(i);
                    maxIndex = i;
                }
            }
            primes.remove(maxIndex);
        }

        else {
            ArrayList<Integer> noprime = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                noprime.add(array[i]);
            }

            int max = noprime.get(0);
            int maxIndex = 0;
            for (int i = 1; i < noprime.size(); i++) {
                if (noprime.get(i) > max) {
                    max = noprime.get(i);
                    maxIndex = i;
                }
            }
            noprime.remove(maxIndex);

            return sumArrayListElements(noprime);
        }

        return sumArrayListElements(primes);
    }

    
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumArrayListElements(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
