import java.util.ArrayList;
public class manualSort {
        public static ArrayList sortColors(int[] nums) {
            ArrayList<Integer> arr= new ArrayList<>();
            arr.add(nums[0]);
            for (int x: nums){
                if(x<arr.get(0)){
                    arr.add(0,x);
                }
                else{
                    arr.add(x);
                }
            }
            return arr;
        }
    
    public static void main(String args[]) {
        int[] nums = {2,2,0,1};
        System.out.println(sortColors(nums));
 
        
    }
}
