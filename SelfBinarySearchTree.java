package leetcode;
class BST{
	static BSTNode createNode(int val) {
		BSTNode a=new BSTNode(val);
		a.left=null;
		a.right=null;
		return a;
		
	}
	static BSTNode insert( BSTNode root,int val) {
		if(root==null) {
		   return createNode(val);
		}
		else if(val<root.data) {
			root.left=insert(root.left,val);
		}else {
			root.right=insert(root.right,val);
		}
		
		
		return root;
		
	}
}
public class SelfBinarySearchTree {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST t=new BST();
		BSTNode root=null;
		t.insert(root, 8);
		t.insert(root, 3);
		t.insert(root, 9);
		
		

	}

}
class BSTNode{
	BSTNode left,right;
	int data;
		BSTNode(int data){
		this.data=data;
		this.left=this.right=null;
	}
}
