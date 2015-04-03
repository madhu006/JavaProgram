package developer;

import java.util.LinkedList;
import java.util.Queue;


public class TreeLevelPrint {
	
	public static void main(String[] args){
		//Lets create a binary tree
		// 1
		//  2 3
		//  4 5 6 7
		
		Tree3 myTree = new Tree3(1);
		myTree.left = new Tree3(2);
		myTree.right = new Tree3(3);
		myTree.left.left = new Tree3(4);
		myTree.left.right = new Tree3(5);
		myTree.right.left = new Tree3(6);
		myTree.right.right = new Tree3(7);
		
		System.out.println("3rd level is");
		
		PrintTreeLevel(myTree,2);
		
	System.out.println("\n Recurrsion 3rd level is");
		
		PrintTreeLevel(myTree,0,2);
		
		
	}
	
	public static void PrintTreeLevel(Tree3 t, int currentLevel, int desire)
	{
		if(t==null|| currentLevel>desire)
			return;
		if(currentLevel == desire)
			System.out.print(t.value+ " ");
		else{
			PrintTreeLevel(t.left,currentLevel+1,desire);
			PrintTreeLevel(t.right,currentLevel+1,desire);
			
		}
	}

	public static void PrintTreeLevel(Tree3 t, int desire)
	{
		if(desire<0) return;
		
		Queue<Tree3> trees = new LinkedList<Tree3>();
		Queue<Integer> levels = new LinkedList<Integer>();
		
		trees.add(t);
		levels.add(0);
		
		while(!trees.isEmpty()){
			Tree3 temp = trees.poll();
			int currentLevel = levels.poll();
			if(temp==null) return;
			else if(currentLevel == desire)
				System.out.print(temp.value +" ");
			else
			{
				trees.add(temp.left); levels.add(currentLevel +1);
				trees.add(temp.right); levels.add(currentLevel +1);
				
			}
		}
	}
}

class Tree3{
	
	public int value;
	public Tree3 left;
	public Tree3 right;
	public Tree3(int a)
	{
		value =a;
		left = right = null;
	}
}
