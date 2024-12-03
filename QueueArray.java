public class QueueArray {
  private int capacity;
  private int front;
  private int rear;
  private int size;
  private int[] Queue;

  public QueueArray(int capacity){
    this.capacity=capacity;
    this.Queue=new int[capacity];
    this.front=0;
    this.rear=-1;
    this.size=0;

  }

  public boolean isEmpty(){
    return size==0;
  }
  public boolean isFull(){
    return size==capacity;
  }
  public void enque(int data){
    if(isFull()){
        System.out.println("Queue is overflow");
        return;
    }
    rear=(rear+1)%capacity;
    Queue[rear]=data;
    size++;
    System.out.println("Enqued element "+data);

  }

  public int deque(){
    if(isEmpty()){
      System.out.println("There are no elements to delete");
      return -1;
    }
    int item=Queue[front];
    front=(front+1)%capacity;
    size--;
    return Queue[item];
  }


  public int peek(){
    return Queue[front];
  }
  public void Display()
{
  if(isEmpty()){
    System.out.println("There are no elements in the queue");
  }
  for(int i=0;i<size;i++){
    System.out.println(Queue[(front+i)%capacity]+" ");
  }
} 


public int Size(){
  return size;
}
 public static void main(String[] args){

    QueueArray q1=new QueueArray(5);
    q1.enque(3);
    q1.enque(4);
    q1.enque(5);
    q1.Display();
    int item=q1.deque();
    System.out.println("removed the front element:"+item);
    q1.Display();
   System.out.println(q1.peek());
   System.out.println("Size of the queue:"+q1.Size());

   
   



    }
    
}
