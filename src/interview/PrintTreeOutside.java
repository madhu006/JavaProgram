package interview;



public class PrintTreeOutside {
	public static void main(String[] args) {
		//all right, it's time to test
		/*Use the following example tree for testing
		 *      1
		 *    2   3
		 *  4  5 6  7
		 *  Expect: 1,2,4,5,6,7,3,1, correct!
		 */
		BinaryTree myTree = new BinaryTree(1);
		myTree.left = new BinaryTree(2);
		myTree.right = new BinaryTree(3);
		myTree.left.left = new BinaryTree(4);
		myTree.left.right = new BinaryTree(5);
		myTree.right.left = new BinaryTree(6);
		myTree.right.right = new BinaryTree(7);
		myTree.PrintBoundary();
	}
}
//let's define our own binary tree class and the necessary traversal methods
//for printing the boundary in counterclockwise order
class BinaryTree {
	int value;
	BinaryTree left;
	BinaryTree right;
	public BinaryTree(int k) {
		value = k;
	}
	//forgot to define a method to combine all methods as a whole !
	public void PrintBoundary() {
		preorderLeftOnly();
		inorderLeafOnly();
		postorderRightOnly();
	}
	//we have some duplicates as they are at the edge of two boundaries
	//we decide to print those left/right boundary nodes only if they are leaves (mid step)
	private boolean ifLeaf(BinaryTree myT) {
		return myT!=null && myT.left==null && myT.right==null;
	}
	//now define first method that is similar to preorder to print left boundary
	private void preorderLeftOnly() {
		if(this!=null && !ifLeaf(this))
			System.out.print(value+">");
		if(left!=null)
			left.preorderLeftOnly();
	}
	//now define the 2nd method to in-order traversal the tree but only print leaf nodes!
	private void inorderLeafOnly() {//leaf not left, sorry it is LEAF
		if(this==null) return;
		if(left!=null)
			left.inorderLeafOnly();
		//make sure it is leaf before printing
		if(left==null && right==null)
			System.out.print(value+">");
		if(right!=null)
			right.inorderLeafOnly();
	}
	//This is the similar-to-postorder traversal with dealing right children only
	private void postorderRightOnly() {
		if(right!=null)
			right.postorderRightOnly();
		if(this!=null && !ifLeaf(this))
			System.out.print(value+">");
	}
}







