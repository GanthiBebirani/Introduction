package basicprograms;
class SecondLargest{
    public static void main(String[] args) {
        int[] arr={400,700,800,1000,100};
        //Keep to pointers i,j ;
        int max=arr[0],secmax=Integer.MIN_VALUE,i;
        for(i=1;i<arr.length;i++)
        {
           if(arr[i]>max){
            secmax=max;
            max=arr[i];
           }
           else if(arr[i]>secmax&& arr[i]!=max){
            secmax=arr[i];
           }
        }

        System.out.println("Second largest element is "+secmax);
        
    }
}