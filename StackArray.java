import java.util.Scanner;

class StackArray{
    private int top;
    private int MaxSize;
    private int[] arraystack;

    public StackArray(int size){   //This is constructor
        this.top=-1;
        this.MaxSize=size;
        this.arraystack=new int[size];
    }


    public void push(int data){
        if(isFull()){
            System.out.println("Stack is Full");
        }
        else{
            top++;
            arraystack[top]=data;
        }

    }

    public boolean isFull(){
        return top==MaxSize-1;
     }


    public void pop(){
        if(isEmpty()){
            System.out.println("There are no elements to delete");
        }
        else{
            top--;
        }
     }

     public boolean isEmpty(){
        return top==-1;
     }

    public void show(){
        for(int i=0;i<MaxSize;i++){
            System.out.println(arraystack[i]);
        }
    

    }

    public void peek(){
        System.out.println("Top of the stack:"+arraystack[top]);

    }
    public int Size(){
       return top++;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int input,n;
        StackArray stack1=new StackArray(5);
        do{
            System.out.println("1.push\t2.pop\t3.peek\t4.isEmpty\t5.isFull\t6.Size\t7show\t8.Exit ");
            System.out.println("Enter the operation:");
            input=sc.nextInt();

            switch (input) {
                case 1:
                System.out.println("Enter the data");
                n=sc.nextInt();
                stack1.push(n);  
                break;
                case 2:
                stack1.pop();  
                break;
                case 3:
                stack1.peek();  
                break;
                case 4:
                stack1.isEmpty();  
                break;
                case 5:
                stack1.isFull();  
                break;
                case 6:
                int size=stack1.Size(); 
                System.out.println("Total size"+size); 
                break;
                case 7:
                     stack1.show();
                default:
                    break;
            }


        }while(input!=8);


    }
}