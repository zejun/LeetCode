package com.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Set;

import com.structure.ListNode;

public class DynamicProgram {
	
	public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle){
		
		
		if (triangle == null || triangle.size() == 0){
            return 0;
        }
       
		
        int size = triangle.size();
        int[][] min = new int[size][size];
        
        for (int i = 0; i < size; i++){
        	for (int j = 0; j < size; j++){
        		min[i][j] = Integer.MAX_VALUE;
        	}
        }
        
        //initialize
        min[0][0] = triangle.get(0).get(0);
        
        for (int i = 1; i < size; i++){
            for (int j = 0; j <= i; j++){
            	if (j == 0){
            		min[i][j] = min[i-1][j] + triangle.get(i).get(j);
            	} else {
            		//function
                    min[i][j] = Math.min(min[i - 1][j], min[i - 1][j - 1]) 
                    + triangle.get(i).get(j);
            	}
     
            }
        }
        //result
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++){
            mini = Math.min(min[size - 1][i], mini);
        }
        
        System.out.println(min[1][1]);
        
//        for (int i = 1; i < size; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print(min[i][j]+" ");
//            }
//            System.out.println();
//        }
        
        return mini;
	}
	
	public boolean wordSegmentation(String s, Set<String> dict) {
        // write your code here  
        if (s == null || s.length() == 0){
            return true;
        }
        
        boolean[] canSeg = new boolean[s.length()];
        
        canSeg[0] = dict.contains(Character.toString(s.charAt(0)));
        
        for (int i = 1; i < s.length(); i++){
            canSeg[i] = false;
            if (dict.contains(s.substring(0, i + 1))){
                canSeg[i] = true;
                continue;
            }
            
            for (int j = 1; j <= i; j++){
                if (!canSeg[i - j]){
                    continue;
                }
                String sub = s.substring(i - j + 1, i + 1);
                if (dict.contains(sub)){
                    canSeg[i] = true;
                    break;
                } 
            }
        }
        
        return canSeg[s.length() - 1];
    }
	
	public static int backPack(int m, ArrayList<Integer> A){
		
		// write your code here
		
        boolean[][] matrix = new boolean[A.size() + 1][m + 1];
        matrix[0][0] = true;
        for (int i = 1; i < m; i++){
            matrix[0][i] = false;
        }
        for (int i = 1; i <= A.size(); i++){
            for (int j = 0; j <= m; j++){
            	for (int k = 1; k <= i; k++){
            		if (j - A.get(i - k) < 0){
            			matrix[i][j] = matrix[i - k][j];
            		} else {
            			matrix[i][j] = matrix[i - k][j - A.get(i - k)];
            		}
            		if (matrix[i][j])
            			break;
            	}

            }
        }
        
        
        
        int max = 0;
        for (int i = m ; i >=0; i--){
            if (matrix[A.size()][i]){
                max = Math.max(max, i);
                break;
            }
        }
        return max;
	}
}
