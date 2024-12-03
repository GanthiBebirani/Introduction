package Sorting;
public class Bubblesort {
    public static void main(String args[]){
        int arr[]={25,25,12,22,11};
        int i,j,temp;

        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length-i-1;j++){
              if(arr[j]>=arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
              }

            }
        }
        System.out.println("after Sorting");
        for(i=0;i<arr.length;i++){
            
                System.out.println(arr[i]);
       
        }

    }
    
}
