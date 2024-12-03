package basicprograms;
/**
 * Countwords
 */
import java.util.*;
public class Countwords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str1=sc.nextLine();
        int count=0,i;
        if(str1.charAt(0)!=' '){
           count++;
        }
        for(i=0;i<str1.length();i++){
            if(str1.charAt(i)==' ' && str1.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println("Total no of words:"+count);
        
    }

    
}