package day_2;

import java.util.Scanner;

class Node {
	int data;
	Node left, right;
	
	public Node(int data) {
		this.data = data;
	}
}

public class TraversalsInBinaryTree {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Node root = createTree();
		printInOrder(root);
		System.out.println();
		printPreOrder(root);
		System.out.println();
		printPostOrder(root);
		System.out.println();
	}

	static Node createTree() {
		Node root = null;
		
		System.out.println("Enter Data :- ");
		int data = sc.nextInt();
		if(data == -1) 
			return root;
		root = new Node(data);
		System.out.println("Enter left data for :- " + data);
		root.left = createTree();
		System.out.println("Enter right data for :- "+data);
		root.right = createTree();
		return root;
	}
	
	static void printInOrder(Node root) {
		if(root == null) {
			return;
		}
		printInOrder(root.left);
		System.out.print(root.data+" ");
		printInOrder(root.right);
	}
	
	static void printPreOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		printPreOrder(root.left);
		printPreOrder(root.right);
	}
	
	static void printPostOrder(Node root) {
		if(root == null) {
			return;
		}
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.print(root.data+" ");
	}

}
