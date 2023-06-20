import java.util.*;
import java.io.*;
class Main{
    public static int findPassword(int input1,int input2,int input3,int input4,int input5)
        {

            // Read only region end
            int sum=0;
            if (isStable(input1)==false) sum+=input1;
            if (isStable(input2)==false) sum+=input2;
            if (isStable(input3)==false) sum+=input3;
            if (isStable(input4)==false) sum+=input4;
            if (isStable(input5)==false) sum+=input5;

            return sum;
        }
        
        public static boolean isStable(int num) {
            boolean isStable = true;
            int[] freq = new int[10];
            String numStr = String.valueOf(num);
            
            for (int i = 0; i < numStr.length(); i++) {
                freq[Integer.parseInt(String.valueOf(numStr.charAt(i)))]++;
            }            
            int firstFreq = 0;
            for (int i = 0; i < 10; i++) {
                if (freq[i] > 0) {
                    firstFreq = freq[i];
                    break;
                }
            }           
            for (int i = 0; i < 10; i++) {
                if (freq[i] != 0 && freq[i] != firstFreq) {
                    isStable = false;
                    break;
                }
            }           
            return isStable;
        }
    public static void main(String[] args){
        System.out.println(findPassword(12,1313,122,678,898));
    }
}
