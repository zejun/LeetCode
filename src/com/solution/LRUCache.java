package com.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;



/**
 * This solution use two stack to approach the task
 * There is a better solution to solve the problem with hash map and two way linked list. 
 * Any get and set method could be done with O(1) time complexity
 * @author zejunzhang
 *
 */
public class LRUCache {
	
	public int cacheCap;
	public Stack<DataPair> cache;
	
	
	public LRUCache(int capacity) {
        this.cacheCap = capacity;
        this.cache = new Stack<DataPair>();
        
    }
    
    public int get(int key) {
    	int result = -1;
    	Stack<DataPair> temCache = new Stack<DataPair>();
    	
    	for(int i=0;i<this.cacheCap;i++){
    		if(!cache.isEmpty()){
    			DataPair temPair = cache.pop();
        		if(temPair.key==key){
        			result = temPair.val;
        			break;
        		}else{
        			temCache.push(temPair);
        		}
    		}else{
    			break;
    		}
    	}
    	
    	while(!temCache.isEmpty()){
    		cache.push(temCache.pop());
    	}
    	if(result!=-1){
    		cache.push(new DataPair(key,result));
    	}
    	
    	
        return result;
    }
    
    public void set(int key, int value) {
        boolean isExist = false;
        Stack<DataPair> tem = new Stack<DataPair>();
    	
    	for(int i=0;i<this.cacheCap;i++){
    		
    		if(!cache.isEmpty()){
    			DataPair check = cache.pop();
        		//got the same key
        		if(check.key==key){
        			isExist = true;
        			break;
        		}else{
        			tem.push(check);
        		}
    		}else{
    			break;
    		}
    		
    		
    	}
    	
    	//check whether it exist
    	if(isExist){
    		while(!tem.empty()){
    			cache.push(tem.pop());
    		}
    		cache.push(new DataPair(key,value));
    	}else{
    		
    		if(tem.size()>=cacheCap){
    			boolean isFirst = true;
        		int index = 0;
    			
        		while(!tem.empty()&&index<cacheCap){
        			if(isFirst){
        				tem.pop();
        				isFirst=false;
        			}else{
        				cache.push(tem.pop());
        			}
        		}
        		cache.push(new DataPair(key,value));
    		}else{
    			while(!tem.empty()){
    				cache.push(tem.pop());
        		}
        		cache.push(new DataPair(key,value));
    		}
    		
    		
    	}
    	
    }
    
    public class DataPair{
    	public int key;
    	public int val;
    	
    	public DataPair(int key,int val){
    		this.key = key;
    		this.val = val;
    	}

    }
    

}


