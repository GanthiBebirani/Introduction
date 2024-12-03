package basicprograms;

import java.util.Arrays;

public class Removeduplicates {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3,4,5};
        //Here I am takig the sorted array
        //if you take unsorted array then you can first sort out and then do this operation 
        //we can do this by using set ,but i am using different approach

        int[] arr1=removeduplicates(arr);
        for(int n:arr1){
            System.out.print(n+" ");
        }


    }
    public static int[] removeduplicates(int[] arr){

        int i=0,j;
        if (arr.length == 0) return new int[0]; 
        for(j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }

        return Arrays.copyOf(arr, i+1);

    }
    
}
 