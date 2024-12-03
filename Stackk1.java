

public class Stackk1 {
    private Node top;

    public Stackk1() {
        this.top = null;
    }

    public void Push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public void Pop() {
        if (isempty()) {
            throw new RuntimeException("There are no elements to pop");
        }
        top = top.next;
    }

    public boolean isempty() {
        return top == null;
    }

    public int Peek() {
        if (isempty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    public void display() {
        if (isempty()) {
            throw new RuntimeException("There are no elements");
        }

        Node current = top;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Stackk1 stack = new Stackk1();
        stack.Push(10);
        stack.Push(20);
        stack.Push(30);
        stack.Push(40);
        stack.display(); // Should print: 40 -> 30 -> 20 -> 10 -> null
        stack.Pop();
        stack.display(); // Should print: 30 -> 20 -> 10 -> null
        int topValue = stack.Peek();
        System.out.println(topValue); // Should print: 30
    }
    private class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}

