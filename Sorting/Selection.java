package Sorting;
public class Selection {
    public static void main(String args[]){
        int nums[]={3,4,5,1,6,2};
        int min,i,j,temp;
        for(i=0;i<nums.length-1;i++){
            min=i;
            for(j=i+1;j<nums.length;j++)
            {
                  if(nums[min]>nums[j]){
                    min=j;
                  }
            }
            temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;

        }
        System.out.println("after Sorting");
    for(i=0;i<nums.length;i++){
        
            System.out.println(nums[i]);
   
    }

    }
    
}
