package com.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    
    /**
     * Palindrome partition
     * @param s
     * @return
     */
    
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<List<String>>();
        if (s == null || s == ""){
            return result;
        }
        List<String> row = new ArrayList<String>();
        int index = 0;
        search(s, row, index, result);
        return result;
    }
    
    private static void search(String s, List<String> row, int index, List<List<String>> result){
    
        if (index == s.length()){
            result.add(new ArrayList<String>(row));
            return;
        }
        
        //judge the last element of tem add char is a palindrom
        for (int i = index + 1; i <= s.length(); i++){
        	String prefix = s.substring(index, i);
        	if (!isValid(prefix)){
        		continue;
        	}
            row.add(prefix);
            search(s, row, i, result);
            row.remove(row.size() - 1);
        }
    }
    
    private static boolean isValid(String s){
        int i = 0;
        int j = s.length() - 1;
        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    public static ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (nums.length == 0){
            return result;
        }
        
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
            	System.out.println("i "+i+" j "+j+" num "+nums[i]+" "+nums[j]);
                if (nums[i] + nums[j] == 0){
                    result.add(i);
                    result.add(j);
                    
                    return result;
                } 
                
            }
        }
        result.add(0);
        result.add(0);
        return result;
    }
	
}
