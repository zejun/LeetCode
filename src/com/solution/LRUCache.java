package com.solution;

import java.util.Map;
import java.util.Stack;

public class LRUCache {
	
	private int cacheCap;
	private Stack<DataPair> cache;
	
	public LRUCache(int capacity) {
        this.cacheCap = capacity;
        this.cache = new Stack<DataPair>();
        
    }
    
    public int get(int key) {
    	int result = -1;
    	
    	for(int i=0;i<this.cacheCap;i++){
    		
    	}
    	
    	
        return result;
    }
    
    public void set(int key, int value) {
        boolean exist = false;
        Stack<DataPair> tem = new Stack<DataPair>();
    	
    	for(int i=0;i<this.cacheCap;i++){
    		DataPair check = cache.pop();
    		//got the same key
    		if(check.key==key){
    			
    			exist = true;
    			break;
    		}else{
    			tem.push(check);
    		}
    	}
    	
    	//check whether it exist
    	if(exist){
    		while(!tem.empty()){
    			cache.push(tem.pop());
    		}
    		cache.push(new DataPair(key,value));
    	}else{
    		boolean isFirst = true;
    		
    		while(!tem.empty()){
    			if(isFirst){
    				tem.pop();
    				isFirst=false;
    			}else{
    				cache.push(tem.pop());
    			}
    		}
    		cache.push(new DataPair(key,value));
    	}
    	
    }
    
    private class DataPair{
    	public int key;
    	public int val;
    	
    	public DataPair(int key,int val){
    		this.key = key;
    		this.val = val;
    	}

    }
    

}


