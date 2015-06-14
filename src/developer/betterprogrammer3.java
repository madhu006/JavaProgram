package developer;

import java.util.List;

import developer.betterprogrammer3.Node;

public class betterprogrammer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1 = new  Nodal();
		Node node2 = new  Nodal();
		Node node3 = new  Nodal();
		Node node4 = new  Nodal();
		Node node5 = new  Nodal();
		node1.
		
		getLargestRootToLeafSum(node1);
	}
	
	// Please do not change this interface
	public static interface Node {
	    int getValue();
	    List<Node> getChildren();
	}

    

    public static int getLargestRootToLeafSum(Node root) {
	
        /*
          A root-to-leaf path in a tree is a path from a leaf node through all its ancestors
          to the root node inclusively.
          A "root-to-leaf sum" is a sum of the node values in a root-to-leaf path.

          Please implement this method to
          return the largest root-to-leaf sum in the tree.
          
         */
    	Node largestNode = null;
    	int templargest = 0;
    	int sum =root.getValue();
    	while(root!=null){
    	for(int i=0;i<root.getChildren().size();i++){
    		sum = sum+ root.getValue();
    		if(sum>templargest){
    			templargest = sum;
    			largestNode = root.getChildren().get(i);
    			sum = root.getValue();
    		}		
    	}
    	sum = templargest;
    	root =largestNode;
    	}
    	return sum;
    }
    
}
class  Nodal implements betterprogrammer3.Node{

	int value;
	List<Node> nodesList;
	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Node> getChildren() {
		// TODO Auto-generated method stub
		return nodesList;
	}
	
}

