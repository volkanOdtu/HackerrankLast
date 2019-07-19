
public class BinaryTreeDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree binaryTree = new BinaryTree();
		

		binaryTree.AddNode(  new Node(50));
		binaryTree.AddNode(  new Node(25));
		binaryTree.AddNode(  new Node(15));
		binaryTree.AddNode(  new Node(2));
		binaryTree.AddNode(  new Node(18));
		binaryTree.AddNode(  new Node(30));
		binaryTree.AddNode(  new Node(75));

		binaryTree.TraverseTree();
	}

}
