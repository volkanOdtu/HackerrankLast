
public class DoubleLinkedListTest {

	public static void main(String[] args) {

		DoubleLinkedListOps operations = new DoubleLinkedListOps();
		
		operations.insertInFirstPosition("volkan", "222");
		operations.insertInFirstPosition("tennur", "111");
		operations.insertInLastPosition("gul", "333");
		operations.insertInLastPosition("feyz", "444");
		
		operations.insertAfterKey("ali", "3.5", "333"); 
		operations.insertAfterKey("tahir", "2.5", "222"); 
		
		operations.displayList();
	}

}
