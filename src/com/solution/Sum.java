package com.solution;

import java.util.Hashtable;

public class Sum {
	
	public static int[] twosum(int[] numbers, int target){
		if (numbers == null){
            return null;
        }
        int[] result = new int[2];
        Hashtable<Integer, Integer> map = new Hashtable<Integer, Integer>();
        
        for (int i = 0; i < numbers.length; i++){
            map.put(numbers[i], i);
        }
        
        for (int i = 0; i < numbers.length; i++){
            if (map.contains(target - numbers[i])){
                result[0] = Math.min(i + 1, map.get(target - numbers[i]) + 1);
                result[1] = Math.max(i + 1, map.get(target - numbers[i]) + 1);
                if (result[0] == result[1]){
                    continue;
                }
                return result;
            } 
        }
        return result;
	}

}
