package com.solution;

import java.util.Map;
import java.util.Stack;

public class LRUCache {
	
	private int cacheCap;
	private Stack<Map> cache;
	
	public LRUCache(int capacity) {
        this.cacheCap = capacity;
        this.cache = new Stack<Map>();
        
    }
    
    public int get(int key) {
    	int result = -1;
    	
    	for(int i=0;i<this.cacheCap;i++){
    		
    	}
    	
    	
        return result;
    }
    
    public void set(int key, int value) {
        
    	
    	
    }
    

}


