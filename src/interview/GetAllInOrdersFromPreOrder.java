package interview;



import java.util.List;
import java.util.ArrayList;
public class GetAllInOrdersFromPreOrder {
	public static void main(String[] args) {
		//now we test our code, we know from our slides that {1,2,3} preset
		//has in total 5 different BTs thus have 5 different in-order ways!
		int[] testPreOrder = {1,2,3};
		List<BinaryTree9> testResults =
				GetAllTrees(testPreOrder, 0, testPreOrder.length-1);
		for(BinaryTree9 eachFormedBt: testResults)
			eachFormedBt.PrintInOrder();
	}
	//now we come to think about the key method
	//basically we want choose first value as root and split remaining element into two
	//however, even those splited elements can form MULTIPLE sub-trees, therefore we
	//need a data structure to store all the possible BTs
	//we choose a LIST as it is easy to append/remove/iterate
	//start and end index are used to know the focus window in the preorder array!
	static List<BinaryTree9> GetAllTrees(int[] preorder, int start, int end) {
		//we firstly define a return data structure
		List<BinaryTree9> returnTrees = new ArrayList<BinaryTree9>();
		//as a recusrive method, I'd prefer to define the stopping cases!
		if(start>end || start<0 || end>=preorder.length) {
			//there can be no trees, return null
			returnTrees.add(null);
			return returnTrees;
		}
		if(start==end) {//only one element
			returnTrees.add(new BinaryTree9(preorder[start]));
			return returnTrees;
		}
		//otherwise,it's the key part we discussed in our slides, split!
		//notice i starts from -1?! So that means left child can be NULL, a trick I tested ^_^
		for(int i=-1; i<end-start; i++) {
			//call the recursive part
			//notice startindex is incremented by 1, and end-index for left child is controlled by i
			List<BinaryTree9> leftChildren = GetAllTrees(preorder, start+1, start+1+i);
			List<BinaryTree9> rightChildren = GetAllTrees(preorder, start+1+i+1, end);//right child is the remaining part!
			//now we have to go through a nested loop to assign each left/right to root!
			for(BinaryTree9 eachLeft: leftChildren) {
				for(BinaryTree9 eachRight: rightChildren) {
					BinaryTree9 tempRoot = new BinaryTree9(preorder[start]);//everytime we make a copy of root
					tempRoot.left = eachLeft;
					tempRoot.right = eachRight;
					//do not forget to add to our return LIST!
					returnTrees.add(tempRoot);
				}
			}
		}
		//and finally do not forget to return the returnTrees list
		return returnTrees;
	}
}
//firstly we define our simple BinaryTree class
class BinaryTree9 {
	int value;
	BinaryTree9 left;
	BinaryTree9 right;
	//contructor
	public BinaryTree9(int k) {
		value = k;
	}
	//we also define an in-order print method
	public void PrintInOrder() {
		inOrderTraversal(this);
		System.out.println();//add a new line for formatting
	}
	private void inOrderTraversal(BinaryTree9 root) {
		if(root==null) return;
		inOrderTraversal(root.left);
		System.out.print(root.value);
		inOrderTraversal(root.right);
	}
}

