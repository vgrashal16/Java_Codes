import java.util.*;
public class stable {
    public static void main(String args[]){
        System.out.println(isStable(1212));

    }

    public static boolean isStable(int num){
        boolean isStable = true;
        String numstr = String.valueOf(num);
        int[] freq = new int[10];

        for (int i = 0; i<numstr.length();i++){
            freq[Integer.parseInt(String.valueOf(numstr.charAt(i)))]++;
        }

        int first=0;
        for (int i = 0; i<10;i++){
            if (freq[i]>0){
                first = freq[i];
                break;
            }
        }

        for(int i = 0;i<10;i++){
            if(freq[i]>0 && freq[i]!=first){
                return false;
            }
        }
        
        return true;

    }
}
