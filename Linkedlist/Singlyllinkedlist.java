package Linkedlist;
import java.util.*;
class Node{
    int data;
    Node next;
}

public class Singlyllinkedlist {
    public static void main(String args[]){
        Operations op=new Operations();
        Scanner sc=new Scanner(System.in);
        int input;
        do{
            System.out.println("1.Insertion at end \t 2.Insertion at Beginning \t 3.Insertion at any Position \t4.delete at Ending");
            System.out.println("\t5.delete at begginging\t6.delete at any position \t7.Length of the linked list \t8.Search \t 10.Show \t 11.Exit");
            System.out.println("Enter the number corresponding to the operation you want to perform:");
            input = sc.nextInt();
            switch (input) {
                case 1:
                   op.Insertend();
                   break;
                case 2:
                   op.Insertbegin();
                    break;
                case 3:
                   op.Insertatanyposition();
                   break;
                case 4:
                  op.Deleteatending();
                  break;
                case 5:
                  op.DeleteatBegin();
                  break;
                case 6:
                  op.Deleteatanyposition();
                  break;
                case 7:
                  op.lengthoflinkedlist();
                  break;
                case 8:
                  op.Search();
                  break;
                case 10:
                   op.show();
                   break;
                case 11:
                   System.out.println("Exiting...");
                   break;
                default:
                    System.out.println("Invalid input. Please enter a valid option.");
                    break;
            }
        }while(input!=11);


    }
    
}
class Operations{
        Node head;
        Scanner sc=new Scanner(System.in);
        public void Insertend(){
            System.out.println("Enter the no of elements to insert");
            int n=sc.nextInt();
            System.out.println("Enter the Data:");
            for(int i=0;i<n;i++){
                int data=sc.nextInt();
                Node newnode=new Node();
                newnode.data=data;
                newnode.next=null;
                if(head==null){
                    head=newnode;
                   
                }
                else{
                    Node temp=head;
                    while(temp.next!=null){
                        temp=temp.next;
                    }
                    temp.next=newnode;


                }

            }

        }
        public  void  Insertbegin(){
            System.out.println("Enter the no of elements:");
            int n=sc.nextInt();
            System.out.println("Enter the data");
            for(int i=0;i<n;i++){              
                int data=sc.nextInt();
                Node newnode=new Node();
                newnode.data=data;
                newnode.next=null;
                if(head==null){
                    head=newnode;
                
                }
                else{
                    newnode.next=head;
                    head=newnode;
                }



            }

        }
        public void Insertatanyposition(){
            System.out.println("Enter the Data");
            int data=sc.nextInt();
            System.out.println("Enter the position");
                int pos=sc.nextInt();
                Node currNode=new Node();
                currNode.data=data;
                currNode.next=null;
                if(pos<=0){
                    System.out.println("Enter the positive number only");
                    return;
                }
                 
                if(pos==1){
                    currNode.next=head;
                    head=currNode;
                    return;
                }
            Node temp=head;
            int count=1;
            while(temp!=null&&count<pos-1){
              temp=temp.next;
              count++;
            }
            
            if(temp==null){
                System.out.println("Position is out of bounds");
                return;
            }
              currNode.next=temp.next;
                temp.next=currNode;


            
           

        } 
        public void Deleteatending(){
            if(head==null){
                System.out.println("There are no elements to delete");
                return;
            }
            if(head.next==null){
                System.out.println("delete:"+head.data);
                head=null;
                return;
            }
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            System.out.println("deleted:"+temp.next.data);
            temp.next=null;
        

        }
        public void DeleteatBegin(){
            if(head==null){
                System.out.println("There are no elements to delete");
                return;
            }
            System.out.println("delete"+head.data);
            head=head.next;

        }
        public void Deleteatanyposition(){
            System.out.println("Enter the data:");
            int data=sc.nextInt();
            Node currNode=new Node();
            currNode.data=data;
            currNode.next=null;
            System.out.println("Enter the postion you want to delete:");
            int pos=sc.nextInt();
            if(pos<=0){
                System.out.println("Enter the correct postion");
                return;
            }
            if(pos==1){
             System.out.println("deleted"+head.data);
             head=head.next;   
            }
            Node temp=head;
            int count=1;
            if(temp!=null&&count<pos-1){
                temp=temp.next;
                count++;
            }
            if(temp==null || temp.next==null){
                System.out.println("Position out of bounds");
                return;
            }
            System.out.println("delete "+temp.next.data);
            temp.next=temp.next.next;


        }
        public void show(){
            if(head==null){
                System.out.println("No elements are there");
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");


        }

        public void lengthoflinkedlist()
        {  
            if(head==null){
                System.out.println("Length of linked list is 0");
            
            }
            else{
                Node temp=head;
                int count=0;
                while(temp!=null){
                    temp=temp.next;
                    count++;
                }
                System.out.println("Length of linked list is "+count);

            }
           

        }
        public void Search(){
            System.out.println("Enter the key you want to search");
            int key=sc.nextInt();
            if(head==null){
                System.out.println("No elements are there");
            }
            else{
                Node temp=head;
                int count=1;
                boolean found=false;
                while(temp!=null){
                    if(temp.data==key){
                        System.out.println("Element"+key+"found at position"+count);
                        found=true;
                        break;
                    }
                    temp=temp.next;
                    count++;

                }
                if(!found){
                    System.out.println("Element"+key+"not found");

                }
            }
        }
}



