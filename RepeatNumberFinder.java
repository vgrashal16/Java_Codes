import java.util.HashSet;

public class RepeatNumberFinder {

    public static int findFirstRepeatedNumber(int[] input1, int input2) {
        HashSet<Integer> set = new HashSet<>();
        boolean hasPositiveNumber = false;

        for (int i = 0; i < input2; i++) {
            int num = input1[i];

            if (num <= 0)
                continue;

            if (set.contains(num)) {
                return num; 
            } else {
                set.add(num);
            }

            hasPositiveNumber = true;
        }

        if (hasPositiveNumber) {
            return input1[0]; 
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) {
        int[] array = {-1,-2,-3,-4,-5,-6};
        int repeatedNumber = findFirstRepeatedNumber(array, 6);

       System.out.println(repeatedNumber);
    }
}
