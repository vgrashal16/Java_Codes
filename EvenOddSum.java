public class EvenOddSum {
    public int findPIN(int input1, int input2, int input3, int input4){
        int pin;
        if (input4 % 2 == 0) {
            pin = sumEvenDigits(input1) + sumEvenDigits(input2) + sumEvenDigits(input3);
        } else {
            pin = sumOddDigits(input1) + sumOddDigits(input2) + sumOddDigits(input3);
        }
        return pin;
    }

    public static int sumEvenDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static int sumOddDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        EvenOddSum instance = new EvenOddSum();
        System.out.println(instance.findPIN(3521,2452,1352,37));
    }
}
