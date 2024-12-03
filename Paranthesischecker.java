import java.util.Scanner;
import java.util.Stack;
class Paranthesischeker{

    public static boolean isvalid(String exp){

        Stack <Character> stack=new Stack<>();

        for(char ch:exp.toCharArray()){
             
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else if(ch==')'||ch==']'||ch=='}'){
                if(stack.isEmpty()|| !ismatching(stack.pop(),ch)){
                    return false;
                }   
            }
        }

        return stack.isEmpty();

    }

    public static boolean ismatching(char open,char close){
        return (open=='('&& close==')'||open=='{'&& close=='}'||open=='['&& close==']');
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Expression:");
        String exp=sc.nextLine();

        boolean validornot=isvalid(exp);
        if(validornot){
            System.out.println("Given expression is Valid"); 
        }
        else{
            System.out.println("Given Expression is Invalid");
        }
       

       




    }
}