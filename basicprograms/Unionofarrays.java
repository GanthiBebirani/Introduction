package basicprograms;

import java.util.HashSet;
import java.util.Set;

public class Unionofarrays {
    public static int[] unionofarrays(int[] arr1,int[] arr2){

        Set<Integer> set1=new HashSet<>();
        int n1=arr1.length;
        int n2=arr2.length;
        for(int i=0;i<n1;i++){
            set1.add(arr1[i]);

        }
        for(int i=0;i<n2;i++){
            set1.add(arr2[i]);
        }

        int[] result = new int[set1.size()];
        int index = 0;
        for (int num : set1) {
            result[index++] = num; // Unboxing Integer to int
        }

        return result;

    
    }

    public static void main(String[] args) {
        
        int[] arr1={1,1,2,3,4,5};
        int[] arr2={2,3,4,4,5};
        int[] union=unionofarrays(arr1,arr2);
        for(int n:union){
        System.out.println(n+" ");
        }
    }
    
}
