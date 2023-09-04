package javalab;
class Node
{
	int data;
	Node left,right;
	public Node(int item)
	{
		data=item;
		left=right=null;
	}
}
public class BinaryTree {
 Node root;
 public int levels(Node node)
 {
	 if(node==null)
	 {
		 return 0;
	 }
	
	
		 return node.data-levels(node.left)-levels(node.right);
 }
	 public static void main(String args[])
	 {
		 BinaryTree tree =new BinaryTree();
		 tree.root =new Node(1);
		 tree.root.left =new Node(2);
		 tree.root.right =new Node(3);
		 tree.root.left.left =new Node(4);
		 tree.root.left.right =new Node(5);
		 tree.root.right.left =new Node(6);
		 tree.root.right.right =new Node(7);
		 int leveldiff= tree.levels(tree.root);
		 System.out.print("Difference of odd and even levels:"+leveldiff );
	 }
 
}
