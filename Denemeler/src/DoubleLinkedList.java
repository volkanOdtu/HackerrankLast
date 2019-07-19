
public class DoubleLinkedList {
	
	public String homeAddress;
	public String homeNumber;
	
	public DoubleLinkedList next = null;
	public DoubleLinkedList previous = null;
	
	public DoubleLinkedList(String homeAddress ,String homeNumber)
	{
		this.homeAddress = homeAddress;
		this.homeNumber = homeNumber;		
	}

}
