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

    void print_Postorder(Node node)
    {
        if(node== null) return;
              print_Postorder(node.left);
                  print_Postorder(node.right);
        System.out.println(node.key+"");
  
    
    }
    void print_Postorder()
    {
        print_Postorder(root);
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
    
    System.out.println("Postorder traversal of binary tree is:");
    tree.print_Postorder();
    
}
}
