package tree;

public class TreeSearch {
	
	public static Node root;
	
	public static Node search(Node node,int data){
		if(node==null){
			return null;
			
		}
		if(node.data ==data){
			return node;
		}
		if(node.data>=data){
			return search(node.left,data);
		}
		return search(node.right,data);
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
      // Node node1 =new Node(0);
       if(search(root, 9)!=null){
           System.out.println("existed at "+search(root, 5).data);

       }
       else
    	   System.out.println("Doesn't exist");

	}

}
