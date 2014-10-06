package com.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.structure.TreeNode;

public class BinaryTreePostOrderTraversal {

	public static List<Integer> postOrderTraversal(TreeNode root){
		
		List<Integer> result = new ArrayList<Integer>();
		Stack<Integer> tem = new Stack<Integer>();
		
		for(int i=0;i<5;i++){
			result.add(i);
		}
		
		return result;
		
	}
	
}
