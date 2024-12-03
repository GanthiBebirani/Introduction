package Sorting;
public class Mergesortcode{
    public static void main(String args[]){
        //You can take array from the user or fixed array
        int[] array={5,3,6,4,1,2};
        for(int n:array){
            System.out.print(n+" ");
        }
        System.out.print("\n");
        Mergesort(array,0,array.length-1);
        System.out.println("After Sorting:");
        for(int n:array){
            System.out.print(n+" ");
        }

    }

    private static void Mergesort(int[] arr,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            Mergesort(arr,l,mid);
            Mergesort(arr, mid+1, r);
            Merge(arr,l,mid,r);
        }
    }
    private static void Merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;//Leftarray length
        int n2=r-mid;//Right array length
        int[] leftarr=new int[n1];//Creating the array with the length
        int[] rightarr=new int[n2];
        //Copying the elements into the arrays
        for(int i=0;i<n1;i++){
            leftarr[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            rightarr[j]=arr[mid+1+j];
        }


        //Now merging
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(leftarr[i]<=rightarr[j]){
                arr[k]=leftarr[i];
                i++;
            }
            else{
                arr[k]=rightarr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=leftarr[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=rightarr[j];
            j++;
            k++;
        }


    }
    
}
