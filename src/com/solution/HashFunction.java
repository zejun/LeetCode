package com.solution;

public class HashFunction {

	public static int hashCode(char[] key,int HASH_SIZE) {
        // write your code here
        if (key == null || key.length == 0){
            return 0;
        }
        
        long sum = 0;
        
        for (int i = key.length - 1; i >= 0; i--){
            sum += helper((long)key[i], key.length - i - 1, HASH_SIZE);
        }
        
        return (int)sum;
    }
    
    private static long helper(long key, int pow, int HASH_SIZE){
        long ret = (long) ((key * Math.pow(33, pow)) % HASH_SIZE);
        return ret;
    }
	
}
