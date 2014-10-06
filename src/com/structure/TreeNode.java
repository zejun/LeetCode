package com.structure;

public class TreeNode {

	public int val;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(int x){
		this.val = x;
		this.left = null;
		this.right = null;
	}
	
	public void setLeft(TreeNode left){
		this.left = left;
	}
	
	public TreeNode getLeft(){
		return this.left;
	}
	
	public void setRight(TreeNode right){
		this.right = right;
	}
	
	public TreeNode getRight(){
		return this.right;
	}
	
	public int getVal(){
		return this.val;
	}
	
	public void setVal(int value){
		this.val=value;
	}
	
}
