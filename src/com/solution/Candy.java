package com.solution;

import java.util.Arrays;

public class Candy {

	public static int solution(int[] ratings){
		
		int result = 0;
		int[] tem = new int[ratings.length];
		Arrays.fill(tem, 1);
		
		for(int i=1;i<ratings.length;i++){
			if(ratings[i]>ratings[i-1]&&tem[i]<=tem[i-1]){
				tem[i]=tem[i-1]+1;
			}
		}
		
		for(int i=ratings.length-1;i>=1;i--){
			if(ratings[i]<ratings[i-1]&&tem[i]>=tem[i-1]){
				tem[i-1]=tem[i]+1;
			}
			result = result+tem[i];
		}
		result = result+tem[0];
		return result;
	}
	
}
