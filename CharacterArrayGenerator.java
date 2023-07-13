import java.util.Arrays;

public class CharacterArrayGenerator {
    public static char[] placeTheAlphabets(int[] input1) {
        int n = input1.length;
        int[] sortedArray = Arrays.copyOf(input1, n);
        Arrays.sort(sortedArray);
        
        char[] charArray = new char[n];
        char alphabet = 'a';
        
        for (int i = 0; i < n; i++) {
            int index = findIndex(input1, sortedArray[i]);
            charArray[index] = alphabet++;
        }
        
        return charArray;
    }
    
    private static int findIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1; 
    }
    
    public static void main(String[] args) {
        int[] input1 = {34,5,60};
        char[] output = generateCharacterArray(input1);
        
        System.out.println(Arrays.toString(output));
    }
}
