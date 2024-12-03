package Sorting;

class Insertion{
    public static void main(String args[]){
    int i,j,temp;
    int nums[]={8,3,2,6,12,1,5,6};
    //We are Going to perform Insertion technique
    for (i=1;i<nums.length;i++){
        for (j=i;j-1>=0;j--){
            if(nums[j]<=nums[j-1]){
                temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
            }
        }
    }
    System.out.println("after Sorting");
    for(i=0;i<nums.length;i++){
        
            System.out.println(nums[i]);
   
    }



    }

}