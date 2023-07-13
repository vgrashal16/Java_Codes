import java.util.Scanner;

public class PINcalculator {

    public int findPIN(int input1, int input2, int input3, int input4){
        int largestDigit1 = findLargestDigit(input1);
        int largestDigit2 = findLargestDigit(input2);
        int largestDigit3 = findLargestDigit(input3);
        int pin = (largestDigit1 * largestDigit2 * largestDigit3) + input4;
        return pin;
    }

    public static int findLargestDigit(int number) {
        int largestDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            number /= 10;
        }
        return largestDigit;
    }

    public static void main(String[] args) {
        PINcalculator instance = new PINcalculator();
        System.out.println(instance.findPIN(3521,2452,1352,38));
    }
}
