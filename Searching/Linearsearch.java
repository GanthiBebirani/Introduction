package Searching;
//linear search is O(n)-In linear search Key element compared with each and every elment until it found
import java.util.Scanner;
class Linearsearch{
    public static void main(String args[]){
        int arr[]= new int[50];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Elements:");
        int n=sc.nextInt();
      
        System.out.println(" Enter the elements:");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Enter the Target element");
        int k=sc.nextInt();
       
        int result=Linearsearchh(arr,k);
        if(result!=-1){
            System.out.println("Element Found"+result);
        }
        else{
            System.out.println("Element not found");
        }

       
    }
        public static int  Linearsearchh(int arr[],int k){
            for(int i=0;i<arr.length;i++){
                if(k==arr[i]){
                 return i;  
                   
                }
        }
        
        return -1;
    }

   

}
