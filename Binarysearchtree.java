package trelist;

class Node1{
    private int data;
    private  Node1 left;
    private Node1 right;

    public Node1(int data) {
        this.data = data;
    }

    public Node1() {
        data=0;
        left=null;
        right=null;
    }

    public Node1 getRight() {
        return right;
    }

    public void setRight(Node1 right) {
        this.right = right;
    }

    public Node1 getLeft() {
        return left;
    }

    public void setLeft(Node1 left) {
        this.left = left;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

public class Binarysearchtree {


    public static Node1 insert(Node1 root,Node1 newnode) {
        if(root==null){
            root=newnode;
        }
        if(root.getData()>newnode.getData()){
            if(root.getLeft()==null){
                root.setLeft(newnode);
            }
            else
            {
                insert(root.getLeft(),newnode);
            }
        }
        else if(root.getData()<newnode.getData()){
            if(root.getRight()==null){
                root.setRight(newnode);
            }
            else
            {
                insert(root.getRight(),newnode);
            }
        }
       return root;

    }
   
    

    public static void main(String[] args) {

        Binarysearchtree obj=new Binarysearchtree();
       // Node1 n = new Node1();
        //n.setData(9);
        Node1 root=insert(null,new Node1(9));
       // Node1 root=insert(null,n);

       // n.setData(8);
        insert(root,new Node1(8));
        //insert(root,n);
        //n.setData(11);
        insert(root,new Node1(10));
        //insert(root,n);
        //n.setData(6);
        insert(root,new Node1(6));
        obj.inorderDisplay(root);
        obj.postorderDisplay(root);
        obj.preorderDisplay(root);
boolean r=search(root,10);
if(r==true)
    System.out.println("success");
    else
    System.out.println("not find");


    }
    public static boolean search(Node1 root,int data) {
        boolean r=false;
        if (root.getData() == data) {
            return true;
        } else if (root.getData() > data) {
            if (root.getLeft() == null)
                System.out.println("left is empty");
            else {
                r = search(root.getLeft(), data);

            }
        } else if (root.getData() < data) {
            if (root.getRight() == null)
                System.out.println("right is empty");
            else {
                r = search(root.getRight(), data);

            }
        } else if (root == null) {
            System.out.println(" empty");
        }
        return r;
    }

    public void inorderDisplay(Node1 n) {

        if (n == null) {
            return;
        }
        inorderDisplay(n.getLeft());
        System.out.println(n.getData());
        inorderDisplay(n.getRight());
    }

    public void postorderDisplay(Node1 n) {
        if (n == null) {
            return;
        }
        postorderDisplay(n.getLeft());
        postorderDisplay(n.getRight());
        System.out.println(n.getData());

        //   inorderDisplay(n.getRight());


    }

    public void preorderDisplay(Node1 n) {
        if (n == null) {
            return;
        }
        System.out.println(n.getData());
        preorderDisplay(n.getLeft());
        preorderDisplay(n.getRight());


    }
}
