package com.solution;

import java.util.HashMap;

public class LRCCatchList {

	int capacity, size;
    ListNode tail;
    ListNode dummy;
    HashMap<Integer, ListNode> table;
    
    
    public LRCCatchList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        table = new HashMap<Integer, ListNode>();
        dummy = new ListNode(0, 0);
        
        dummy.next = tail;
        tail = dummy;
        
    }
    
    public int get(int key) {
        if (table.containsKey(key)){
            
            ListNode current = table.get(key);
            ListNode tem = dummy.next;
            
            //handle tail
            if (tail == current){
                tail = current.prev;
            }
            
            current.prev.next = current.next;
            dummy.next = current;
            current.next = tem;
            current.prev = dummy;
            tem.prev = current;
            
            return table.get(key).val;
        } else {
            return -1;
        }
    }
    
    public void set(int key, int value) {
        if (size == 0){
            ListNode newNode = new ListNode(key,value);
            table.put(key, newNode);
            dummy.next = newNode;
            newNode.prev = dummy;
            tail = newNode;
            size ++;
        } else if (size < capacity){
            
            if (table.containsKey(key)){
                ListNode current = table.get(key);
                
                if (tail == current){
                    tail = current.prev;
                }
                
                ListNode tem = dummy.next;
                current.prev.next = current.next;
                dummy.next = current;
                current.prev = dummy;
                tem.prev = current;
                
                
            } else {
                ListNode current = new ListNode(key, value);
                table.put(key, current);
                
                ListNode tem = dummy.next;
                dummy.next = current;
                current.next = tem;
                current.prev = dummy;
                tem.prev = current;
                
                size ++;
            }
        } else if (size == capacity){
            if (table.containsKey(key)){
                ListNode current = table.get(key);
                
                if (tail == current){
                    tail = tail.prev;
                }
                
                ListNode tem = dummy.next;
                current.prev.next = current.next;
                dummy.next = current;
                current.prev = dummy;
                tem.prev = current;
            } else {
                ListNode current = new ListNode(key, value);
                
                table.put(key, current);
                
                ListNode tem = dummy.next;
                dummy.next = current;
                current.next = tem;
                current.prev = dummy;
                tem.prev = current;
                
                //remove node
                table.remove(tail.key);
                tail = tail.prev;
                tail.next = null;
                
            }
        }
    }
    
    class ListNode{
        public int val,key;
        public ListNode next;
        public ListNode prev;
        public ListNode(int key,int val){
            this.key = key;
            this.val = val;
        }
    }
	
}
