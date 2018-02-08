package pers.xRay.JavaDataStructure.basic;

import java.util.Scanner;

public class BTree {
		
	public static class TreeNode {
		
		private int data;
		
		private TreeNode parent=null;
		private TreeNode left=null;
		private TreeNode right=null;
		
		public void setValue(int input) {
			data = input;
		}
		public int getValue() {
			return data;
		}
		
		public void setParent(TreeNode input) {
			parent = input;
		}
		public TreeNode getParent() {
			return parent;
		}
	    public void setLeft(TreeNode input) {
	    	left = input;
	    }
	    public TreeNode getLeft() {
	    	return left;
	    }
	    public void setRight(TreeNode input) {
	    	right = input;
	    }
	    public TreeNode getRight() {
	    	return right;
	    }
		
	}
	
	public static class BinaryTree{
		private TreeNode root = null;
		private int size = 0;
		
		public int getSize() {
			return size;
		}
		public TreeNode getRoot() {
			return root;
		}
		public void setRoot(TreeNode node) {
			root = node;
		}
		public void preOrder(TreeNode node){
			if(node != null){
				System.out.println(node.getValue());
			}	
			if(node.getLeft() != null) {
				preOrder(node.getLeft());
			}
			if(node.getRight() != null) {
				preOrder(node.getRight());
			}
		}
		public void inOrder(TreeNode node){
			if (node == null) return;
			if(node.getLeft() != null) {
				inOrder(node.getLeft());
			}
			System.out.print(node.getValue());
			if(node.getRight() != null) {
				inOrder(node.getRight());
			}
		}
		public void addLeft(TreeNode parent,TreeNode child) {
			if (parent.getLeft() == null){
				parent.setLeft(child);
				child.setParent(parent);
			}
		}
		public void addRight(TreeNode parent,TreeNode child) {
			if(parent.getRight() == null) {
				parent.setRight(child);
				child.setParent(parent);
			}
		}
		public void insert(TreeNode node, TreeNode child) {
			if(root == null)	setRoot(child);
			if(node == null)	node = child;
			else if (node.getValue()>=child.getValue()) {
				if (node.getLeft()==null) addLeft(node, child);
				else insert(node.getLeft(), child);
			}
			else if (node.getValue()<child.getValue()) {
				if (node.getRight()==null) addRight(node, child);
				else insert(node.getRight(), child);
			}
		}
	}	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		BinaryTree adt = new BinaryTree();

		
		while(true) {
			System.out.println("input choice(q:quit/i:add/p:preOrder):");
			String choice = scan.next();
			
			switch (choice) {
			case "q":
				System.exit(0);
			case "i":	
				TreeNode node = new TreeNode();
				System.out.print("please input value: ");	
				node.setValue(scan.nextInt());
				adt.insert(adt.getRoot(), node);
				break;
			case "m":
				adt.inOrder(adt.getRoot());
				break;
			case "p":
				adt.preOrder(adt.getRoot());
				break;
			}
		}
	}
}
