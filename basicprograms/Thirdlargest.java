package basicprograms;

public class Thirdlargest {
    public static void main(String[] args) {
        int[] arr={400,700,800,1000,100};
    //Keep to pointers i,j ;
    int max=Integer.MIN_VALUE,secmax=Integer.MIN_VALUE,thirdmax=Integer.MIN_VALUE,i;
    for(i=0;i<arr.length;i++){
        if(arr[i]>max){
            thirdmax=secmax;
            secmax=max;
            max=arr[i];
        }
        else if(arr[i]>secmax&&arr[i]!=max){
            thirdmax=secmax;
            secmax=arr[i];
        }
        else if(arr[i]>thirdmax&&arr[i]!=max&arr[i]!=secmax)
        {
            thirdmax=arr[i];
        }
        

    }
    System.out.println("Thirdlargest number is "+thirdmax);
    }
    
}
