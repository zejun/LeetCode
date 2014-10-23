package com.solution;

import java.util.Set;

public class WordBreak {
	
	/**
	 * Word break I for leetcode 
	 * @param input
	 * @param dict
	 * @return
	 */
	public static boolean wordBreakSlu(String input,Set<String> dict){
		if(input==null||input.length()==0)
			return false;
		
		int checkLength = input.length();
		boolean[] canSegment = new boolean[input.length()+1];
		
		int maxLength = 0;
		for(String word:dict){
			if(word.length()>maxLength)
				//maxLength = word.length();
				maxLength = Math.max(maxLength, word.length());
		}
		System.out.println(maxLength);
		canSegment[0] = true;
		for(int i=1;i<=checkLength;i++){
			canSegment[i] = false;
			for(int j=1;j<=maxLength&&j<=i;j++){
				if(!canSegment[i-j]){
					continue;
				}
				String tem = input.substring(i-j, i);
				if(dict.contains(tem)){
					canSegment[i]=true;
					break;
				}
			}
		}
		
		return canSegment[input.length()];
	}
	
	

}
