package basicprograms;
class Largestnum{
    public static void main(String[] args) {
        //You can sort the array and tell last element as largest element it takes -nlogn
        //But writing optimal solution- o(n)
        int[] arr={78,9322,24,55,29};

        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("Max element is: "+max);

    }
}