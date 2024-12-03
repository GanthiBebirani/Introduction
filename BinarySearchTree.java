class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class BinarySearchTree {
     private Node root;
    
    public BinarySearchTree(){
        root=null;
    }

    public void insert(int data){
        root=insertrec(root,data);
    }
    private static Node insertrec(Node root,int value){
        if(root==null){
            root=new Node(value);
            return root;
        }

        if(value<root.data){
              root.left=insertrec(root.left, value);
        }
        else if(value>root.data){
            root.right=insertrec(root.right, value);
        }
        return root;

    }


    public  boolean search(int value){
        return searchrec(root,value);
    }
    public boolean searchrec(Node root,int value ){

        if(root==null){
           return false;
        }
        if(root.data==value){
            return true;
        }
        else if(value<root.data){
            return searchrec(root.left, value);

        }
        else{
            return searchrec(root.right,value);
        }
    }

    void  deletenode(int key){
        root=deleterec(root,key);
    }
    Node deleterec(Node root,int key){
        if(root==null){
            return root;
        }
        //For traversing to find the key element
        if (key<root.data){
            root.left=deleterec(root.left, key);
        }
        else if(key>root.data){
            root.right=deleterec(root.right, key);
        }
        else{
            //after found
            if(root.left==null){
                return root.right;//it will handle the node with single child on right side and also handle the leaf nodes
            }
            else if(root.right==null){
                return root.left;
            }
    
            root.data=Minval(root.right);
    
            root.right=deleterec(root.right,root.data);
           
    
        }
        return root;
    
    }
    
    public int Minval(Node root){
     int minval=root.data;
     while(root.left!=null){
        minval=root.left.data;
        root=root.left;
    
     }
    return minval;
    
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

        BinarySearchTree tree1=new BinarySearchTree();
        tree1.insert(50);
        tree1.insert(30);
        tree1.insert(40);
        tree1.insert(10);
        tree1.insert(80);
        tree1.insert(90);
        tree1.deletenode(10);
        tree1.deletenode(30);
        System.out.println("Inorder");
        tree1.inorder();
        System.out.println("Postorder");
        tree1.postorder();
        System.out.println("Preorder");
        tree1.preorder();



        
    }
    
}
