package com.veritone;

public class App {
	public static void main(String[] args) {
		BinarySearchTree<Integer> bst =  new BinarySearchTree<Integer>();
		
		bst.insert(12);
		bst.insert(11);
		bst.insert(90);
		bst.insert(82);
		bst.insert(7);
		bst.insert(9);
		
		bst.printDeepestNode();
		
	}
}
