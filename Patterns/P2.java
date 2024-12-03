package Patterns;

public class P2 {
    public  static void printpyramid(int n){
        int i,j,k;
        for(i=1;i<=n;i++){
           for(j=i;j<n;j++){
            System.out.print(" ");
           }
           for(k=1;k<=(2*i-1);k++){
            System.out.print("*");
           }
        System.out.println();
        }
      
    }
    public  static void reversepyramid(int n){
        int i,j,k;
        for(i=n;i>=1;i--){
            for(j=n;j>i;j--){
                System.out.print(" ");
               }
            for(k=1;k<=(2*i-1);k++){
                System.out.print("*");
               }
           
          
        System.out.println();
        }
      
    }

    public  static void Pattern4(int n){
        int i,j,k;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for lower part
        for(i=n-1;i>=1;i--){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void Pattern5(int n){
    int i,j,k;
    for(i=1;i<=n;i++){
        for(k=1;k<=i;k++){
            System.out.print("*");
        }
        for(j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        System.out.println();
       
         }
          //lowerpart
         for(i=n-1;i>=1;i--){
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }


    }
    public static void BinaryTraingle(int n){
        int start=1;
     for(int i=1;i<=n;i++){
        if(i%2==0) start=1;
        else start=0;
        for(int j=1;j<=i;j++){
            System.out.print(start);
            start=1-start;
        }
        System.out.println();

     }
    }
    public static void IncreasingTraingle(int n  ){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;

            }
            System.out.println();

        }


    }
    public static void main(String[] args) {
        int n=5;
        printpyramid(n);
        System.out.println("Reverse the pyramid");
        reversepyramid(n);
        System.out.println("Pattern3 ");
        printpyramid(n);
        reversepyramid(n);
        System.err.println();
        System.out.println("Pattern 4:");
        Pattern4(n);
        System.err.println();
        System.out.println("Pattern 5:");
        Pattern5(n);

        System.out.println();
        System.out.println("Binary Triangle");
        BinaryTraingle(n);
        
        System.out.println();
        System.out.println("Increasing number Traingle");
        IncreasingTraingle(n);
        


        


      
       
        
    }
    
}
