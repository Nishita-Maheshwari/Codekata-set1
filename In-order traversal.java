class Node
{
   int key;
   Node left,right;
   public Node(int item){
       key=item;
       left=right=null;
   }
	
	
}
public class Main{
    Node root;
    Main(){root=null;}
    //print the node ADDEREE OF binary tree

    void print_Inorder(Node node)
    {
        if(node== null) return;
              print_Inorder(node.left);
        System.out.println(node.key+"");
  
        print_Inorder(node.right);
    }
    void print_Inorder()
    {
        print_Inorder(root);
    }

public static void main(String[] args){
    Main tree=new Main();
    tree.root=new Node(55);
    tree.root.left=new Node(21);
    tree.root.right=new Node(80);
    tree.root.left.left=new Node(9);
    tree.root.left.right=new Node(29);
    tree.root.right.left=new Node(76);
    tree.root.right.right=new Node(91);
    
    System.out.println("Inorder traversal of binary tree is:");
    tree.print_Inorder();
    
}
}

