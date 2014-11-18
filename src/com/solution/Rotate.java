package com.solution;

public class Rotate {

	/**
	 * rotate string with index
	 * @param input
	 * @param index
	 * @return
	 */
	public static String rotateString(String input, int index){
//		System.out.println("1 "+input+" "+input.length());
//		String firstRotate = rotateStringHelper(input);
//		System.out.println("2 "+firstRotate+" "+firstRotate.length());
//		System.out.println("3 "+firstRotate.substring(0,input.length()-index));
//		String secondRotate = rotateStringHelper(firstRotate.substring(0,input.length()-index-1));
//		System.out.println("4 "+secondRotate+" "+secondRotate.length());
//		System.out.println(firstRotate.substring(input.length()-index,input.length()));
//		String thirdRotate = rotateStringHelper(firstRotate.substring(input.length()-index-1,input.length()));
		
		//rewrite
		String firstRotate = rotateStringHelper(input.substring(0,index));
		String secondRotate = rotateStringHelper(input.substring(index,input.length()));
		
		return rotateStringHelper(firstRotate + secondRotate);
		
	}
	
	private static String rotateStringHelper(String input){
		String result = "";
		for(int i = input.length() - 1; i > -1; i--){
			result += input.charAt(i);
		}
		return result;
	}
	
}
