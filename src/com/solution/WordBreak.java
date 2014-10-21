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
		if(input==null||input.equals(""))
			return false;
		
		int checkLength = input.length();
		System.out.println(checkLength);
		
		
		for(int i=0;i<checkLength;i++){
			for(int j=i+1;j<=checkLength;j++){
				String tem = input.substring(i, j);
				
				if(dict.contains(tem)){
					return true;
				}
				
			}
		}
		
		return false;
	}

}
