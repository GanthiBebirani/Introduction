package Linkedlist;

import java.util.Scanner;

class DLLNode{
    int data;
    DLLNode prev;
    DLLNode next;
    public DLLNode(int data){
        this.data=data;
        this.next=null;
        this.prev=null;

    }
}

public class DoublyLL {
    public static void main(String[] args) {
        Dlloperations d1=new Dlloperations();
        Scanner sc=new Scanner(System.in);
        int op;//operation
        System.out.println("Doubly Linked list");
        do{
            System.out.println("1.Insertion at end \t 2.Insertion at Beginning \t 3.Insertion at any Position \t4.delete at Ending");
            System.out.println("\t5.delete at begginging\t6.delete at any position \t7.Length of the linked list \t8.Search \t 10.Show \t 11.Exit");
            System.out.println("Enter the number corresponding to the operation you want to perform:");
            op = sc.nextInt();
            switch (op) {
                case 1:
                   d1.Insertend_dll();
                   break;
                case 2:
                   d1.Insertbegin_dll();
                    break;
                case 3:
                   d1.Insertatanyposition_dll();
                   break;
                case 4:
                  d1.Deleteatending_dll();
                  break;
                case 5:
                  d1.DeleteatBegin_dll();
                  break;
                case 6:
                  d1.Deleteatanypositionz_dll();
                  break;
                case 7:
                  d1.lengthoflinkedlist_dll();
                  break;
                case 8:
                  d1.Search_dll();
                  break;
                case 10:
                   d1.show_dll();
                   break;
                case 11:
                   System.out.println("Exiting...");
                   break;
                default:
                    System.out.println("Invalid input. Please enter a valid option.");
                    break;
            }

        }while(op!=11);



        
    }
    
}
class Dlloperations{
    DLLNode head;
    Scanner sc=new Scanner(System.in);
    public void Insertend_dll(){
        System.out.println("Enter the number of elements to insert:");
        int n = sc.nextInt();
        System.out.println("Enter the data:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            DLLNode currNode = new DLLNode(data);

            if (head == null) {
                head = currNode;
            } else {
                DLLNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = currNode;
                currNode.prev = temp;
            }
        }

    }
    public void Insertbegin_dll(){
       
        System.out.println("Enter the Data");
            int data=sc.nextInt();
            DLLNode currNode=new DLLNode(data);
           
            if (head == null) {
                    head=currNode;
            } 
            else{
                currNode.next=head;
                head.prev=currNode;
                head=currNode;

            }
    }
    public void Insertatanyposition_dll(){
        System.out.println("Enter the Data");
        int data=sc.nextInt();
        System.out.println("Enter the position");
        int pos=sc.nextInt();
        DLLNode currNode=new DLLNode(data);
        if(pos<=0){
            System.out.println("Enter the correct position");
            return;
        }
        if(pos==1){
            currNode.next=head;
            if(head!=null){
                head.prev=currNode;
            }
            head=currNode;
            return;
        }
        DLLNode temp=head;
        int count=1;
        while(temp!=null&&count<pos-1){
          temp=temp.next;
          count++;
        }
        if(temp==null){
            System.out.println("position out of bounds");
            return;
        }
      currNode.next=temp.next;
      currNode.next.prev=currNode;


        ;



    }
    public void Deleteatending_dll(){

    }
    public void DeleteatBegin_dll(){

    }
    public void Deleteatanypositionz_dll(){

    }
    public void show_dll(){
        if (head == null) {
            System.out.println("No elements to print");
            return;
        }

        System.out.print("null <- ");
        DLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(" -> null");

    }
    public void lengthoflinkedlist_dll(){

    }
    public void Search_dll(){

    }
}

