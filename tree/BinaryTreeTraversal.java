package tree;


public class BinaryTreeTraversal {
	
public static Node root=null;
	
	
	public static void inOrder(Node node){
		
		if(node ==null){
			return;
		}
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
		
		
	}
	public static void preOrder(Node node){
		
		if(node ==null){
			return;
		}
		System.out.println(node.data);
		preOrder(node.left);
		
		preOrder(node.right);
		
		
	}
public static void postOrder(Node node){
		
		if(node ==null){
			return;
		}
		
		postOrder(node.left);
		
		postOrder(node.right);
		System.out.println(node.data);
		
	}
	public static void main(String[] args) {
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
	       System.out.println("Inorder");
	       inOrder(root);
	       System.out.println();
	       System.out.println("preorder");

	       preOrder(root);
	       System.out.println();
	       System.out.println("postorder");

	       postOrder(root);
	}

}
