import java.util.*;

public class findkey {
    public int findkeyfun(int input1, int input2, int input3){
        int a = (input1/100)%10;
        int b = (input2/10)%10;
        int c = 0;  
        while(input3 != 0)
        {
            int r = input3 % 10;
            c = Math.max(r, c);
            input3 = input3 / 10;
        }
        
        return ((int)(a*b)*c);

    }

    public static void main(String[] args){
        findkey obj = new findkey();
        System.out.println(obj.findkeyfun(3521,2452,1352));
       
    }
}
