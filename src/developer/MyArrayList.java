package developer;

import java.util.Arrays;

/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class MyArrayList {
	
	private Object[] myStore;
	private int actSize =0;
	
	public MyArrayList(){
		myStore = new Object[10];		
	}
	
	public Object get(int index){
		if(index<actSize)
			return myStore[index];
		else
			throw new ArrayIndexOutOfBoundsException();
	}

	public void add(Object obj){
		if(myStore.length - actSize <= 5){
			increaseListSize();
		}
		myStore[actSize++] = obj;
	}
	
	public Object remove(int index){
		if(index < actSize){
			Object obj = myStore[index];
			myStore[index] = null;
			int tmp = index;
			while(tmp<actSize){
				myStore[tmp] = myStore[tmp+1];
				myStore[tmp+1] = null;
				tmp++;
			}
			actSize--;
			return obj;
		} else 
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public int size(){
		return actSize;
	}
	
	private void increaseListSize(){
		myStore = Arrays.copyOf(myStore, myStore.length*2);
		System.out.println("New length"+myStore.length);
	}
		
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyArrayList al = new MyArrayList();
		al.add(new Integer(2));
		al.add(new Integer(5));
		al.add(new Integer(1));
		al.add(new Integer(23));
		al.add(new Integer(14));
		al.add(new Integer(55));
		
		for(int i =0;i<al.size();i++)
			System.out.println(al.get(i));
		
		al.add(new Integer(29));
		System.out.println("Element at Index 5" + al.get(5));
		System.out.println("list size"+ al.size());
		System.out.println("remove element at index 2"+al.remove(2));
		
		for(int j=0;j<al.size();j++)
			System.out.println(al.get(j));
	
	

	}

}
