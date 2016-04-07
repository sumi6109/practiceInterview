package tree;

public class HeightofTree {
	public static Node root;
	
	public static int height(Node root){
		if(root==null){
			return 0;
		}
		return 1+Math.max(height(root.left), height(root.right));
		
		
		
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

       System.out.println("Height is "+height(root));
	}

}
