package com.solution;

import java.util.ArrayList;
import java.util.List;

import com.structure.TreeNode;

public class BinaryTreePostOrderTraversal {

	public static List<Integer> postOrderTraversal(TreeNode root){
		
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i=0;i<5;i++){
			result.add(i);
		}
		
		return result;
		
	}
	
}
