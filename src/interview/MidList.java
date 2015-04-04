package interview;


class MidList 
{
	//now let's create a test case
	public static void main(String[] args)
	{
		List1 myList = new List1(1);
		myList.next = new List1(2);
		myList.next.next = new List1(3);
		myList.next.next.next = new List1(4);
		myList.next.next.next.next = new List1(5);//1,2,3,4,5 so the mid point is expected to be 3
		myList.next.next.next.next.next = new List1(6);
		myList.next.next.next.next.next.next = new List1(7);//1,2,3,4,5,6,7 so mid point expected to be 4
		MidList(myList);
	}

	//now we try to implement the method, as we discussed in slide we need two support variables
	static int myListLength = 0;//this is to keep track of length
	static int currentReverseIndex = 0;//this is to keep track of index in reverse order
	//notice, this method does not return the value, this is somehow similar as a traversal
	public static void MidList(List1 myList)
	{
		//firstly we proceed the length and do the recursion
		if(myList!=null)
		{
			myListLength++;
			MidList(myList.next);
			//after recursion, we can update the current index, and if you look at control flow, the next
			//statement won't be first executed until we reach last node
			currentReverseIndex++;
		}
		//now we only need to decide if currentReverseIndex/myListLength=1/2
		if(currentReverseIndex*2==myListLength || currentReverseIndex*2==myListLength+1)//myListLength can be even or odd
			System.out.println("Find mid point: "+myList.value);
	}
}	
//create a test linked list class
class List1
{
	int value;
	List1 next;
	public List1(int a)
	{
		value = a;
	}
}

