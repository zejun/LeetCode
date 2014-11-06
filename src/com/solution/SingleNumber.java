package com.solution;

import java.util.HashMap;

public class SingleNumber {
	
	public static int solution(int[] A){
		
		int singleNumber;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); 
		
		if(A==null||A.length==0)
			return -1;
		
		for(int i=0;i<A.length;i++){
			if(map.containsKey(A[i])){
				Integer times = map.get(A[i]);
				map.put(A[i], 2);
			}else{
				map.put(A[i], 1);
			}
		}
		
		for(int i=0;i<A.length;i++){
			if(map.get(A[i])==1){
				singleNumber = A[i];
				return singleNumber;
			}
		}
		
		return 0;
	}
	
	public static int solutionII(int[] A){
		if(A==null||A.length==0){
			return -1;
		}
		
		int res = 0;
		
		for(int i=0;i<A.length;i++){
			res ^= A[i];
		}
		
		return res;
	}

}
