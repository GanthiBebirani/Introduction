class Node{
    int data;
    Node left,right;

    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

}



public class BinaryTree {
    
Node root;

public BinaryTree(){
    root=null;
}
public void insert(int data){
    root=insertrec(root,data);
}
public Node insertrec(Node root,int data){

   if(root==null){
    root=new Node(data);
    return root;
   }
   if(root.left==null){
    root.left=insertrec(root.left, data);
   }
   else if(root.right==null){
    root.right=insertrec(root.right, data);
   }
   else{
    root.left=insertrec(root.left, data);
   }

   return root;
}

public void inorder(){
    inorderrec(root);

}
private void inorderrec(Node root){
    
    if(root!=null){
        inorderrec(root.left);
        System.out.println(root.data+" ");
        inorderrec(root.right);
    }
 

}



public void preorder(){
    preorderrec(root);

}
private void preorderrec(Node root){

    if(root!=null){
        System.out.println(root.data+" ");
        preorderrec(root.left);
        preorderrec(root.right);
    }
    
}


public void postorder(){
    postorderrec(root);

}
private void postorderrec(Node root){
   
    if(root!=null){
        postorderrec(root.left);
        postorderrec(root.right);
        System.out.println(root.data+" ");
    }
   

}


    public static void main(String[] args) {
        BinaryTree tree1=new BinaryTree();
        tree1.insert(50);
        tree1.insert(30);
        tree1.insert(40);
        tree1.insert(10);
        tree1.insert(80);
        tree1.insert(90);
      
        System.out.println("Inorder");
        tree1.inorder();
        System.out.println("Postorder");
        tree1.postorder();
        System.out.println("Preorder");
        tree1.preorder();
        
    }
    
}
