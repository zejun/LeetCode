package com.solution.test;

import java.util.ArrayList;

public class Transform {
	
	public static ArrayList matrixToList(int[][] input){
		ArrayList result = new ArrayList();
		
		for (int i = 0; i < input.length; i++){
			ArrayList<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j < input[i].length; j++){
				row.add(input[i][j]);
			}
			result.add(row);
		}
		return result;
		
		}

}
