import java.util.*;
public class wrapper {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Integer P = s.nextInt();
        Double R = s.nextDouble();
        Float T = s.nextFloat();

        System.out.println( P*R*T/100);
    }
}
