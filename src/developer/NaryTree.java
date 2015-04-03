package developer;

public class NaryTree<T> {
	
	
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTree<Integer> pt = new PrintTree<Integer>();
		pt.print();
		
	
	}

}

class PrintTree<T>{
	
	public void print(){
	Integer data = 5;
	Integer data1 = 6;
	Integer data2 = 7;
	Integer data3 = 8;
	Integer data4 = 9;
	Integer data5 = 10;
	
	
	Nodes<Integer> node1 = new Nodes<Integer>(data);
	
	Nodes<Integer> child1 = new Nodes<Integer>(data1);
	Nodes<Integer> child2 = new Nodes<Integer>(data2);
	Nodes<Integer> child3 = new Nodes<Integer>(data3);
	Nodes<Integer> child4 = new Nodes<Integer>(data4);
	Nodes<Integer> child5 = new Nodes<Integer>(data5);
	
	
	node1.setData(data);
	node1.addChild(child1);
	node1.addChild(child2);
	node1.addChild(child3);		
	child2.addChild(child4);
	child2.addChild(child5);
	
	Tree<Integer> tree = new Tree<Integer>(node1);
	System.out.println("Total number of nodes "+tree.getNumberOfNodes());
	
	java.util.ArrayList<Nodes<Integer>> preOrderTraversal = tree.getPreOrderTraversal();
	
	for(Nodes<Integer> node : preOrderTraversal){
		if(node != preOrderTraversal.get(0) && node.getParent().getChildren().contains(node.getData())  ){
		System.out.println(node.getData()+ " "+ node.getChildren());
		continue;
		}
		System.out.println(node.getData()+ " "+ node.getChildren());
		System.out.println();
		
	}
		
	}

}


