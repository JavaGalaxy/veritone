package com.veritone;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {
	
	private Node<T> root;
	int maxLevel = -1;
	int result = -1;

	@Override
	public void insert(T val) {
		if (root == null) {
			root = new Node<>(val, null);
		} else {
			insert(val, root);
		}
	}

	private void insert(T val, Node<T> node) {
		// Compare the node value
		// if incoming value is less then add it as a leftChild
		// else add it as a right child
		if(node.getVal().compareTo(val) < 0) {
			if(node.getLeftChild() != null) {
				insert(val, node.getLeftChild());
			} else {
				node.setLeftChild(new Node<>(val, node));
			}
		} else if(node.getRightChild() != null) {
			insert(val, node.getRightChild());
		} else {
			node.setRightChild(new Node<>(val, node));
		}
	}

	public void printDeepestNode() {
		
		if (root == null) {
			return;
		}
		
		int maxHeight = getDeepestNode(root, 0);
		System.out.println("Deepest, "+result+" Depth, "+maxHeight);
	}

	private int getDeepestNode(Node<T> root, int level) {
		
		if(root != null) {
			int leftHeight = getDeepestNode(root.getLeftChild(), ++level);
			int rightHeight = getDeepestNode(root.getRightChild(), ++level);
			
			if(level > maxLevel) {
				result = (int) root.getVal();
				maxLevel = level;
			}
			
			
			return 1 + Math.max(leftHeight, rightHeight);
		}
		
		return -1;
	}
	

}
