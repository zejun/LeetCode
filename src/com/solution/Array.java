package com.solution;

import java.util.ArrayList;

public class Array {

	/**
	 * Permutations
	 */
	public static ArrayList<ArrayList<Integer>> permutation(ArrayList<Integer> nums){
		ArrayList result = new ArrayList();
		if (nums == null){
			return result;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		helper(result,list,nums);
		return result;
		
	}
	
	private static void helper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, ArrayList<Integer> nums){
		
	}
	
}
