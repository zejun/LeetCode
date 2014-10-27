package com.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
	
	
	public static List<String> wordBreakII(String s, Set<String> dict){
		//initial the hash map for the memo
		Map<String,List<String>> memo = new HashMap<String,List<String>>();
		//return the value calculated by the word break helper
		return wordBreakIIhelper(s,dict,memo);
	}
	
	private static List<String> wordBreakIIhelper(String s,Set<String> dict,Map<String,List<String>> memo){
		if(s.length()<=0){
			return null;
		}
		
		if(memo.containsKey(s))
			return memo.get(s);
		else{
			int strLength = s.length();
			ArrayList<String> result = new ArrayList<String>();
			
			for(int i=1;i<s.length();i++){
				String prefix = s.substring(0, i);
				
				if(dict.contains(prefix)){
					//finished for the current string
					if(i==strLength){
						result.add(prefix);
						
					}else{
						String postFix = s.substring(i);
						List<String> temResult = wordBreakIIhelper(postFix,dict,memo);
						for(String item:temResult){
							item=prefix+" "+item;
							result.add(item);
						}
						
					}
				}
			}
			memo.put(s, result);
			return result;
		}
		
		
	}
	
}
