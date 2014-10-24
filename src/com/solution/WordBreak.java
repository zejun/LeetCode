package com.solution;

import java.util.Set;

public class WordBreak {
	
	/**
	 * Word break I for leetcode 
	 * @param input
	 * @param dict
	 * @return
	 */
	public static boolean wordBreakSlu(String s,Set<String> dict){
		
		if(s==null||s.length()==0){
			return false;
		}
		
		int maxLength = 0;
		for(String tem:dict){
			maxLength = Math.max(maxLength, tem.length());
		}
		
		boolean[] canSegment = new boolean[s.length()+1];
		
		canSegment[0] = true;
		
		for(int i=1;i<=s.length();i++){
			canSegment[i] = false;
			for(int j=1;j<=maxLength&&j<=i;j++){
				System.out.println("Loop info i= "+i+" j= "+j);
				if(!canSegment[i-j]){
					System.out.println("can't Segment "+(i-j));
					continue;
				}
				String tem = s.substring(i-j,i);
				System.out.println("Got tem "+tem);
				if(dict.contains(tem)){
					System.out.println("Can segment "+i+" is true");
					canSegment[i]=true;
					break;
				}
			}
		}
		
		return canSegment[s.length()];
	}
	
	

}
