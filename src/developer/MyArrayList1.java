package developer;

import java.util.Arrays;

/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class MyArrayList1 {
	private Object[] myStore;
	int actSize =0;
	
	public MyArrayList1(){
		myStore = new Object[10];
	}
	
	public Object[] add(Object newObj){
		if(myStore.length - actSize<5)
			increaseArraySize();
		 myStore[actSize ++]= newObj;
		 return myStore;	
		 
	}
	
	private Object[] increaseArraySize() {
		myStore = Arrays.copyOf(myStore, myStore.length*2);
		return myStore;
	}

	public int size(){
		return actSize;		
	}
	public Object[] remove(int index){
		if(index<actSize){
			myStore[index] = null;
			int tmp = index;
		while(tmp<actSize){		
			myStore[tmp] = myStore[tmp +1];
			myStore[tmp +1]= null;
			tmp++;
		}
		actSize--;
		return myStore;
		}
		else throw new ArrayIndexOutOfBoundsException();
			
	}

	public Object get(int index){
		if(index<actSize){
			return myStore[index];		
		}
		else{
			throw new ArrayIndexOutOfBoundsException();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList1 mal = new MyArrayList1();
		mal.add(23);
		mal.add(45);
		mal.add(63);
		mal.add(19);
		System.out.println("Value of"+mal.get(2));
		for(int k=0;k<mal.size();k++)
			System.out.print("  "+mal.get(k));
		System.out.println();
		mal.size();
		mal.remove(2);	
		for(int k=0;k<mal.size();k++)
			System.out.print(" " +mal.get(k));
		

	}

}
