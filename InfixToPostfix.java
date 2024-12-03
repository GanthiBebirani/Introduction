import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {


    private static int precedence(char c)
        {
            switch(c){
                case '+':
                case '-':
                     return 1;
                case '/':
                case '*':
                case '%':
                     return 2;
                case '^':
                     return 3;

            }
          
            return 0;
        } 

        private static boolean isRightAssociativity(char c){
            if(c=='^'){
                return true;
            }
            return false;

        }


    public static String InfixtoPostfix(String exp){

        Stack<Character> stack=new Stack<>();
        StringBuilder result=new StringBuilder();

        
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);

            if(Character.isLetterOrDigit(c)){
                result.append(c);
            }
            else if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                while(!stack.isEmpty()&&stack.peek()!='('){
                       result.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty()&& precedence(c)<=precedence(stack.peek())){
                    if(precedence(c)==precedence(stack.peek())&&!isRightAssociativity(c)){
                        break;


                    }
                    result.append(stack.pop());
                }
                stack.push(c);
            }
           
        }
        while(!stack.isEmpty()){
            if(stack.peek()=='('){
                return "Invalid Expression";
            }
            result.append(stack.pop());
        
        }

        return result.toString();
      
    }



    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Expression:");
        String exp=sc.nextLine();

        
            String result=InfixtoPostfix(exp);
            System.out.println("Given expression is Infix "+exp); 
        
            System.out.println("Given Expression is Postfix "+result);
      
       
        
    }
}