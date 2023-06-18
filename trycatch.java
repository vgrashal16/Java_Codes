public class trycatch {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int divisor = 0;

        for (int i = 0; i < numbers.length+1; i++) {
            try {
                int result = numbers[i] / divisor;
                System.out.println("Result: " + result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException occurred: " + e.getMessage());
            }
        }
    }
}
