package Searching;
//Binary search is O(logn),array must in sorted order,then only we  can perform Binary search
class Binarysearch{
    public static int binarysearch(int arr[],int k){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
               if(k==arr[mid]){
                return mid;
               }
               else if( k<arr[mid]){
                right=mid-1;
               }
               else{
                left=mid+1;
               }

        }
        return -1;
        
    }
    //usong Recursion
    public static int RecurBinarysearch(int arr[],int k,int L,int R){//L=left R=right,k=key element and arrayarr[]
        while(L<=R){
            int mid=(L+R)/2;
            if(k==arr[mid]){
                return mid;
            }
            else if(k<arr[mid]){
               return  RecurBinarysearch(arr, k, L, mid-1);
            }
            else{
                return RecurBinarysearch(arr, k, mid+1, R);
            }
            
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,4,5,7,9};
        int k=9;
        int result = binarysearch(arr,k);
       
        if(result!=-1){
            System.out.println("Elemtent Found at index binarynormal "+result);
        }
        else{
            System.out.println("Element not Found");
        }
        //For Recursion
        int l=0;
        int r=arr.length-1;
        int result1=RecurBinarysearch(arr, k, l, r);
        if(result1!=-1){
            System.out.println("Element found at index binary recursive "+result1);
        }
        else{
            System.out.println("Element not found");
        }
        

    }

}