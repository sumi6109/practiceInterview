package tree;

public class SizeofTree {
public static Node root;

	public static int size (Node node){
		if(node==null){
			return 0;
		}
		int leftTreeSize=size(node.left);
		int rightTreeSize=size(node.right);
		return 1+leftTreeSize+rightTreeSize;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root = new Node(4);
		System.out.println("     "+root.data);
		System.out.print("    /");
		System.out.print(" \\");
		System.out.println();
       root.left=new Node(2);
       System.out.print("   "+root.left.data+"   ");
       root.right=new Node(5);
       System.out.print(root.right.data+"   ");
       System.out.println();
   	System.out.print(" /");
	System.out.print(" \\");
	System.out.println();
       root.left.left=new Node(1);
       System.out.print(root.left.left.data+"   ");
       root.left.right=new Node(3);
       System.out.print(root.left.right.data+"   ");
       System.out.println();
       System.out.println();
       System.out.println();

       System.out.println("size is "+size(root));
       
	}

}
