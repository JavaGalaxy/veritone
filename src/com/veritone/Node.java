package com.veritone;

public class Node<T> {
	private T val;
	private Node<T> leftChild, rightChild;
	private Node<T> parentNode;
	
	public Node(T val, Node<T> parentNode) {
		this.val = val;
		this.parentNode = parentNode;
	}
	
	public T getVal() {
		return val;
	}
	public void setVal(T val) {
		this.val = val;
	}
	
	
	public Node<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}

	public Node<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}

	public Node<T> getParentNode() {
		return parentNode;
	}
	public void setParentNode(Node<T> parentNode) {
		this.parentNode = parentNode;
	}

	@Override
	public String toString() {
		return "Node [val=" + val + "]";
	}
	
	
}
