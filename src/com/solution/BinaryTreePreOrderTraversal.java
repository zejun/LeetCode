package com.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.structure.TreeNode;

public class BinaryTreePreOrderTraversal {

	public static List<Integer> binaryTreePreorder(TreeNode root){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> nodes = new Stack<TreeNode>();
		
		if(root==null)
			return result;
		
		nodes.push(root);
		
		while(!nodes.isEmpty()){
			TreeNode tem = nodes.pop();
			result.add(tem.val);
			
			if(tem.right!=null){
				nodes.push(tem.right);
			}
			
			if(tem.left!=null){
				nodes.push(tem.left);
			}
			
		}
		
		
		return result;
		
	}
	
	public static List<Integer> binaryTreePreorderTravel(TreeNode root){
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		travsal(root,result);
		
		return result;
	}
	
	private static void travsal(TreeNode root,ArrayList<Integer> result){
		
		if(root==null){
			return;
		}
		
		result.add(root.val);
		travsal(root.left,result);
		travsal(root.right,result);
		
		
	}
	
}
