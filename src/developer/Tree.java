package developer;



import java.util.ArrayList;

public class Tree<T> {

	private Nodes<T> root;

	public Tree(Nodes<T> root) {
		this.root = root;
	}

	public boolean isEmpty() {
		return (root == null) ? true : false;
	}

	public Nodes<T> getRoot() {
		return root;
	}

	public void setRoot(Nodes<T> root) {
		this.root = root;
	}

	public boolean exists(T key) {
		return find(root, key);
	}

	public int getNumberOfNodes() {
		return getNumberOfDescendants(root) + 1;
	}

	public int getNumberOfDescendants(Nodes<T> node) {
		int n = node.getChildren().size();
		for (Nodes<T> child : node.getChildren())
			n += getNumberOfDescendants(child);

		return n;

	}

	private boolean find(Nodes<T> node, T keyNode) {
		boolean res = false;
		if (node.getData().equals(keyNode))
			return true;

		else {
			for (Nodes<T> child : node.getChildren())
				if (find(child, keyNode))
					res = true;
		}

		return res;
	}
	
    private Nodes<T> findNode(Nodes<T> node, T keyNode)
    {
    	if(node == null)
    		return null;
    	if(node.getData().equals(keyNode))
    		return node;
    	else
    	{
    		Nodes<T> cnode = null;
    		for (Nodes<T> child : node.getChildren())
    			if ((cnode = findNode(child, keyNode)) != null)
    				return cnode;
    	}
    	return null;         
    } 

	public ArrayList<Nodes<T>> getPreOrderTraversal() {
		ArrayList<Nodes<T>> preOrder = new ArrayList<Nodes<T>>();
		buildPreOrder(root, preOrder);
		return preOrder;
	}

	public ArrayList<Nodes<T>> getPostOrderTraversal() {
		ArrayList<Nodes<T>> postOrder = new ArrayList<Nodes<T>>();
		buildPostOrder(root, postOrder);
		return postOrder;
	}

	private void buildPreOrder(Nodes<T> node, ArrayList<Nodes<T>> preOrder) {
		preOrder.add(node);
		for (Nodes<T> child : node.getChildren()) {
			buildPreOrder(child, preOrder);
		}
	}

	private void buildPostOrder(Nodes<T> node, ArrayList<Nodes<T>> postOrder) {
		for (Nodes<T> child : node.getChildren()) {
			buildPostOrder(child, postOrder);
		}
		postOrder.add(node);
	}

	public ArrayList<Nodes<T>> getLongestPathFromRootToAnyLeaf() {
		ArrayList<Nodes<T>> longestPath = null;
		int max = 0;
		for (ArrayList<Nodes<T>> path : getPathsFromRootToAnyLeaf()) {
			if (path.size() > max) {
				max = path.size();
				longestPath = path;
			}
		}
		return longestPath;
	}

	public int getMaxDepth()
	{
		return getLongestPathFromRootToAnyLeaf().size();
	}
	
	public ArrayList<ArrayList<Nodes<T>>> getPathsFromRootToAnyLeaf() {
		ArrayList<ArrayList<Nodes<T>>> paths = new ArrayList<ArrayList<Nodes<T>>>();
		ArrayList<Nodes<T>> currentPath = new ArrayList<Nodes<T>>();
		getPath(root, currentPath, paths);

		return paths;
	}

	private void getPath(Nodes<T> node, ArrayList<Nodes<T>> currentPath,
			ArrayList<ArrayList<Nodes<T>>> paths) {
		if (currentPath == null)
			return;

		currentPath.add(node);

		if (node.getChildren().size() == 0) {
			// This is a leaf
			paths.add(clone(currentPath));
		}
		for (Nodes<T> child : node.getChildren())
			getPath(child, currentPath, paths);

		int index = currentPath.indexOf(node);
		for (int i = index; i < currentPath.size(); i++)
			currentPath.remove(index);
	}

	private ArrayList<Nodes<T>> clone(ArrayList<Nodes<T>> list) {
		ArrayList<Nodes<T>> newList = new ArrayList<Nodes<T>>();
		for (Nodes<T> node : list)
			newList.add(new Nodes<T>(node));

		return newList;
	}
}