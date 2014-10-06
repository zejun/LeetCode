package com.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.structure.TreeNode;

public class BinaryTreePostOrderTraversal {

	public static List<Integer> postOrderTraversal(TreeNode root){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if(root == null){
			return result;
		}
		
		result.addAll(postOrderTraversal(root.left));
		result.addAll(postOrderTraversal(root.right));
		result.add(root.val);
		
		
		return result;
		
	}
	
	public static List<Integer> postOrderTraversalIteratively(TreeNode root){
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if(root == null){
			return result;
		}
		
		Stack<TreeNode> node = new Stack<TreeNode>();
		
		
		node.push(root);
		
		while(!node.isEmpty()){
			
			
		}
		
		
	}
	
}
