package com.solution;

public class Rotate {

	/**
	 * rotate string with index
	 * @param input
	 * @param index
	 * @return
	 */
	public static String rotateString(String input, int index){
		
		String firstRotate = rotateStringHelper(input);
		String secondRotate = rotateStringHelper(firstRotate.substring(0,input.length()-index-1));
		String thirdRotate = rotateStringHelper(firstRotate.substring(input.length()-index-1,input.length()));
		
		return secondRotate+thirdRotate;
	}
	
	private static String rotateStringHelper(String input){
		String result = "";
		for(int i = input.length()-1; i >= 0; i--){
			result += input.charAt(i);
		}
		
		return result;
	}
	
}
