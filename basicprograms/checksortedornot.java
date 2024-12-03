package basicprograms;

public class checksortedornot {
    public static void main(String[] args) {
        int[] arr={5,7,2,8,4};
        //Checking the array is sorted or not
       boolean status=sortedornot(arr);
       if(status){
        System.out.print("Array is sorted");
       }
       else{
        System.out.println("Array is not sorted");
       }
        
    }
    public static boolean sortedornot(int[] arr){ 
        for(int i=1;i<arr.length;i++){
        if(arr[i]>arr[i-1]){

        }
        else{
            return false;
        }
    
    }
    return true;

    }
    
}
