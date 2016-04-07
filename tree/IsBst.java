package tree;


class Node{
	
	int data;
	Node left,right ;
	public Node(int item){
		data=item;
		left=right=null;
		
	}
	
	
	
	
}
public class IsBst {
	private static Node root=null;
	public static boolean isBSt(Node root){
		return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		
	}
	
	
	public static boolean isBST(Node node,int min,int max){
		
		if(node ==null){
			
			return true;
		}
		if(node.data<min||node.data>max){
			return false;
		}
		
		return isBST(node.left, min, node.data)&&isBST(node.right, node.data, max);
	}
	
	
	public static void main(String[] args) {
		  
	       root=new Node(4);
	       root.left=new Node(2);
	       root.right=new Node(5);
	       root.left.left=new Node(1);
	       root.left.right=new Node(3);
	       System.out.println("tree is "+isBSt(root));
	}

}
