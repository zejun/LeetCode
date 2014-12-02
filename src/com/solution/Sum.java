package com.solution;

import java.util.Arrays;
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
        	
            if (map.containsKey(target - numbers[i])){
            	
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
	
	//3 sum closest to target
	public int threeSumClosest(int[] numbers, int target) {
        // write your code here
        
        if (numbers == null || numbers.length < 3){
            return 0;
        }
        
        Arrays.sort(numbers);
        int closest = numbers[0] + numbers[1] + numbers[2];
        
        for (int i = 0; i < numbers.length; i++){
            int left = i + 1;
            int right = numbers.length - 1;
            
            while (left < right){
                int sum = numbers[i] + numbers[left] + numbers[right];
                int dist = Math.abs(target - sum);
                if (Math.abs(target - sum) < Math.abs(target - closest)){
                    closest = sum;
                } 
                left++;
                right--;
            }
            
        }
        return closest;
    }

}
