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
public class LRUCacheLinkedList {
	
	public int cacheCap;
	public Stack<DataPair> cache;
	private HashMap<Integer,DataPair> dataMap;
	public DataPair head = new DataPair(-1,-1);
	private DataPair tail = new DataPair(-1,-1);
	
	
	public LRUCacheLinkedList(int capacity) {
        this.cacheCap = capacity;
        this.cache = new Stack<DataPair>();
        this.dataMap = new HashMap<Integer,DataPair>();
        this.head.next = tail;
        this.tail.prev = head;
        
    }
    
    public int get(int key) {
    	if(!dataMap.containsKey(key)){
    		return -1;
    	}else{
    		DataPair tem = dataMap.get(key);
    		
    		//remove tem from linked list and put it at head of it.
    		tem.prev.next = tem.next;
    		tem.next.prev = tem.prev;
    		
    		tem.next = head.next;
    		head.next.prev = tem;
    		head.next = tem;
    		tem.prev = head;
    		
    		return tem.val;
    	}
    }
    
    public void set(int key, int value) {
    	
    	if( get(key) != -1) {
            dataMap.get(key).val = value;
            return;
        }else{
        	if(dataMap.size()>=cacheCap){
        		DataPair newData = new DataPair(key,value);
        		
        		dataMap.remove(tail.prev.key);
        		dataMap.put(key, newData);
        		
        		//add new add to head
        		newData.prev = head;
        		newData.next = head.next;
        		head.next.prev = newData;
        		head.next = newData;
        		
        		
        		//remove tail's prev point
        		tail.prev.prev.next = tail;
        		tail.prev = tail.prev.prev;
        		
        		
        		
        		
        	}else{
        		DataPair newData = new DataPair(key,value);
        		head.next.prev = newData;
        		newData.next = head.next;
        		newData.prev = head;
        		head.next = newData;
        		
        		dataMap.put(key, newData);
        		
        	}
        }
    	
    }
    
    public class DataPair{
    	public int key;
    	public int val;
    	public DataPair prev;
    	public DataPair next;
    	
    	public DataPair(int key,int val){
    		this.key = key;
    		this.val = val;
    		this.prev = null;
    		this.next = null;
    	}

    }
    

}


