package com.solution.test;

import java.util.ArrayList;

import com.solution.DynamicProgram;

public class DynamicProgramTest {

	public static void triangleMatrix(){
		int[][] test = {{1},{2,3}};
		Transform.matrixToList(test);
		int result = DynamicProgram.minimumTotal(Transform.matrixToList(test));
		
		System.out.println(result);
	}
	
	
	
}
