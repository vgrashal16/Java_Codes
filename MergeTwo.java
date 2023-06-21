import java.util.*;
public class MergeTwo
{
    //Function to merge the arrays.
    public static void merge(int arr1[], int arr2[], int n, int m) 
    {
        // code here 
        ArrayList<Integer> res = new ArrayList<>();
        
        int pt1 = 0;
        int pt2 = 0;
        int count = 1;
        while(count<(n+m)){

            while(pt1<n || pt2<m){

                if(arr1[pt1]<arr2[pt2]){
                    res.add(arr1[pt1]);
                    pt1++;
                }
                
                else if(arr1[pt1]>arr2[pt2]){
                    res.add(arr2[pt2]);
                    pt2++;
                }  
                
                else if(arr1[pt1]==arr2[pt2]){
                        res.add(arr1[pt1]);
                        res.add(arr2[pt2]);
                        pt1++;
                        pt2++;
                        
                    }
                }
            
            if(pt1 == n){
                res.add(arr2[pt2]);
                pt2++;
            }
                
            if(pt2 == m){
                res.add(arr1[pt1]);
                pt1++;
            }
            
            count++;
        }
        
           
            Object[] objects = res.toArray();

            for (Object obj : objects)
                System.out.print(obj + " ");
            
        }

        public static void main(String[] args){
            int[] a = {4,16,18,20};
            int[] b = {1,16,23};
            merge(a,b,a.length,b.length);
        }
    }