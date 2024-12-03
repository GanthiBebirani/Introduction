package Patterns;

public class P1 {
    public static void main(String args[]){
        int n=5,i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
    
        }
        System.out.println();
        System.out.println();

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(" "+i);
            }
            System.out.println();
    
        }

        System.out.println();
        System.out.println();
        
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
    
        }
    }

   
}
    

