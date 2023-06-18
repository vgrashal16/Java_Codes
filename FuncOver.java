import java.util.*;
public class FuncOver {
    public static boolean isEqual(int num1, int num2) {
        return num1 == num2;
    }

    public static boolean isEqual(double num1, double num2) {
        return Math.abs(num1 - num2) < 0.0001;
    }

    public static void main(String args[]){
	Scanner s = new Scanner(System.in);


	System.out.println(isEqual(1,2));
	System.out.println(isEqual(1.00002,1.000003));
}
}
