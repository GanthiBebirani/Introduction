package basicprograms;

public class Shiftall0toright {
    public static void main(String args[]){
        int arr[]={0,8,9,5,0,0,2,6,6,3,0};
        int temp[]=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[k]=arr[i];
                k++;
            }
        }
        for(int i=k;i<arr.length;i++){
            temp[i]=0;
        }

    System.out.println("After shifting all zeroes to the right side: ");
    for(int i=0;i<temp.length;i++)
    {
        System.out.print(temp[i]+" ");
    }

    }
    



    //optimal solution
}
