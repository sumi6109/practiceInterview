package tree;

public class Inseration {

	public static Node root;
	
	public static Node Insert(Node root,Node node1){
		Node current = root;
		Node parent =null;
		while(current !=null){
			if(node1.data<=current.data){
				parent=current;
				current =current.left;
				
			}
			else
			{
				parent=current;
				current =current.right;
			}
			
			
			
		}
		if(node1.data<=parent.data){
			parent.left=node1;
			
		}
		else{
			parent.right=node1;
		}

		return parent;
		
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
       Node node1 =new Node(0);

       System.out.println("Inserted at "+Insert(root, node1).data);
	}

}
