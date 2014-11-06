package com.solution;

import java.util.HashMap;

public class SingleNumber {
	
	public static int solution(int[] input){
		
		int singleNumber;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); 
		
		for(int i=0;i<input.length;i++){
			if(map.containsKey(input[i])){
				Integer times = map.get(input[i]);
				map.put(input[i], 2);
			}else{
				map.put(input[i], 1);
			}
		}
		
		for(int i=0;i<input.length;i++){
			if(map.get(input[i])==1){
				singleNumber = input[i];
				return singleNumber;
			}
		}
		
		return 0;
	}

}
