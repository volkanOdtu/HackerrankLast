
public class BinaryTree {

	public Node root ;
	
	public void AddNode(Node insertedNode ) 
	{
		Node tempNode = root;
			
		if(root == null ) 
		{
			root = insertedNode ;
			return;
		}
		else
		{
			tempNode = root ;
			
			while(tempNode != null )
			{
				if( tempNode.data > insertedNode.data )
				{
					if(tempNode.leftChild == null)
					{
						tempNode.leftChild =insertedNode;
						return;
					}
					else
						tempNode = tempNode.leftChild; 
				}
				else
				{
					if(tempNode.rightChild == null)
					{
						tempNode.rightChild =insertedNode;
						return;
					}
					else
						tempNode = tempNode.rightChild ;
				}
			}
						
		}
	}
	
	
	
	
	public void TraverseTree()
	{
		TraverseInOrder(root);
	}
	
	public void TraverseInOrder(Node node)
	{
		if(node == null) return;
		
		if(node.leftChild != null)
		{
			TraverseInOrder( node.leftChild  );			
		}
		else
		{
			System.out.println( node.data );
			TraverseInOrder( node.rightChild );
			
		}
		
		
	}
	
}
