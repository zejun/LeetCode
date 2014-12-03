package com.solution;

import java.util.ArrayList;
import java.util.Collections;

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
		if (list.size() == nums.size()){
			
			result.add(new ArrayList<Integer>(list));
			return;
		}
		
		for (int i = 0; i < nums.size(); i++){
			if (list.contains(nums.get(i))){
				continue;
			}
			list.add(nums.get(i));
			helper(result, list, nums);
			list.remove(list.size() - 1);
		}
	}
	
	/**
	 * Subset
	 */
	public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> S) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (S == null || S.size() == 0){
            return result;
        }
        Collections.sort(S);
        result = helper(S, 0);
        return result;
    }
    
    private ArrayList<ArrayList<Integer>> helper(ArrayList<Integer> S, int pos){
        
        if (S.size() == pos){
            ArrayList<Integer> temList = new ArrayList<Integer>();
            ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
            result.add(temList);
            return result;
        }
        
        int num = S.get(pos);
        ArrayList<ArrayList<Integer>> temList = helper(S, pos + 1);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < temList.size(); i++){
            ArrayList<Integer> tem = temList.get(i);
            result.add(tem);
            tem.add(0, num);
            result.add(tem);
        }
        return result;
    }
	
}
