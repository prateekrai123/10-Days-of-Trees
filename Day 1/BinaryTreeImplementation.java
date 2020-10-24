package day_1;

class Node {
	int key;
	Node left, right;
	
	public Node(int item) {
		key = item;
		left = right = null;
	}
}

public class BinaryTreeImplementation {
	
	Node root;
	
	public BinaryTreeImplementation() {
		root = null;
	}
	
	public BinaryTreeImplementation(int key) {
		root = new Node(key);
	}

	public static void main(String[] args) {
		BinaryTreeImplementation binaryTree = new BinaryTreeImplementation(1);
		
		binaryTree.root = new Node(1);
		
		binaryTree.root.left = new Node(2);
		
		binaryTree.root.right = new Node(3);
		
		System.out.print(binaryTree.root);
		
	}

}
