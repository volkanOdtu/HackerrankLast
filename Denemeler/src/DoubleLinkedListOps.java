
public class DoubleLinkedListOps {
 
	DoubleLinkedList first =null ;
	//DoubleLinkedList last =null ;
					
	public void insertInFirstPosition(String homeAddress ,String homeNumber )
	{
		DoubleLinkedList newItem ;
		
		if( first == null)
		{
			first = new DoubleLinkedList(homeAddress, homeNumber);
			first.next = null;
			first.previous = null;
		}		
		else
		{
			newItem = new DoubleLinkedList(homeAddress, homeNumber);
			
			first.previous = newItem;
			newItem.next = first;
			first = newItem ;
		}
	}
	
	public void insertInLastPosition(String homeAddress ,String homeNumber )
	{
		DoubleLinkedList newItem ;
		DoubleLinkedList tempItem;
		
		
		if( first == null)
		{
			first = new DoubleLinkedList(homeAddress, homeNumber);
			first.next = null;
			first.previous = null;
		}		
		else
		{
			newItem = new DoubleLinkedList(homeAddress, homeNumber);
			
			if(first.next == null)
			{
				first.next = newItem;
				newItem.previous = first;
			}
			else
			{
				tempItem = first;
				//we are trying to find the last item
				while(tempItem.next != null)
				{
					tempItem =tempItem.next;
				}
				
				tempItem.next = newItem;
				newItem.previous = tempItem;				
			}
		}
	}
	
	public void insertAfterKey(String homeAddress ,String homeNumber ,String key)
	{
		DoubleLinkedList newItem = new DoubleLinkedList(homeAddress, homeNumber);
		DoubleLinkedList tempItem = first;
		DoubleLinkedList nextItem ;
		
		while(tempItem.homeNumber != key  )
		{
			tempItem = tempItem.next;			
		}
		
		//we found the key item and move the items forward
		nextItem = tempItem.next;  
		tempItem.next = newItem;
		newItem.previous = tempItem;
		newItem.next = nextItem;
		nextItem.previous = newItem;
		
	}
	
	public void displayList()
	{
		DoubleLinkedList tempItem = first;
		
		while(tempItem != null )
		{
			System.out.println( tempItem.homeAddress + " " + tempItem.homeNumber);
			tempItem = tempItem.next ; 
		}
	}
	
}
