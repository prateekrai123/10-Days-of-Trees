package day_2;

import java.util.Scanner;

class Node {
	int data;
	Node left, rigth;
	
	public Node(int data) {
		this.data = data;
	}
}

public class binaryTree {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		createTree();
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
		root.rigth = createTree();
		return root;
	}

}
