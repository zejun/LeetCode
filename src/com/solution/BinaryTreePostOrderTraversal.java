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
		
		
		TreeNode prev = null;
		
		node.push(root);
		
		while(!node.isEmpty()){
			TreeNode curr = node.peek();
			
			//travel up to down
			if(prev==null||prev.left==curr||prev.right==curr){
				if(curr.left!=null){
					node.push(curr.left);
				}else if(curr.right!=null){
					node.push(curr.right);
				}
			}
			//travel backward
			else if(curr.left==prev){
				if(curr.right!=null){
					node.push(curr.right);
				}
			}
			//other pop the tree node value 
			else{
				result.add(curr.val);
				node.pop();
			}
			prev = curr;
		}
		
		return result;
		
		
	}
	
}
