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
		if(input==null)
			return false;
		
		int checkLength = input.length();
		
		
		for(int i=0;i<checkLength;i++){
			for(int j=i+1;j<=checkLength;j++){
				String tem = input.substring(i, j);
				System.out.println(tem);
				if(dict.contains(tem)){
					dict.remove(tem);
					if(j<checkLength)
						return wordBreakSlu(input.substring(j,checkLength),dict);
					else
						return true;
				}
				
			}
		}
		
		return false;
	}
	
	

}
