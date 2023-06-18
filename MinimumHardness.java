import java.util.Scanner;

public class MinimumHardness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of integers in the array
        int k = scanner.nextInt(); // Maximum number of elements that can be changed

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int minHardness = getMinHardness(arr, n, k);
        System.out.println(minHardness);
    }

    private static int getMinHardness(int[] arr, int n, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        if (min == max) {
            return 0; // All elements are the same, hardness is already 0
        }

        if (k >= n - 1) {
            return max - min; // All elements can be changed to the same value
        }

        int result = max - min;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = arr[j] - arr[i];
                int maxDiff = getMaxDiff(arr, i, j);

                if (diff > 0 && maxDiff > diff) {
                    int remainingChanges = k - (j - i - 1);
                    int hardness = Math.max(diff, maxDiff - remainingChanges);
                    result = Math.min(result, hardness);
                }
            }
        }

        return result;
    }

    private static int getMaxDiff(int[] arr, int start, int end) {
        int maxDiff = 0;

        for (int i = start; i < end; i++) {
            maxDiff = Math.max(maxDiff, Math.abs(arr[i + 1] - arr[i]));
        }

        return maxDiff;
    }
}
