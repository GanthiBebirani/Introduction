package Sorting;
import java.util.Scanner;

public class Quicksort {
    
    public static void Quicksort(int[] arr,int low,int high){

       if(low<high){
        int pivot=partition(arr, low, high);
        Quicksort(arr, low, pivot-1);
        Quicksort(arr, pivot+1, high);
       }

    }

    private static int partition(int[] arr,int low,int high){
        int pivot=high;
        int i=low-1,j,temp;
        for(j=low;j<high;j++){
            if(arr[j]<arr[pivot]){
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[i+1];
        arr[i+1]=arr[pivot];
        arr[pivot]=temp;

        return i+1;
        
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements in the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing the array:");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }

        Quicksort(arr, 0, arr.length-1);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        sc.close();






    }
    
}
